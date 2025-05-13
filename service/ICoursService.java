package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Cours;

import java.util.List;

public interface ICoursService {
    void creerCours(Cours cours);
    void validerCours(Cours cours);
    void supprimerCours(Long id);
    Cours getCoursById(Long id);
    List<Cours> getAllCours();
    List<Cours> getCoursParEtat(String etat);
}
