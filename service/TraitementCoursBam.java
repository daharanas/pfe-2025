package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import jdk.jpackage.internal.Log;


import jxl.Cell;
import jxl.NumberCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;
//import ma.eai.midw.log.Log;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.daoChange.IDaoChange;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.EtatFichier;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.SensFichier;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.TypeFichier;
import ma.eai.titre.manex.batchs.utile.Constante;
import ma.eai.titre.manex.batchs.utile.MailProcessing;
import ma.eai.titre.manex.batchs.utile.utility;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Cours;
//import ma.eai.titres.manex.entities.CoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Devise;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours.*;
//import ma.eai.titres.manex.entities.FichierEchange;
//import ma.eai.titres.manex.entities.Margecndstd;
//import ma.eai.titres.manex.entities.Margegab;
//import ma.eai.titres.manex.entities.type.BoolString;
//import ma.eai.titres.manex.entities.type.EtatFichier;
//import ma.eai.titres.manex.entities.type.SensFichier;
//import ma.eai.titres.manex.entities.type.TypeFichier;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.FichierEchange;

import org.springframework.transaction.annotation.Transactional;

public class TraitementCoursBam implements ITraitementCoursBam {
	private IDaoChange daoChange;
	
	/**
	 * @return the daoChange
	 */
	public IDaoChange getDaoChange() {
		return daoChange;
	}

	/**
	 * @param daoChange
	 *            the daoChange to set
	 */
	public void setDaoChange(IDaoChange daoChange) {
		this.daoChange = daoChange;
	}
	
	@Transactional
	public boolean listeRepertoire(File repertoire) throws Exception {	
		if (repertoire.isDirectory()) {
			File[] list = repertoire.listFiles();			
			if (list != null) {
				for (int i = 0; i < list.length; i++) {					
					if (list[i].getName().substring(0,8).contains(Constante.name_file_in)) {						
						return traiteFichierExcel(list[i]);
					}
				}				
			} else {
				Log.info("##################### Erreur de lecture. repertoire "	+ repertoire + " : ");
				return false;
			}
		} else {
			Log.info("##################### c'est pas un repertoire Merci de verifier le fichier de config  ");
			return false;
		}
		Log.info("Attention  Pas de fichier cours BAM  ");
		return false;
	}
	


public boolean  traiteFichierExcel(File files) throws BiffException, IOException {
	
	Log.info("################################### Traitement du Fichier Excel : "	+ files.getName() + " ##############################");
	
	
	MathContext mc = new MathContext(8, RoundingMode.FLOOR);	
	String s_date_cours = "";
	String file_mame_in_long = "";		
	String devise = "";		
	Double com_bkamR = 0D;
	Double com_bkamV = 0D;
	
	
	FichierEchange fichierEchange;

	try {			
		file_mame_in_long = Constante.path_file_in + files.getName();		
		/* Récupération du classeur Excel (en lecture) */		 
		WorkbookSettings ws = new WorkbookSettings();
		ws.setLocale(new Locale(Constante.path_file_in, Constante.path_file_save));
		Workbook w = Workbook.getWorkbook(new File(file_mame_in_long), ws);	      
		/* Un fichier excel est composé de plusieurs feuilles, on y accède de la manière suivante*/	    
		Sheet s = w.getSheet(0);

		Cell cellBkamR = null;
		Cell cellBkamV = null;
		Cell cellDevise = null;
		/* On accède aux cellules avec la méthode getCell(indiceColonne, indiceLigne) */	    
		s_date_cours = s.getCell(1, 0).getContents();	    
		cellBkamR =s.getCell(1, 1);
		cellBkamV =s.getCell(1, 2);	    
		com_bkamR =	((NumberCell)cellBkamR).getValue();	
		com_bkamV = ((NumberCell)cellBkamV).getValue();
		Log.info(" - Fichier : "+ files.getName() + " - Date cours Fichier : "+ s_date_cours +" - La commission BKAM Rachat Bank : " + (new DecimalFormat("0.####")).format(com_bkamR)  + " - La commission BKAM Vente Bank : " + (new DecimalFormat("0.####")).format(com_bkamV)  );			
		Calendar calendarCoursFichier = Calendar.getInstance();
		calendarCoursFichier.setTime(utility.stringToDate(s_date_cours));
		Calendar toDay = Calendar.getInstance();
		toDay.setTime(utility.stringToDate(utility.dateToString(new Date())) );
		fichierEchange = new FichierEchange();
		fichierEchange.setCoursDateGen(calendarCoursFichier);
		fichierEchange.setDateStockage(Calendar.getInstance());			
		fichierEchange.setNomFichier(files.getName());
		fichierEchange.setSensFichier(SensFichier.E);
		fichierEchange.setTypeFichier(TypeFichier.CB);
		fichierEchange.setCdfFichier("78000");
		Log.info(" calendarCoursFichier.compareTo( toDay) : " + calendarCoursFichier.compareTo( toDay) );
		if( calendarCoursFichier.compareTo( toDay)>0 ){
			Log.info(" - Date Cours Recu antérieur : Date jour :" + utility.dateToString(Calendar.getInstance().getTime()  ) + " Date Recu Fichier BAM : " + utility.dateToString(calendarCoursFichier.getTime()  )  );
			fichierEchange.setEtatFichier(EtatFichier.R);
			fichierEchange.setMotifRejet("Date Cours Recu antérieur : Date jour :" + utility.dateToString(Calendar.getInstance().getTime()  ) + " Date Recu Fichier BAM : " + utility.dateToString(calendarCoursFichier.getTime()  )  );
			daoChange.addObject(fichierEchange);
			utility.depalcerIN(files.getAbsolutePath(), Constante.path_file_save + files.getName());
			return false;
		}			
		if(com_bkamR>1|| com_bkamV>1){
			Log.info(" - Marge RB VB SDM non valide : com_bkamR : " + com_bkamR + " com_bkamV : " + com_bkamV);
			fichierEchange.setEtatFichier(EtatFichier.R);
			fichierEchange.setMotifRejet("Marge RB VB SDM non valide : com_bkamR : " + com_bkamR + " com_bkamV : " + com_bkamV);
			daoChange.addObject(fichierEchange);
			utility.depalcerIN(files.getAbsolutePath(), Constante.path_file_save + files.getName());
			return false;
		}
		Date myDate = new Date();
		for (int i = 4; i < s.getRows(); ++i){
			 Cell[] row = s.getRow(i);	    
			 Cell cellmin = s.getCell(3, i);
			 Cell cellmax = s.getCell(4, i);
			 cellDevise  = s.getCell(2, i);
			 if (row.length > 0){
				CoursBam cbam = new CoursBam();
				double coursMin = ((NumberCell)cellmin).getValue();
				double coursMax = ((NumberCell)cellmax).getValue();
				BigDecimal coursMinBigDecimal =  new BigDecimal((new DecimalFormat("0.####")).format(coursMin).replace(",",".")); //( new BigDecimal(coursMin) ).setScale(5,BigDecimal.ROUND_UP);
				BigDecimal coursMaxBigDecimal =  new BigDecimal((new DecimalFormat("0.####")).format(coursMax).replace(",",".")); // ( new BigDecimal(coursMax) ).setScale(5,BigDecimal.ROUND_UP);
				
				String ss= (new DecimalFormat("0.####")).format(com_bkamR);
				Log.info(" ss " + ss);
				//COM_SDM
				BigDecimal com_bkamRBigDecimal = ( (new BigDecimal((new DecimalFormat("0.####")).format(com_bkamR).replace(",","."))).multiply(new BigDecimal("100")) );// ( (new BigDecimal((new DecimalFormat("0.####")).format(com_bkamR) )).multiply(new BigDecimal("100")) );
				BigDecimal com_bkamVBigDecimal = ( (new BigDecimal((new DecimalFormat("0.####")).format(com_bkamV).replace(",","."))).multiply(new BigDecimal("100")) );
				//COURS_MID
				BigDecimal midBamBigDecimal =  coursMinBigDecimal.add(coursMaxBigDecimal).divide(new BigDecimal("2") );
				
				//RB VB
				BigDecimal achatInterRB = midBamBigDecimal.multiply(
														(new BigDecimal("1")).subtract( com_bkamRBigDecimal.divide(new BigDecimal("100")))).setScale(6,RoundingMode.HALF_UP);
				BigDecimal venteInterVB = midBamBigDecimal.multiply(
														(new BigDecimal("1")).add( com_bkamVBigDecimal.divide(new BigDecimal("100")))).setScale(6,RoundingMode.HALF_DOWN);
				//MMAX +MMIN
				BigDecimal margeAchatMaxBam = (midBamBigDecimal.subtract(coursMinBigDecimal)).divide(midBamBigDecimal,10,RoundingMode.HALF_UP).multiply(new BigDecimal("100"));
				BigDecimal margeVenteMaxBam = (coursMaxBigDecimal.subtract(midBamBigDecimal)).divide(midBamBigDecimal,10,RoundingMode.HALF_UP).multiply(new BigDecimal("100"));
				//margeAchatMaxBam = new BigDecimal(String.valueOf(margeAchatMaxBam)).setScale(2, BigDecimal.ROUND_FLOOR);
				//margeVenteMaxBam = new BigDecimal(String.valueOf(margeVenteMaxBam)).setScale(2, BigDecimal.ROUND_FLOOR);
				
				Log.info(" margeAchatMaxBam : " + margeAchatMaxBam + " margeVenteMaxBam :" + margeVenteMaxBam);
				
				//BigDecimal margeAchatMax = (margeAchatMaxBam.subtract(com_bkamRBigDecimal).divide((new BigDecimal("1")).subtract(com_bkamRBigDecimal.divide(new BigDecimal("100"),8,BigDecimal.ROUND_FLOOR )),2,BigDecimal.ROUND_FLOOR ));
				//BigDecimal margeVenteMax = (margeVenteMaxBam.add(com_bkamRBigDecimal).divide((new BigDecimal("1")).subtract(com_bkamRBigDecimal.divide(new BigDecimal("100"),8,BigDecimal.ROUND_FLOOR )),2,BigDecimal.ROUND_FLOOR ));
				BigDecimal margeAchatMax = (margeAchatMaxBam.subtract(com_bkamRBigDecimal).divide((new BigDecimal("1")).subtract(com_bkamRBigDecimal.divide(new BigDecimal("100"),10,BigDecimal.ROUND_FLOOR )),10,BigDecimal.ROUND_HALF_UP ));
				BigDecimal margeVenteMax = (margeVenteMaxBam.add(com_bkamRBigDecimal).divide((new BigDecimal("1")).subtract(com_bkamRBigDecimal.divide(new BigDecimal("100"),10,BigDecimal.ROUND_FLOOR )),10,BigDecimal.ROUND_HALF_UP ));
				
				
				
				
				Log.info(">>1 margeVenteMaxBam " + margeVenteMaxBam +" com_bkamRBigDecimal " + com_bkamRBigDecimal + " margeAchatMaxBam " + margeAchatMaxBam );
				Log.info(" com_bkamRBigDecimal.divide(new BigDecimal(100),8,BigDecimal.ROUND_UP ) : " + com_bkamRBigDecimal.divide(new BigDecimal("100"),8,BigDecimal.ROUND_FLOOR ));
				Log.info("  ( new BigDecimal(com_bkamR) ).setScale(2,BigDecimal.ROUND_UP); : "  +  ( new BigDecimal(com_bkamR) ).setScale(2,BigDecimal.ROUND_FLOOR));
				
				cbam.setCoursMinBam( coursMinBigDecimal );
				cbam.setCoursMaxBam( coursMaxBigDecimal );
				cbam.setCoursMidBam( midBamBigDecimal );	            
				cbam.setMargeAchatMaxBam( margeAchatMaxBam  );
				cbam.setMargeVenteMaxBam( margeVenteMaxBam  );
				cbam.setMargeAchatMax( margeAchatMax );
				cbam.setMargeVenteMax( margeVenteMax );
				devise = cellDevise.getContents();
				String[] codeBam = devise.split(" ");
				
				cbam.setDevise((Devise) daoChange.getDeviseList(" from Devise d where d.codebam='" + codeBam[2]	+ "' ").get(0));
				
				cbam.setDatesaisi(Calendar.getInstance().getTime());
				cbam.setDatecoursBam(calendarCoursFichier);
				cbam.setDateArrete(Calendar.getInstance());
				cbam.setCoursrb(achatInterRB);
				cbam.setCoursvb(venteInterVB);
				cbam.setNomfichier(files.getName().trim());
				cbam.setType("CHARGEMENT");
				cbam.setEtatCours("N");
				cbam.setMargerb(com_bkamRBigDecimal);
				cbam.setMargevb(com_bkamVBigDecimal);
									
				Margecndstd margecndstd = daoChange.getMargeStd();
				Margegab margeGab = daoChange.getListMarge().get(0);
				
				Cours cours = new Cours();
				
				cours.setDatecours(		cbam.getDatecoursBam().getTime());
				cours.setDatesaiisie(	cbam.getDatesaisi());
//				cours.setCoursacs(		cbam.getCoursrb().multiply(((new BigDecimal(1)).subtract((margecndstd.getMsa().divide(new BigDecimal(100),mc)), mc)), mc));
//				cours.setCoursvcs(		cbam.getCoursrb().multiply(((new BigDecimal(1)).add((margecndstd.getMsv().divide(new BigDecimal(100), mc)), mc)), mc));
//				cours.setCoursasd(		cbam.getCoursrb().multiply(((new BigDecimal(1)).subtract((margecndstd.getMssd().divide(new BigDecimal(100), mc)), mc)), mc));				
				cours.setCoursacs(		(cbam.getCoursrb().multiply(((new BigDecimal(1)).subtract((margecndstd.getMsa().divide(new BigDecimal(100)))))).setScale(5,RoundingMode.HALF_UP )));
				
					
				cours.setCoursvcs(		(cbam.getCoursrb().multiply((new BigDecimal(1)).add(margecndstd.getMsv().divide(new BigDecimal(100))))).setScale(5, RoundingMode.HALF_DOWN));
				cours.setCoursasd(		(cbam.getCoursrb().multiply(((new BigDecimal(1)).subtract((margecndstd.getMssd().divide(new BigDecimal(100))))))).setScale(5, RoundingMode.HALF_UP));
				cours.setCoursRb(		cbam.getCoursrb());
				cours.setCoursVb(		cbam.getCoursvb());
				cours.setDevise(		cbam.getDevise());
				cours.setCoursBam(		cbam );
				cours.setDateValidCours(myDate);

				cours.setCoursGab( cbam.getCoursrb().multiply((new BigDecimal(1)).subtract(margeGab.getTauxMargeGab(), mc), mc));
				
				cours.setCoursMinBam(cbam.getCoursMinBam());
				cours.setCoursMaxBam(cbam.getCoursMaxBam());
				cours.setCoursMidBam(cbam.getCoursMidBam());
				cours.setMargeAchatMaxBam(cbam.getMargeAchatMaxBam());
				cours.setMargeVenteMaxBam(cbam.getMargeVenteMaxBam());
				cours.setMargeAchatMax(cbam.getMargeAchatMax()) ;
				cours.setMargeVenteMax(cbam.getMargeVenteMax()) ;
				
				Log.info("  Acs/Min compareTo " + cours.getCoursacs().compareTo(cours.getCoursMinBam()) );
				Log.info("  Vcs/Min compareTo " + cours.getCoursvcs().compareTo(cours.getCoursMaxBam()) );
				if(cours.getCoursacs().compareTo(cours.getCoursMinBam()) <0 )
					cours.setCoursacs(cours.getCoursMinBam());
				
				if(cours.getCoursvcs().compareTo(cours.getCoursMaxBam()) >0 )
					cours.setCoursvcs(cours.getCoursMaxBam());
				
				if(cours.getCoursGab().compareTo(cours.getCoursMinBam()) <0 )
					cours.setCoursGab(cours.getCoursMinBam());
				
				
				cours.setEtatcours("E");
				cours.setEtatCalcul("N");
				cours.setEtatGabGen("N");
				cours.setEtatDecl(BoolString.N);
				
				daoChange.addObject(cbam);
				daoChange.addObject(cours);
				
				}
		 }
		try{		
			sendEmailFichierBam(file_mame_in_long,calendarCoursFichier.getTime() , daoChange.getMails());
		}catch(Exception e){
			Log.info("Exception FCT sendEmailFichierBam : " + e.getMessage());
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			Log.info("Exception FCT sendEmailFichierBam : " +  errors.toString() );
			System.out.println("************************************");
			System.out.println("**          Mail not Send 1       **");
			System.out.println("************************************");
		}
		 
		 
		 boolean deplace = utility.depalcerIN(files.getAbsolutePath(), Constante.path_file_save + files.getName());
		 Log.info(" Fichier deplace : "  + deplace);
		 return true;
		
	}catch(Exception e){
		Log.info("Exception BATCH ChargCoursAutoBam : " + e.getMessage());		
		StringWriter errors = new StringWriter();
		e.printStackTrace(new PrintWriter(errors));
		Log.info("Exception BATCH ChargCoursAutoBam : " +  errors.toString() );
		e.printStackTrace();
		
		boolean deplace = utility.depalcerIN(files.getAbsolutePath(), Constante.path_file_save + files.getName());
		Log.info(" Fichier deplace : "  + deplace);
		return false;
	}
      
} 

public static void sendEmailFichierBam(String filename,Date dateCours, List<String> mails) throws ParseException {
	 	MailProcessing mailProcess = null;
	StringBuilder corpMail = new StringBuilder();
	Properties prop = new Properties();
	SimpleDateFormat formateDMY  = new SimpleDateFormat("dd/MM/yyyy");
    try {
    	  utility.InitConstante();
             prop.load(new FileInputStream(Constante.fileConfigMail));
      } catch (IOException e) {
            Log.info("############### Erreur chargement du fichier '"+ Constante.fileConfigMail +"' "+ e);
            System.out.println("************************************");
 			System.out.println("**          Mail not Send 2       **");
 			System.out.println("************************************");
             return;
      }
      
	String smtpServer= prop.getProperty("smtpHostName");
	String smtpPort  = prop.getProperty("smtpPort");
	String userAuth  = prop.getProperty("smtpAuthUser");
	String userPwd   = prop.getProperty("smtpAuthPwd");
	String emailfrom = prop.getProperty("emailFromAddress");   
	String objetMail = prop.getProperty("successObjetMail");   
	corpMail.append(prop.getProperty("successCorpMail01") );
	corpMail.append(" ");
	corpMail.append( formateDMY.format(dateCours));
	corpMail.append( prop.getProperty("successCorpMail02"));                  
	   
	File[] fileAttachement = new  File[1];
    fileAttachement[0] = new File(filename);	           
	mailProcess = new MailProcessing(smtpServer, smtpPort, userAuth, userPwd, emailfrom, "");
       
	
	for (String mail:mails){
		String[] mailDest = new String[1];
		mailDest[0] = mail; 
		 try {
	          if(mailProcess.postMail(mailDest, mailDest, objetMail, corpMail.toString(), "",fileAttachement))	        	  	  
	                Log.info("##  ## Envoi e-Mail : " + objetMail + "  To "+ mailDest[0] +" Cc "+  mailDest[0] + " est effectue avec succes ");	               
	          else	        	
	                Log.info("##  ## Error Error  Envoi e-Mail : " + objetMail + "  To "+ mailDest[0] + " !!!");              
	         
          }catch(Exception e){
        	  Log.info("catch...Envoi e-Mail .##  ##...."+e.getMessage()+ "   mailDest[0] " + mailDest[0] );
        	  System.out.println("************************************");
        	  System.out.println("**          Mail not Send 3       **");
        	  System.out.println("************************************");
          }
	
	}	          
	
 
}
		 		
}



