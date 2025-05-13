package ma.eai.titre.manex.batchs.ChargCoursAutoBam.daoChange;

import java.util.Date;
import java.util.List;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBamTemp;
import ma.eai.titres.manex.entities.CoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Devise;
import ma.eai.titres.manex.entities.Margecndstd;
import ma.eai.titres.manex.entities.Margegab;




public interface IDaoChange  {
	
	
	
	public void addObject(Object object);
	
	
	public void updateObject(Object object) ;
	public void saveCoursBam(CoursBam coursBam);

	public void deleteCoursBamTemp(Long idCoursBamTemp);
	public CoursBamTemp findCoursBamTempById(Long idCoursBamTemp);



	public void removeObject(Object object) ;

	public void update_querry(String s);
	
	public  List<Devise> getDeviseList(String query);
	
	public  List<CoursBam> getListFichier(String query) ;
	
	//ADD
//	public void initialisationMarge();
	List<CoursBam> getListCoursBAM(Date dateCours);
	public Margecndstd getMargeStd();
	public List<CoursBam> getCoursBAM();
	public List<Margegab> getListMarge();
	public void MajCoursBAMToValide(Date coursDate);
	public void DeleteCoursBamNonValide(Date coursDate);
	public List<CoursBam> getListCoursBam_A_Valide(String etat);
	
	public List<String> getMails();
	

	
}
