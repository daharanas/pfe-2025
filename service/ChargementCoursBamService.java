package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours.ChargementCoursBamDao;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.ChargementCourBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.StatusChargement;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.exception.ValidationException;


import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

import static ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.StatusChargement.V;

@Stateless
public class ChargementCoursBamService implements IChargmentCoursBamService {
    @Inject
    private ChargementCoursBamDao chargementCoursBamDao;
    @Override
    public  void enregistrerChargementCours(ChargementCourBam chargmentCours){
        chargementCoursBamDao.create(chargmentCours);
    }
    @Override
    public ChargementCourBam recupererChargmentCours(Long id) throws ValidationException {
        ChargementCourBam c = chargementCoursBamDao.findById(id);
        if (c == null) {
            throw new ValidationException("Chargement introuvable pour l'ID : " + id);
        }
        return c;
    }
    @Override
    public      List<ChargementCourBam> getChargementCoursEtatByStatus(StatusChargement statusChargement){
        return chargementCoursBamDao.findByChargementStatus(statusChargement);
    }
    @Override
    public List<ChargementCourBam> getAllChargementCours(){
        return chargementCoursBamDao.findAll();
    }
    @Override
    public void marquerCommeValider(ChargementCourBam chargementCours) throws ValidationException {
        if (chargementCours == null) {
            throw new ValidationException("Chargement introuvable pour validation.");
        }
        if (chargementCours.getStatus() != V) {
            chargementCours.setStatus(V);
        }
        chargementCoursBamDao.update(chargementCours);
    }
    @Override
    public ChargementCourBam getDernierChargement() {
        return chargementCoursBamDao.findLatest();
    }



}
