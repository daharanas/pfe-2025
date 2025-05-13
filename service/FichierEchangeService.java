package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours.FichierEchangeIDao;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.FichierEchange;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.EtatFichier;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class FichierEchangeService implements IFichierEchangeService{
    @Inject
    private FichierEchangeIDao dao;

    @Override
    public void enregistrerFichier(FichierEchange fichier) {
        dao.create(fichier);
    }

    @Override
    public void marquerCommeTraite(Long idFichier) {
        FichierEchange fichier = dao.findById(idFichier);
        if (fichier != null) {
            fichier.setEtatFichier(EtatFichier.valueOf("TRAITE"));
            dao.update(fichier);
        }
    }

    @Override
    public FichierEchange getFichierById(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<FichierEchange> getFichiersParEtat(String etat) {
        return dao.findByEtat(etat);
    }

    @Override
    public List<FichierEchange> getFichiersParNom(String nomFichier) {
        return dao.findByNomFichier(nomFichier);
    }

    @Override
    public List<FichierEchange> getAll() {
        return dao.findAll();
    }
}
