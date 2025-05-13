package ma.eai.titre.manex.batchs.ChargCoursAutoBam.DaoCours;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursFixingTemp;

import java.util.List;

public interface CoursFixTemIDao {
    public CoursFixingTemp save(CoursFixingTemp entity);
    public CoursFixingTemp findById(Long id);
    public List<CoursFixingTemp> findAll();
    public void delete(Long id);
    public List<CoursFixingTemp> findByDeviseCode(String codeDevise);
    public void update(CoursFixingTemp entity);

}
