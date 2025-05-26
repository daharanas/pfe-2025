package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.ChargementCoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.ChargementCourBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.StatusChargement;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.exception.ValidationException;

import java.util.List;

public interface IChargmentCoursBamService {
    // Consultation
    Flux rechercherChargements(Flux flux);
    Flux getChargementById(Flux flux);

    // Création / mise à jour
    void enregistrerChargement(ChargementCourBam entity);

    // Accès aux cours
    Flux getCoursParChargement(Flux flux);

    // Validation métier
    Flux validerChargement(Flux flux);
    Flux rejeterChargement(Flux flux);

    // Nettoyage / annulation
    void supprimerChargement(Long id) throws ValidationException;

}
