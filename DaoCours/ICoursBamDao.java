package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.filter.CoursFilter;

import java.util.List;

public interface ICoursBamDao {
    List<CoursBam> findByCriteria(CoursFilter filter, int offset, int maxResults);
    Long countByCriteria(CoursFilter filter);
    CoursBam findById(Long id);
    CoursBam save(CoursBam entity);
    List<CoursBam> findByChargementId(Long idChargement);
}
