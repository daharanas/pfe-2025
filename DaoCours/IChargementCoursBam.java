package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.ChargementCourBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.StatusChargement;

import java.util.List;

public interface IChargementCoursBam {
   void create(ChargementCourBam chargementCourBam);
   void update(ChargementCourBam chargementCourBam);
   void delete(ChargementCourBam chargementCourBam);
   ChargementCourBam findById(Long id);
   List<ChargementCourBam> findAll();
   List<ChargementCourBam> findByChargementStatus(StatusChargement status);



}
