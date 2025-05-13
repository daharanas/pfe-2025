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

}
