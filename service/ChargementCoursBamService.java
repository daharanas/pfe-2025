package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours.IChargementCoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours.ICoursBamDao;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours.ICoursBamTempDao;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.ChargementCoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBamTemp;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.EtatCours;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.StatusChargement;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.exception.ValidationException;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.filter.ChargementCoursFilter;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.xmlMapping.Flux;


import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;

@Stateless
public class ChargementCoursBamService  implements IChargmentCoursBamService {

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

            List<ChargementCoursBam> chargements = chargementDao.findByCriteria(
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
        ChargementCoursBam chargement = chargementDao.findById(id);
        fluxSortie.getObjet().setChargement(chargement);
        return fluxSortie;
    }
    @Override
    public Flux getCoursParChargement(Flux flux) {
        Flux fluxSortie = new Flux(true);

        try {
            // 1. Extraire l'ID du chargement
            Long idChargement = flux.getObjet().getChargement().getIdCoursCargement();

            if (idChargement == null) {
                throw new ValidationException("ID du chargement manquant dans le flux");
            }

            // 2. Récupérer
            //les cours liés à ce chargement
            List<CoursBam> coursList = coursBamDao.findByChargementId(idChargement);

            // 3. Alimenter la sortie
            fluxSortie.getObjet().setCoursBamList(coursList);
            fluxSortie.getObjet().setNbResultats(coursList.size());

        } catch (Exception e) {
            throw new RuntimeException("Erreur lors de la récupération des cours liés au chargement : " + e.getMessage(), e);
        }

        return fluxSortie;
    }
    @Override
    public Flux rejeterChargement(Flux flux) {
        Flux fluxSortie = new Flux(true);

        try {
            Long idChargement = flux.getObjet().getChargement().getIdCoursCargement();

            if (idChargement == null) {
                throw new ValidationException("ID du chargement manquant dans le flux");
            }

            // 1. Charger le chargement concerné
            ChargementCoursBam chargement = chargementDao.findById(idChargement);

            if (chargement == null) {
                throw new ValidationException("Aucun chargement trouvé avec l'ID : " + idChargement);
            }

            // 2. Supprimer tous les cours temporaires associés
            for (CoursBamTemp temp : chargement.getCoursBamTemp()) {
                coursBamTempDao.delete(temp);
            }

            // 3. Mettre à jour le statut
            chargement.setStatus(StatusChargement.REJETE);
            chargement.setSasValidation(flux.getEntete().getUser_sas());
            chargement.setDateSaisie(new Date());

            // 4. Sauvegarder
            chargementDao.save(chargement);

            // 5. Retourner le flux
            fluxSortie.getObjet().setChargement(chargement);

        } catch (ValidationException e) {
            throw new RuntimeException("Erreur de validation lors du rejet du chargement : " + e.getMessage(), e);
        } catch (Exception e) {
            throw new RuntimeException("Erreur technique lors du rejet du chargement : " + e.getMessage(), e);
        }

        return fluxSortie;
    }
    @Override
    public void supprimerChargement(Long id) throws ValidationException {
        if (id == null) {
            throw new ValidationException("ID de chargement non fourni.");
        }

        ChargementCoursBam chargement = chargementDao.findById(id);

        if (chargement == null) {
            throw new ValidationException("Chargement introuvable pour l'ID : " + id);
        }

        // Supprimer tous les cours temporaires liés
        List<CoursBamTemp> coursTempList = chargement.getCoursBamTemp();
        if (coursTempList != null) {
            for (CoursBamTemp temp : coursTempList) {
                coursBamTempDao.delete(temp);
            }
        }

        // Supprimer le chargement lui-même
        chargementDao.remove(chargement);
    }
      


    @Override
    public void enregistrerChargement(ChargementCoursBam entity) {
        chargementDao.save(entity);
    }

    @Override
    public Flux validerChargement(Flux flux) {
        Flux fluxSortie = new Flux(true);

        Long idChargement = flux.getObjet().getChargement().getIdCoursCargement();
        ChargementCoursBam chargement = chargementDao.findById(idChargement);

        if (chargement == null) {
            throw new ValidationException("Chargement introuvable avec l'id : " + idChargement);
        }

        List<CoursBam> coursValides = new ArrayList<>();

        for (CoursBamTemp temp : chargement.getCoursBamTemp()) {
            if (!"T".equals(temp.getEtatCoursBam())) continue;

            CoursBam cours = new CoursBam();
            cours.setDevise(temp.getDevise());
            cours.setDateCoursBam(temp.getDatecoursBamTemp().getTime());
            cours.setCoursMidBam(temp.getMid());
            cours.setCoursrb(temp.getRb());
            cours.setCoursvb(temp.getVb());
            cours.setAcs(temp.getAcs());
            cours.setVcs(temp.getVcs());
            cours.setEtatCoursBam(EtatCours.T);
            cours.setSource(temp.getSource());
            cours.setChargement(chargement);

            coursBamDao.save(cours);
            coursValides.add(cours);
        }

        chargement.setStatus(StatusChargement.VALIDE);
        chargement.setSasValidation(flux.getEntete().getUser_sas());
        chargement.setDateSaisie(new Date());
        chargementDao.save(chargement);

        for (CoursBamTemp temp : chargement.getCoursBamTemp()) {
            coursBamTempDao.delete(temp);
        }

        fluxSortie.getObjet().setCoursBamList(coursValides);
        fluxSortie.getObjet().setChargement(chargement);
        return fluxSortie;
    }
}
