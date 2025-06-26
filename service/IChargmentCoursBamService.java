package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.ChargementCoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.exception.ValidationException;

public interface IChargmentCoursBamService {
    // Consultation
    Flux rechercherChargements(Flux flux);
    Flux getChargementById(Flux flux);

    // Création / mise à jour
    void enregistrerChargement(ChargementCoursBam entity);

    // Accès aux cours
    Flux getCoursParChargement(Flux flux);

    // Validation métier
    Flux validerChargement(Flux flux);
    Flux rejeterChargement(Flux flux);

    // Nettoyage / annulation
    void supprimerChargement(Long id) throws ValidationException;

}
