package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours.CoursIDao;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Cours;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@Stateless
public class CoursService implements ICoursService {

    @Inject
    private CoursIDao coursDao;

    @Override
    public void creerCours(Cours cours) {
        coursDao.saveCours(cours);
    }

    @Override
    public void validerCours(Cours cours) {
        cours.setEtatcours("VALIDE");
        coursDao.updateCours(cours);
    }

    @Override
    public void supprimerCours(Long id) {
        coursDao.deleteCours(id);
    }

    @Override
    public Cours getCoursById(Long id) {
        return coursDao.findById(id);
    }

    @Override
    public List<Cours> getAllCours() {
        return coursDao.findAll();
    }

    @Override
    public List<Cours> getCoursParEtat(String etat) {
        return coursDao.findByetatCours(etat);
    }
}
