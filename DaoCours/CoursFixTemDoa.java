package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursFixingTemp;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Devise;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import java.util.List;


@Stateless

public class CoursFixTemDoa  implements CoursFixTemIDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public CoursFixingTemp save(CoursFixingTemp entity){
        if (entity.getIdFixTemp() == null || entity.getIdFixTemp() == 0) {
            entityManager.persist(entity);
        }
        return entity;
    }
    @Override
    public CoursFixingTemp findById(Long id){
        CoursFixingTemp entity = entityManager.find(CoursFixingTemp.class, id);
        if (entity == null) {
            throw new EntityNotFoundException("CoursFixingTemp introuvable pour l'id " + id);
        }
        return entity;
    }
    @Override
    public List<CoursFixingTemp> findAll() {
        String s = "SELECT c FROM CoursFixingTemp c"; // utiliser des guillemets doubles pour les chaînes
        Query query = entityManager.createQuery(s);
        List<CoursFixingTemp> result = query.getResultList(); // getResultList(), pas getAllResult()
        return result;
    }

    @Override
    public void delete(Long id){

        CoursFixingTemp entity = findById(id);
        entityManager.remove(entity);
    }
    @Override
    public List<CoursFixingTemp> findByDeviseCode(String codeDevise) {
        Query query = entityManager.createQuery("SELECT c FROM CoursFixingTemp c WHERE c.devise.code = :code");
        query.setParameter("code", codeDevise);
        return query.getResultList();

    }




        @Override
        public void update(CoursFixingTemp entity) {
            if (entity == null || entity.getIdFixTemp() == null) {
                throw new IllegalArgumentException("L'entité ou son ID ne peut pas être null.");
            }

            // Vérifie si l'entité existe dans la base
            CoursFixingTemp existing = entityManager.find(CoursFixingTemp.class, entity.getIdFixTemp());

            if (existing == null) {
                throw new EntityNotFoundException("Aucune entité CoursFixingTemp trouvée avec l'ID : " + entity.getIdFixTemp());
            }

            // Log de debug ou audit (si besoin)
            System.out.println("Mise à jour de l'entité CoursFixingTemp avec ID : " + entity.getIdFixTemp());

            // Mise à jour propre
            entityManager.merge(entity);
        }

    }





