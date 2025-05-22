package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.Dto.CoursBamDto;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBamTemp;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.exception.ValidationException;

import java.util.List;

public interface ICoursBamService {
    // cours validés
    Flux rechercherCours(Flux flux);
    Flux getCoursById(Flux flux);

    // cours temporaires
    Flux rechercherCoursTemp(Flux flux);
    Flux getCoursTempById(Flux flux);
    void saveCoursTemp(CoursBamTemp entity);
    void deleteCoursTemp(Long id) throws ValidationException;

    // traitement métier
    Flux validerCoursTemp(Flux flux);
    Flux archiverCoursDuJour(Flux flux);
}
