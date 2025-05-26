package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.ChargementCourBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.StatusChargement;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Map;
@Stateless

public class ChargementCoursBamDao implements IChargementCoursBam {
    @PersistenceContext(unitName = "ChangeCentral")
    private EntityManager em;

    @Override
    public List<ChargementCourBam> findByCriteria(ChargementCoursFilter filter, int offset, int maxResults) {
        Map<String, Object> params = new HashMap<>();
        StringBuilder sb = new StringBuilder("SELECT c FROM ChargementCourBam c WHERE 1=1");
        buildWhereClause(filter, params, sb);
        sb.append(" ORDER BY c.dateSaisie DESC");

        Query query = em.createQuery(sb.toString());
        applyParams(query, params);
        query.setFirstResult(offset);
        query.setMaxResults(maxResults);
        return query.getResultList();
    }

    @Override
    public Long countByCriteria(ChargementCoursFilter filter) {
        Map<String, Object> params = new HashMap<>();
        StringBuilder sb = new StringBuilder("SELECT COUNT(c) FROM ChargementCourBam c WHERE 1=1");
        buildWhereClause(filter, params, sb);

        Query query = em.createQuery(sb.toString());
        applyParams(query, params);
        return (Long) query.getSingleResult();
    }

    @Override
    public ChargementCourBam findById(Long id) {
        return em.find(ChargementCourBam.class, id);
    }

    @Override
    public void save(ChargementCourBam entity) {
        em.persist(entity);
    }

    private void buildWhereClause(ChargementCoursFilter filter, Map<String, Object> params, StringBuilder sb) {
        if (filter.getStatut() != null && !filter.getStatut().trim().isEmpty()) {
            sb.append(" AND c.status = :statut");
            params.put("statut", StatusChargement.valueOf(filter.getStatut()));
        }

        if (filter.getSasSaisie() != null && !filter.getSasSaisie().trim().isEmpty()) {
            sb.append(" AND c.sasSaisie LIKE :sasSaisie");
            params.put("sasSaisie", "%" + filter.getSasSaisie().trim() + "%");
        }

        if (filter.getSasValidation() != null && !filter.getSasValidation().trim().isEmpty()) {
            sb.append(" AND c.sasValidation LIKE :sasValidation");
            params.put("sasValidation", "%" + filter.getSasValidation().trim() + "%");
        }

        if (filter.getDateDebut() != null) {
            sb.append(" AND c.dateSaisie >= :dateDebut");
            params.put("dateDebut", filter.getDateDebut().getTime());
        }

        if (filter.getDateFin() != null) {
            sb.append(" AND c.dateSaisie <= :dateFin");
            params.put("dateFin", filter.getDateFin().getTime());
        }
    }

    private void applyParams(Query query, Map<String, Object> params) {
        for (Map.Entry<String, Object> e : params.entrySet()) {
            query.setParameter(e.getKey(), e.getValue());
        }
    }

}
