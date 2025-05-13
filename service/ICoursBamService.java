package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.Dto.CoursBamDto;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBam;

import java.util.List;

public interface ICoursBamService {
    void creerCours(CoursBam cours);
    void modifierCours(CoursBam cours);
    void supprimerCours(Long id);
    CoursBam getCoursById(Long id);
    List<CoursBam> getAllCours();
    CoursBamDto toDto(CoursBam cours);
    CoursBam fromDto(CoursBamDto dto);
}
