package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours.CoursDao;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours.ICoursBamDao;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.Dto.CoursBamDto;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.ChargementCourBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBam;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class CoursBamService implements ICoursBamService {
    @Inject
    private ICoursBamDao dao;
    @Inject
    private ChargementCourBam chargementCourBam;



    @Override
    public void creerCours(CoursBam cours) {

        dao.save(cours);
    }

    @Override
    public void modifierCours(CoursBam cours) {
        dao.update(cours);
    }

    @Override
    public void supprimerCours(Long id) {
        dao.delete(id);
    }

    @Override
    public CoursBam getCoursById(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<CoursBam> getAllCours() {
        return dao.findAll();
    }

    @Override
    public CoursBamDto toDto(CoursBam cours) {
        CoursBamDto dto = new CoursBamDto();
        dto.setIdcoursbam(cours.getIdcoursbam());
        dto.setCoursrb(cours.getCoursrb());
        dto.setCoursvb(cours.getCoursvb());
        dto.setCoursMidBam(cours.getCoursMidBam());
        dto.setCoursMinBam(cours.getCoursMinBam());
        dto.setCoursMaxBam(cours.getCoursMaxBam());
        dto.setMargeAchatMaxBam(cours.getMargeAchatMaxBam());
        dto.setMargeVenteMaxBam(cours.getMargeVenteMaxBam());
        dto.setMargeAchatMax(cours.getMargeAchatMax());
        dto.setMargeVenteMax(cours.getMargeVenteMax());
        return dto;
    }

    @Override
    public CoursBam fromDto(CoursBamDto dto) {
        CoursBam cours = new CoursBam();
        cours.setIdcoursbam(dto.getIdcoursbam());
        cours.setCoursrb(dto.getCoursrb());
        cours.setCoursvb(dto.getCoursvb());
        cours.setCoursMinBam(dto.getCoursMidBam());
        cours.setCoursMinBam(dto.getCoursMinBam());
        cours.setCoursMaxBam(dto.getCoursMaxBam());
        cours.setMargeAchatMaxBam(dto.getMargeAchatMaxBam());
        cours.setMargeVenteMaxBam(dto.getMargeVenteMaxBam());
        cours.setMargeAchatMax(dto.getMargeAchatMax());
        cours.setMargeVenteMax(dto.getMargeVenteMax());
        return cours;
    }
}
