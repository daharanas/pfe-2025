package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.ChargementCoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.ChargementCourBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.StatusChargement;

import java.util.List;

public interface IChargmentCoursBamService {
    void enregistrerChargementCours(ChargementCourBam chargmentCours);
    ChargementCourBam recupererChargmentCours(Long id);
    List<ChargementCourBam> getChargementCoursEtatByStatus(StatusChargement statusChargement);
    List<ChargementCourBam> getAllChargementCours();
    void marquerCommeValider(ChargementCourBam chargementCours);

}
