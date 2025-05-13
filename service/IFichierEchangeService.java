package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.FichierEchange;

import java.util.List;

public interface IFichierEchangeService {
    void enregistrerFichier(FichierEchange fichier);
    void marquerCommeTraite(Long idFichier);
    FichierEchange getFichierById(Long id);
    List<FichierEchange> getFichiersParEtat(String etat);
    List<FichierEchange> getFichiersParNom(String nomFichier);
    List<FichierEchange> getAll();

}
