package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Cours;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class CoursDao implements CoursIDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveCours(Cours cours) {
        entityManager.persist(cours);
    }

    @Override
    public void updateCours(Cours cours) {
        entityManager.merge(cours);
    }

    @Override
    public void deleteCours(Long id) {
        Cours cours = findById(id);
        if (cours != null) {
            entityManager.remove(cours);
        }
    }

    @Override
    public List<Cours> findAll() {
        String s = "SELECT c FROM Cours c";
        Query query = entityManager.createQuery(s);
        return query.getResultList();
    }

    @Override
    public Cours findById(Long id) {
        return entityManager.find(Cours.class, id);
    }

    @Override
    public List<Cours> findByetatCours(String etatCours) {
        String s = "SELECT c FROM Cours c WHERE c.etatcours = :etat";
        Query query = entityManager.createQuery(s);
        query.setParameter("etat", etatCours);
        List<Cours> list = query.getResultList();
        return list;
    }
}
