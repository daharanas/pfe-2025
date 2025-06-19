package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Devise;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class DeviseDoa implements DeviseIDoa {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Devise findById(Long id) {
        return em.find(Devise.class, id);
    }

    @Override
    public List<Devise> findAll() {
        String s = "SELECT d FROM Devise d";
        Query query = em.createQuery(s);
        List<Devise> devises = query.getResultList();
      return devises;
    }

    @Override
    public List<Devise> findByCodeIso(String codeIso) {
        String s = "SELECT d FROM Devise d WHERE d.codeIso = :code";
        Query query = em.createQuery(s);
        query.setParameter("code", codeIso);
        List<Devise> devises = query.getResultList();
        return devises;
    }

    @Override
    public void save(Object object) {
        em.persist(object);
    }

    @Override
    public void update(Object object)
    {
        em.merge(object);
    }
    @Override
    public <E> E get(Class<E> entityClass, Long pk) {
        E entity = this.em.find(entityClass, pk);
        if (entity == null) {
            String msg = "Err, '" + entityClass + "' object with id '" + pk + "' not found...";
            throw new EntityNotFoundException(msg);
        }
        return entity;
    }
    @Override
    public void delete(Object object) {

            em.remove(object);
        }

}
