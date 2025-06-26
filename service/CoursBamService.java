package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours.ICoursBamDao;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours.ICoursBamTempDao;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBamTemp;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.exception.ValidationException;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.filter.CoursFilter;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.xmlMapping.Flux;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.InputMismatchException;
import java.util.List;

@Stateless
public class CoursBamService implements ICoursBamService {
    @EJB
    private ICoursBamDao coursBamDao;

    @EJB
    private ICoursBamTempDao coursBamTempDao;

    @Override
    public Flux rechercherCours(Flux flux) {
        Flux fluxSortie = new Flux(true);
        CoursFilter filter = flux.getObjet().getCoursFilter();
        Pager pager = filter.getPager();

        if (pager == null) {
            throw new InputMismatchException("Erreur : pagination requise");
        }

        Long total = coursBamDao.countByCriteria(filter);
        pager.setTotalSize(total.intValue());

        List<CoursBam> resultats = coursBamDao.findByCriteria(filter, pager.getIndex() - 1, pager.getPageSize());

        fluxSortie.getObjet().setPager(pager);
        fluxSortie.getObjet().setCoursBamList(resultats);
        fluxSortie.getObjet().setNbResultats(total);
        return fluxSortie;
    }

    @Override
    public Flux rechercherCoursTemp(Flux flux) {
        Flux fluxSortie = new Flux(true);
        CoursFilter filter = flux.getObjet().getCoursFilter();
        Pager pager = filter.getPager();

        if (pager == null) {
            throw new InputMismatchException("Erreur : pagination requise");
        }

        Long total = coursBamTempDao.countByCriteria(filter);
        pager.setTotalSize(total.intValue());

        List<CoursBamTemp> resultats = coursBamTempDao.findByCriteria(filter, pager.getIndex() - 1, pager.getPageSize());

        fluxSortie.getObjet().setPager(pager);
        fluxSortie.getObjet().setCoursBamTemp(resultats);
        fluxSortie.getObjet().setNbResultats(total);
        return fluxSortie;
    }
    @Override
    public Flux archiverCoursDuJour(Flux flux) {
        Flux fluxSortie = new Flux(true);
        CoursFilter filter = flux.getObjet().getCoursFilter();

        if (filter.getDateDebut() == null) {
            throw new IllegalArgumentException("Date de traitement obligatoire pour l'archivage.");
        }

        // On cherche tous les cours non archivés pour la date fournie
        filter.setStatut("C"); // Seulement les cours confirmés (validés)

        List<CoursBam> coursDuJour = coursBamDao.findByCriteria(filter, 0, Integer.MAX_VALUE);

        for (CoursBam cours : coursDuJour) {
            cours.setEtatCoursBam("A"); // A = Archivé
            coursBamDao.save(cours); // On utilise save (persist) ou update selon ton implémentation exacte
        }

        fluxSortie.getObjet().setCoursBamList(coursDuJour);
        return fluxSortie;
    }

    @Override
    public Flux getCoursById(Flux flux) {
        Flux fluxSortie = new Flux(true);
        Long id = flux.getObjet().getCoursBam().getId();
        CoursBam cours = coursBamDao.findById(id);
        fluxSortie.getObjet().setCoursBam(cours);
        return fluxSortie;
    }

    @Override
    public Flux getCoursTempById(Flux flux) {
        Flux fluxSortie = new Flux(true);
        Long id = flux.getObjet().getCoursBamTemp().getId();
        CoursBamTemp coursTemp = coursBamTempDao.findById(id);
        fluxSortie.getObjet().setCoursBamTemp(coursTemp);
        return fluxSortie;
    }

    @Override
    public Flux validerCoursTemp(Flux flux) {
        Flux fluxSortie = new Flux(true);
        CoursBamTemp temp = flux.getObjet().getCoursBamTemp();

        // Validation métier (exemple)
        if (temp.getDevise() == null || temp.getDatecours() == null) {
            throw new IllegalArgumentException("Devise ou date du cours manquante");
        }

        // Conversion CoursBamTemp → CoursBam
        CoursBam valide = new CoursBam();
        valide.setDevise(temp.getDevise());
        valide.setDateCoursBam(temp.getDatecoursBamTemp());
        valide.setCoursMidBam(temp.getIdCoursBamTemp());
        valide.setCoursrb(temp.getRb());
        valide.setVb(temp.getVb());
        valide.setAcs(temp.getAcs());
        valide.setVcs(temp.getVcs());
        valide.setEtatCoursBam("C"); // C = confirmé
        valide.setSource(temp.getSource());

        // Sauvegarde
        coursBamDao.save(valide);

        // Suppression ou archivage du temporaire
        coursBamTempDao.delete(temp);

        fluxSortie.getObjet().setCoursBam(valide);
        return fluxSortie;
    }
    public List<CoursBamTemp> findAllCoursTemp() {
        return coursBamTempDao.findByCriteria(new CoursFilter(), 0, Integer.MAX_VALUE);
    }

    public CoursBamTemp findCoursTempById(Long id) throws ValidationException {
        CoursBamTemp temp = coursBamTempDao.findById(id);
        if (temp == null) {
            throw new ValidationException("Cours temporaire introuvable avec l'id : " + id);
        }
        return temp;
    }

    public void saveCoursTemp(CoursBamTemp entity) {
        coursBamTempDao.save(entity);
    }

    public void deleteCoursTemp(Long id) throws ValidationException {
        CoursBamTemp temp = coursBamTempDao.findById(id);
        if (temp == null) {
            throw new ValidationException("Impossible de supprimer : cours temporaire introuvable.");
        }
        coursBamTempDao.delete(temp);
    }
}
