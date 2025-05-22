package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.ChargementCourBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.StatusChargement;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class ChargementCoursBamDao implements IChargementCoursBam {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void create(ChargementCourBam chargementCourBam) {
        entityManager.persist(chargementCourBam);
    }
    @Override
    public void  update(ChargementCourBam chargementCourBam) {
        entityManager.merge(chargementCourBam);
    }
    @Override
    public void delete(ChargementCourBam chargementCourBam) {
        entityManager.remove(chargementCourBam);
    }
    @Override
    public ChargementCourBam findById(Long id) {
        String s = "select c from ChargementCourBam c where c.id = :id";
        Query query = entityManager.createQuery(s);
        query.setParameter("id", id);
        ChargementCourBam c = (ChargementCourBam) query.getSingleResult();
        return c;
    }
    @Override
    public List<ChargementCourBam> findAll() {
        String s = "select c from ChargementCourBam c";
        Query query = entityManager.createQuery(s);
        List<ChargementCourBam> list = query.getResultList();
        return list;
    }
    @Override
    public List<ChargementCourBam> findByChargementStatus(StatusChargement status) {
        String s = "select c from ChargementCourBam c where c.status = :status";
        Query query = entityManager.createQuery(s);
        query.setParameter("status", status);
        List<ChargementCourBam> list = query.getResultList();
        return list;
    }
    @Override
    public ChargementCourBam findLatest() {
        try {
            Query query = entityManager.createQuery(
                    "SELECT c FROM ChargementCourBam c ORDER BY c.dateSaisie DESC"
            );
            query.setMaxResults(1);
            List result = query.getResultList();
            return result.isEmpty() ? null : (ChargementCourBam) result.get(0);
        } catch (Exception e) {
            return null;
        }
    }




    @Override
    public List<ChargementCourBam> findAll(int offset, int maxResults) {
        Query query = entityManager.createQuery("SELECT c FROM ChargementCourBam c");
        query.setFirstResult(offset);
        query.setMaxResults(maxResults);
        return query.getResultList();
    }

}
