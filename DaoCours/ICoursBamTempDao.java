package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBamTemp;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.filter.CoursFilter;

import java.util.List;

public interface ICoursBamTempDao {
    List<CoursBamTemp> findByCriteria(CoursFilter filter, int offset, int maxResults);
    Long countByCriteria(CoursFilter filter);
    CoursBamTemp findById(Long id);
    void delete(CoursBamTemp entity);
    CoursBamTemp save(CoursBamTemp entity);
}
