package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.FichierEchange;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class FichierEchangeDoa implements FichierEchangeIDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void create(FichierEchange fichier) {
        entityManager.persist(fichier);
    }

    @Override
    public FichierEchange findById(Long id) {
        return entityManager.find(FichierEchange.class, id);
    }

    @Override
    public List<FichierEchange> findAll() {
        String s = "SELECT f FROM FichierEchange f";
         Query query = entityManager.createQuery(s);
        return query.getResultList();

    }

    @Override
    public void update(FichierEchange fichier) {
        entityManager.merge(fichier);
    }

    @Override
    public void delete(FichierEchange fichier) {
        entityManager.remove(entityManager.contains(fichier) ? fichier : entityManager.merge(fichier));
    }

    @Override
    public List<FichierEchange> findByNomFichier(String nomFichier) {
        String s = "SELECT f FROM FichierEchange f WHERE f.nomFichier = :nom";
        Query query = entityManager.createQuery(s);
        query.setParameter("nom", nomFichier);
        List<FichierEchange> list = query.getResultList();
        return list ;

    }

    @Override
    public List<FichierEchange> findByEtat(String etat) {
        String s = "SELECT f FROM FichierEchange f WHERE f.etatFichier = :etat";
        Query query = entityManager.createQuery(s);
        query.setParameter("etat", etat);
        List<FichierEchange> list = query.getResultList();
        return list;
    }
}
