package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBam;

import java.util.List;

public interface ICoursBamDao {
    void save(CoursBam cours);
    void update(CoursBam cours);
    void delete(Long id);
    CoursBam findById(Long id);
    List<CoursBam> findAll();
}
