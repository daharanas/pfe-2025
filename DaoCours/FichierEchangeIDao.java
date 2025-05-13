package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.FichierEchange;

import java.util.List;

public interface FichierEchangeIDao {

    void create(FichierEchange fichier);

    FichierEchange findById(Long id);

    List<FichierEchange> findAll();

    void update(FichierEchange fichier);

    void delete(FichierEchange fichier);

    // Exemples de méthodes personnalisées
    List<FichierEchange> findByNomFichier(String nomFichier);

    List<FichierEchange> findByEtat(String etat);
}

