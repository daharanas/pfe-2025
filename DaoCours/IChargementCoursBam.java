package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.ChargementCourBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.StatusChargement;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.filter.ChargementCoursFilter;

import java.util.List;

public interface IChargementCoursBam {
   List<ChargementCourBam> findByCriteria(ChargementCoursFilter filter, int offset, int maxResults);
   Long countByCriteria(ChargementCoursFilter filter);
   ChargementCourBam findById(Long id);
   void save(ChargementCourBam entity);

}
