package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours.ChargementCoursBamDao;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours.IChargementCoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours.ICoursBamDao;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours.ICoursBamTempDao;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.ChargementCourBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBamTemp;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.StatusChargement;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.exception.ValidationException;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.filter.ChargementCoursFilter;


import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;

import static ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.StatusChargement.V;

@Stateless
public class ChargementCoursBamService  implements ChargementCoursBamService {

    @EJB
    private IChargementCoursBam chargementDao;

    @EJB
    private ICoursBamDao coursBamDao;

    @EJB
    private ICoursBamTempDao coursBamTempDao;

    @Override
    public Flux rechercherChargements(Flux flux) {
        Flux fluxSortie = new Flux(true);

        ChargementCoursFilter filter = flux.getObjet().getChargementCoursFilter();
        Pager pager = filter.getPager();

        if (pager == null) {
            throw new InputMismatchException("Erreur : pagination manquante dans le filtre.");
        }

        try {
            Long total = chargementDao.countByCriteria(filter);
            pager.setTotalSize(total.intValue());

            List<ChargementCourBam> chargements = chargementDao.findByCriteria(
                    filter,
                    pager.getIndex() - 1,
                    pager.getPageSize()
            );

            fluxSortie.getObjet().setPager(pager);
            fluxSortie.getObjet().setChargements(chargements);
            fluxSortie.getObjet().setNbResultats(total);

        } catch (ValidationException e) {
            throw new RuntimeException("Erreur lors du comptage ou de la récupération des chargements : " + e.getMessage(), e);
        }

        return fluxSortie;
    }

    @Override
    public Flux getChargementById(Flux flux) {
        Flux fluxSortie = new Flux(true);
        Long id = flux.getObjet().getChargement().getIdCoursCargement();
        ChargementCourBam chargement = chargementDao.findById(id);
        fluxSortie.getObjet().setChargement(chargement);
        return fluxSortie;
    }

    @Override
    public void enregistrerChargement(ChargementCourBam entity) {
        chargementDao.save(entity);
    }

    @Override
    public Flux validerChargement(Flux flux) {
        Flux fluxSortie = new Flux(true);

        Long idChargement = flux.getObjet().getChargement().getIdCoursCargement();
        ChargementCourBam chargement = chargementDao.findById(idChargement);

        if (chargement == null) {
            throw new ValidationException("Chargement introuvable avec l'id : " + idChargement);
        }

        List<CoursBam> coursValides = new ArrayList<>();

        for (CoursBamTemp temp : chargement.getCoursBamTemps()) {
            if (!"T".equals(temp.getEtatcours())) continue;

            CoursBam cours = new CoursBam();
            cours.setDevise(temp.getDevise());
            cours.setDateCoursBam(temp.getDatecoursBamTemp().getTime());
            cours.setCoursMidBam(temp.getMid());
            cours.setRb(temp.getRb());
            cours.setVb(temp.getVb());
            cours.setAcs(temp.getAcs());
            cours.setVcs(temp.getVcs());
            cours.setEtatcours("C");
            cours.setSource(temp.getSource());
            cours.setChargement(null);

            coursBamDao.save(cours);
            coursValides.add(cours);
        }

        chargement.setStatus(StatusChargement.VALIDE);
        chargement.setSasValidation(flux.getEntete().getUser_sas());
        chargement.setDateSaisie(new Date());
        chargementDao.save(chargement);

        for (CoursBamTemp temp : chargement.getCoursBamTemps()) {
            coursBamTempDao.delete(temp);
        }

        fluxSortie.getObjet().setCoursBamList(coursValides);
        fluxSortie.getObjet().setChargement(chargement);
        return fluxSortie;
    }
}
