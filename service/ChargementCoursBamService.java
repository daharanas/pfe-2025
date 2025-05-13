package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours.ChargementCoursBamDao;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.ChargementCourBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.StatusChargement;


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
    public ChargementCourBam recupererChargmentCours(Long id){
        return chargementCoursBamDao.findById(id);
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
    public void marquerCommeValider(ChargementCourBam chargementCours){
        if (chargementCours.getStatus() != V ){
            chargementCours.setStatus(V);
        }
        chargementCoursBamDao.update(chargementCours);

    }



}
