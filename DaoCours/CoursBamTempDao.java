package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBamTemp;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.filter.CoursFilter;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Stateless
public class CoursBamTempDao implements ICoursBamTempDao {
    @PersistenceContext(unitName = "ChangeCentral")
    private EntityManager em;

    @Override
    public List<CoursBamTemp> findByCriteria(CoursFilter filter , int offset, int maxResults) {
        Map<String, Object> params = new HashMap<String, Object>();
        StringBuilder jpql = new StringBuilder("SELECT c FROM CoursBamTemp c WHERE 1=1");
        buildWhereClause(filter, params, jpql);
        jpql.append(" ORDER BY c.datecours DESC");

        Query query = em.createQuery(jpql.toString());
        applyParams(query, params);
        query.setFirstResult(offset);
        query.setMaxResults(maxResults);

        return query.getResultList();
    }

    @Override
    public Long countByCriteria( CoursFilter filter) {
        Map<String, Object> params = new HashMap<String, Object>();
        StringBuilder jpql = new StringBuilder("SELECT COUNT(c) FROM CoursBamTemp c WHERE 1=1");
        buildWhereClause(filter, params, jpql);

        Query query = em.createQuery(jpql.toString());
        applyParams(query, params);

        return (Long) query.getSingleResult();
    }

    private void buildWhereClause(CoursFilter filter, Map<String, Object> params, StringBuilder sb) {
        if (filter.getDevise() != null) {
            sb.append(" AND c.devise.codeDevise = :devise");
            params.put("devise", filter.getDevise());
        }

        if (filter.getDateDebut() != null) {
            sb.append(" AND c.datecours >= :dateDebut");
            params.put("dateDebut", filter.getDateDebut());
        }

        if (filter.getDateFin() != null) {
            sb.append(" AND c.datecours <= :dateFin");
            params.put("dateFin", filter.getDateFin());
        }

        if (filter.getStatut() != null) {
            sb.append(" AND c.etatcours = :statut");
            params.put("statut", filter.getStatut());
        }

        if (filter.getSource() != null) {
            sb.append(" AND c.source = :source");
            params.put("source", filter.getSource());
        }

        if (filter.getTypeCours() != null) {
            sb.append(" AND c.typeCours = :typeCours");
            params.put("typeCours", filter.getTypeCours());
        }

        if (filter.getIdCours() != null) {
            sb.append(" AND c.id = :idCours");
            params.put("idCours", filter.getIdCours());
        }
    }

    private void applyParams(Query query, Map<String, Object> params) {
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public CoursBamTemp findById(Long id) {
        return em.find(CoursBamTemp.class, id);
    }

    @Override
    public void delete(CoursBamTemp entity) {
        em.remove(em.contains(entity) ? entity : em.merge(entity));
    }

    @Override
    public CoursBamTemp save(CoursBamTemp entity) {
        em.persist(entity);
        return entity;
    }

}
