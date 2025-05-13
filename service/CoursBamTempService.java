package ma.eai.titre.manex.batchs.ChargCoursAutoBam.service;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.ChargementCourBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBamTemp;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours.CoursBamTempDoa;


import javax.ejb.Stateless;
import java.util.List;
import javax.inject.Inject;

@Stateless

public class CoursBamTempService implements ICoursBamTempService {
    @Inject
    private CoursBamTempDoa coursBamTempDoa;
    @Inject
    ChargementCourBam chargementCourBam;

    @Override
    public void create(CoursBamTemp coursBamTemp) {
        coursBamTempDoa.create(chargementCourBam.getCoursBamTemp());
    }

    @Override
    public List<CoursBamTemp> findAll() {
        return coursBamTempDoa.findAll();
    }
    @Override
    public CoursBamTemp findById(Long id) throws Exception {
        CoursBamTemp entity = coursBamTempDoa.findById(id);
        if (entity == null) {
            throw new Exception("Aucun cours trouvé avec l’ID : " + id);
        }
        return entity;
    }

    @Override
    public void save(CoursBamTemp entity) {
        coursBamTempDoa.save(entity);
    }

    @Override
    public void delete(Long id) throws Exception {
        CoursBamTemp entity = coursBamTempDoa.findById(id);
        if (entity == null) {
            throw new Exception("Aucun cours trouvé pour ID : " + id);
        }
        coursBamTempDoa.delete(entity);
    }
}
