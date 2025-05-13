package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Cours;

import java.util.List;

public interface CoursIDao {
  void saveCours(Cours cours);
  void updateCours(Cours cours);
  void deleteCours(Long id);
  List<Cours> findAll();
  Cours findById(Long id);
  List<Cours> findByetatCours(String etatCours);


}
