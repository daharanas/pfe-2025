package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursFixingTemp;

import java.util.List;

public interface ICoursFixingTempService {
    List<CoursFixingTemp> findAll();
    CoursFixingTemp findById(Long id) throws Exception;
    void save(CoursFixingTemp entity);
    void delete(CoursFixingTemp entity) throws Exception;
}

