package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.ChargementCourBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBamTemp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityNotFoundException;

@Stateless
public class CoursBamTempDoa implements CoursBamTempIDao {
    @PersistenceContext
private EntityManager entityManager;

@Override
public CoursBamTemp save(CoursBamTemp entity){
    entityManager.persist(entity);
    return entity ;
}
@Override
public CoursBamTemp findById(long id) {
    CoursBamTemp entity = entityManager.find(CoursBamTemp.class, id);
    if (entity == null) {
        throw new EntityNotFoundException("CoursBamTemp avec l'id " + id + " introuvable !");
    }
    return entity;
}
@Override
public List<CoursBamTemp> findByDevise(String codeDevise){
    Query query = entityManager.createQuery("SELECT c FROM CoursBamTemp c WHERE c.devise.code = :code");
    query.setParameter("code", codeDevise);
    return query.getResultList();

}
@Override
public List<CoursBamTemp> findAll() {
   String s = " SELECT c FROM CoursBamTemp c";
    Query query = entityManager.createQuery(s);
    List<CoursBamTemp> result = query.getResultList();
    return result;
}
@Override
public void delete(CoursBamTemp coursBamTemp){
    CoursBamTemp entity = findById(coursBamTemp.getIdCoursBamTemp()); // Va lancer une exception si null
    entityManager.remove(entity);
}
@Override
    public void create(CoursBamTemp coursBamTemp){
    entityManager.persist(coursBamTemp);
}

}
