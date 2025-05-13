package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Devise;

import java.util.List;

public interface DeviseIDoa {
    Devise findById(Long id);
    List<Devise> findAll();
    List<Devise> findByCodeIso(String codeIso);
    void save(Devise devise);
    void update(Devise devise);
    void delete(Long id);
}
