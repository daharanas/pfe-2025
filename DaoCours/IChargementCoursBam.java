package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.ChargementCoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.filter.ChargementCoursFilter;

import javax.persistence.Query;
import java.util.List;
import java.util.Map;

public interface IChargementCoursBam {
   List<ChargementCoursBam> findByCriteria(ChargementCoursFilter filter, int offset, int maxResults);
   Long countByCriteria(ChargementCoursFilter filter);
   ChargementCoursBam findById(Long id);
   void save(ChargementCoursBam entity);
   void update(Object object);
   void remove (Object object);
   void applyParams(Query query, Map<String, Object> params);

}
