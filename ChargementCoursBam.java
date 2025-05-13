package ma.eai.titre.manex.batchs.ChargCoursAutoBam;

import java.io.File;
import java.util.Date;

import jdk.jpackage.internal.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//import ma.eai.midw.log.Log;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.service.ITraitementCoursBam;
import ma.eai.titre.manex.batchs.utile.Constante;
import ma.eai.titre.manex.batchs.utile.utility;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class ChargementCoursBam {


	public static void main(String[] args) {
		
		int codeExit =-1;
		
		System.out.println("#############################################################");
		System.out.println("#####      DEBUT BATCH CHARGEMENT COURS BAM         #########");
		System.out.println("#############################################################");
		
		
		Log.info("#############################################################");
		Log.info("#####      DEBUT BATCH CHARGEMENT COURS BAM         #########");
		Log.info("#############################################################");
		
		
		ApplicationContext ctx;		
		ITraitementCoursBam traitementCoursBam;				
		try {
			ctx = new ClassPathXmlApplicationContext("Application-context.xml");
			traitementCoursBam = (ITraitementCoursBam) ctx.getBean("traitementCoursBam");
			if (utility.InitConstante()){ 				 
				boolean traite = traitementCoursBam.listeRepertoire(new File(Constante.path_file_in));
				codeExit = (traite)?0:-1;
			}
			else{
				codeExit = -1;
				Log.info("############### Constant non initialise  ");
				System.out.println("**********************************");
				System.out.println("***  Constant non initialise  ****");
				System.out.println("**********************************");
			   }
			} catch (Exception e) {
	 			Log.info("Exception "+e.getMessage());
	 			e.printStackTrace();
	 		    utility.DisplayExceptionDetails(e, "MAIN");
	 		   codeExit=-1;
	 		  System.exit(codeExit);
			}finally{
								
				System.out.println("#################################################################");
				System.out.println("###########   FIN BATCH CHARGEMENT AUTOMATIQUE COURS ############");
				System.out.println("#################################################################");		
						
				Log.info("#################################################################");
				Log.info("###########   FIN BATCH CHARGEMENT AUTOMATIQUE COURS ############");
				Log.info("#################################################################");

				
				System.exit(codeExit);
			}
	}
	
	
}