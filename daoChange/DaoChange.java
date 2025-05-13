package ma.eai.titre.manex.batchs.ChargCoursAutoBam.daoChange;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBamTemp;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Devise;
import ma.eai.titre.manex.batchs.utile.utility;
//import ma.eai.titre.manex.entities.CoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Devise;
//import ma.eai.titres.manex.entities.Margecndstd;
//import ma.eai.titres.manex.entities.Margegab;






public class DaoChange implements IDaoChange {
	

	
	@PersistenceContext(unitName = "ManEx")
 	private EntityManager em;
 	
 	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public void addObject(Object object) {
		em.persist(object);
	}
	
	@Override
	public void updateObject(Object object) {
		em.merge(object);
	}

	
	public void removeObject(Object object) {
		em.remove(object);
	}

	public void update_querry(String s) {

		Query q = em.createQuery(s);
		q.executeUpdate();

		return;
	}

	
	
	public  List<Devise> getDeviseList(String query) {
		Query q = em.createQuery(query);
		return q.getResultList();
	}

	public  List<CoursBam> getListFichier(String query) {
	 
		Query q = em.createQuery(query);
		return q.getResultList();
		
	}
	
	///ADD
	
/*	public void initialisationMarge() {
		String s = " update MARGE m set m.MRAM_AGENCE=0, m.MRVM_AGENCE=0 , m.MODIF ='N' ";
		Query q = em.createNativeQuery(s);
		q.executeUpdate();
	}*/
	
	@SuppressWarnings("unchecked")
	public List<String> getMails() {
		String s = " select email from diffusion_cours where notified='0' ";
		Query q = em.createNativeQuery(s);
		return (List<String>) q.getResultList();
	}
	
	
	@Override
	public List<CoursBam> getListCoursBAM(Date dateCours) {
		
//		"from CoursBam cb where cb.etatCours='N'  and cb.datesaisi = (select max(c.datesaisi) from CoursBam c where c.etatCours = 'N') and cb.datecoursBam = to_date('"+ Utility.dateToString(dateCours, "dd/MM/yyyy")	+ "','dd/MM/YYYY')"
		
		StringBuilder sb = new StringBuilder("from CoursBam cb ");
		sb.append(" where cb.etatCours=:etatCours  ");
		sb.append(" and cb.datesaisi = (select max(c.datesaisi) from CoursBam c where c.etatCours =:etatCours) ");
		sb.append(" and cb.datecoursBam = to_date('"+ utility.dateToString(dateCours, "dd/MM/yyyy")	+ "','dd/MM/YYYY') ");
		
		//System.out.println(" sb.toString() "+sb.toString());
		
		Query query = em.createQuery(sb.toString());
		query.setParameter("etatCours", "N");
		
		return query.getResultList();
	}
	
	public Margecndstd getMargeStd() {
		String s = "from Margecndstd";
		Query q = em.createQuery(s);
		return (Margecndstd) q.getSingleResult();
	}
	@Override
	public void saveCoursBam(CoursBam coursBam) {
		em.persist(coursBam);
	}
	@Override
	public CoursBamTemp findCoursBamTempById(Long idCoursBamTemp) {
		if (idCoursBamTemp == null) {
			return null;
		}
		return em.find(CoursBamTemp.class, idCoursBamTemp);
	}

	@Override
	public void deleteCoursBamTemp(Long idCoursBamTemp) {
		CoursBamTemp temp = em.find(CoursBamTemp.class, idCoursBamTemp);
		if (temp != null) {
			em.remove(temp);
		}
	}
	@Override
	public List<Margegab> getListMarge() {
		String s = " from Margegab marges where dateMarge = (select max(dateMarge) from Margegab)";
		Query q = em.createQuery(s);
		return q.getResultList();
	}

	public void MajCoursBAMToValide(Date coursDate) {
		// String s =
		// " update COURS_BAM c set c.ETAT_COURS ='V' where c.ETAT_COURS ='N' and c.DATECOURS_BAM =  to_date('"
		// + Utility.dateToString(coursDate, "dd/MM/yyyy") +
		// "','dd/MM/YYYY')  ";

		String s = " update COURS_BAM c set c.ETAT_COURS ='V' where c.ETAT_COURS ='N' and c.DATESAISI = (select max(cb.DATESAISI) from COURS_BAM cb where cb.ETAT_COURS = 'N') and c.DATECOURS_BAM =  to_date('"
				+ utility.dateToString(coursDate, "dd/MM/yyyy") + "','dd/MM/YYYY')  ";

		Query q = em.createNativeQuery(s);

		q.executeUpdate();

	}
	
	public List<CoursBam> getListCoursBam_A_Valide(String etat) {

		// String s = " from CoursBam cb where  cb.etatCours = 'N' "
		// +
		// "and cb.datesaisi = (select max(c.datesaisi) from CoursBam c where c.etatCours = 'N') "
		// +
		// "and cb.datecoursBam >= (select max(cbam.datecoursBam) from CoursBam cbam where cbam.etatCours = 'V') ";

		String s = " from CoursBam cb where  cb.etatCours = 'N' "
				+ "and cb.datesaisi = (select max(c.datesaisi) from CoursBam c where c.etatCours = 'N') "
				+ "and (cb.datecoursBam >= (select max(cbam.datecoursBam) from CoursBam cbam where cbam.etatCours = 'V') "
				+ " or (select max(cbm.datecoursBam) from CoursBam cbm where cbm.etatCours ='V') is null ) order by iddevise";

		Query q = em.createQuery(s);
		return q.getResultList();

	}
	
	
	@Override
	public List<CoursBam> getCoursBAM(){
		String s = " from CoursBam cb  where cb.datesaisi =(select max(c.datesaisi) from CoursBam c )";
		Query q = em.createQuery(s);
		return  q.getResultList();
	}
	
	@Override
	public void DeleteCoursBamNonValide(Date coursDate) {
		String s = " DELETE FROM COURS_BAM c where c.ETAT_COURS ='N' and c.DATESAISI < (select max(cb.DATESAISI) from COURS_BAM cb where cb.ETAT_COURS = 'V') and c.DATECOURS_BAM =  to_date('"
				+ utility.dateToString(coursDate, "dd/MM/yyyy") + "','dd/MM/YYYY')  ";

		Query q = em.createNativeQuery(s);

		q.executeUpdate();

	}
	
}
