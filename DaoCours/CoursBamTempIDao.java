package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBamTemp;

import java.util.List;

public interface CoursBamTempIDao {
     void create(CoursBamTemp coursBamTemp);
    CoursBamTemp save(CoursBamTemp entity);
    CoursBamTemp findById(long id);
    List<CoursBamTemp> findAll();
     void delete(CoursBamTemp entity);
     List<CoursBamTemp> findByDevise(String codeDevise);

}
