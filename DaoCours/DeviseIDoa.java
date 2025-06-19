package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Devise;

import java.util.List;

public interface DeviseIDoa {
    Devise findById(Long id);
    List<Devise> findAll();
    List<Devise> findByCodeIso(String codeIso);
    void save(Object object);
    <E> E get(Class<E> entityClass, Long pk);
    void update(Object object);
    void delete(Object object);
}
