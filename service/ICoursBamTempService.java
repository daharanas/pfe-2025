package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBamTemp;

import java.util.List;

public interface ICoursBamTempService {
    void create(CoursBamTemp coursBamTemp);
    List<CoursBamTemp> findAll();
    CoursBamTemp findById(Long id) throws Exception;
    void
    save(CoursBamTemp entity);
    void delete(Long id) throws Exception;
}
