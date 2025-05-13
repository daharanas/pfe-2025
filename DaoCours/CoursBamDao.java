package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBam;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class CoursBamDao implements ICoursBamDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void save(CoursBam cours) {
        entityManager.persist(cours);
    }

    @Override
    public void update(CoursBam cours) {
        entityManager.merge(cours);
    }

    @Override
    public void delete(Long id) {
        CoursBam cours = findById(id);
        if (cours != null) {
            entityManager.remove(cours);
        }
    }

    @Override
    public CoursBam findById(Long id) {
        return entityManager.find(CoursBam.class, id);
    }

    @Override
    public List<CoursBam> findAll() {
        String s = "SELECT c FROM CoursBam c";
        Query query = entityManager.createQuery(s);
        List<CoursBam> coursBams = query.getResultList();
        return coursBams;

    }

}
