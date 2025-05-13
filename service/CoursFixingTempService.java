package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours.CoursFixTemIDao;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursFixingTemp;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;


@Stateless
public class CoursFixingTempService implements ICoursFixingTempService {
    @Inject
    private CoursFixTemIDao coursFixTemIDao;

    @Override
    public List<CoursFixingTemp> findAll() {
        return coursFixTemIDao.findAll();
    }

    @Override
    public CoursFixingTemp findById(Long id) throws Exception {
        CoursFixingTemp entity = coursFixTemIDao.findById(id);
        if (entity == null) {
            throw new Exception("CoursFixingTemp introuvable avec ID : " + id);
        }
        return entity;
    }

    @Override
    public void save(CoursFixingTemp entity) {
        coursFixTemIDao.save(entity);
    }

    @Override
    public void delete(CoursFixingTemp entity) throws Exception {
        if (entity == null || entity.getIdFixTemp() == null) {
            throw new Exception("Entité invalide !");
        }
        coursFixTemIDao.delete(entity.getIdFixTemp());
    }

}
