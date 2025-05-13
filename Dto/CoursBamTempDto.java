package ma.eai.titre.manex.batchs.ChargCoursAutoBam.Dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Devise;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.EtatCours;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)

public class CoursBamTempDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long idCoursBamTemp;
    private BigDecimal margerb;
    private BigDecimal margevb;
    private EtatCours etatCoursBam ;
    private BigDecimal coursrb;
    private BigDecimal coursvb;
    private Calendar dateCoursBamTemp;
    private DeviseDto devise;

    public CoursBamTempDto(Long idCoursBamTemp, BigDecimal margerb, BigDecimal margevb, BigDecimal coursrb, BigDecimal coursvb, Calendar dateCoursBamTemp , EtatCours etatCoursBam , DeviseDto devise)   {
        this.idCoursBamTemp = idCoursBamTemp;
        this.etatCoursBam = etatCoursBam;
        this.margerb = margerb;
        this.margevb = margevb;
        this.coursrb = coursrb;
        this.coursvb = coursvb;
        this.dateCoursBamTemp = dateCoursBamTemp;
        this.devise = devise;

    }



    public Long getIdCoursBamTemp() {
        return idCoursBamTemp;
    }

    public EtatCours getEtatCoursBam() {
        return etatCoursBam;
    }

    public void setEtatCoursBam(EtatCours etatCoursBam) {
        this.etatCoursBam = etatCoursBam;
    }

    public void setIdCoursBamTemp(Long idCoursBamTemp) {
        this.idCoursBamTemp = idCoursBamTemp;
    }

    public BigDecimal getMargerb() {
        return margerb;
    }

    public void setMargerb(BigDecimal margerb) {
        this.margerb = margerb;
    }

    public BigDecimal getMargevb() {
        return margevb;
    }

    public void setMargevb(BigDecimal margevb) {
        this.margevb = margevb;
    }

    public BigDecimal getCoursrb() {
        return coursrb;
    }

    public void setCoursrb(BigDecimal coursrb) {
        this.coursrb = coursrb;
    }

    public BigDecimal getCoursvb() {
        return coursvb;
    }

    public void setCoursvb(BigDecimal coursvb) {
        this.coursvb = coursvb;
    }

    public Calendar getDateCoursBamTemp() {
        return dateCoursBamTemp;
    }

    public void setDateCoursBamTemp(Calendar dateCoursBamTemp) {
        this.dateCoursBamTemp = dateCoursBamTemp;
    }

    public DeviseDto getDevise() {
        return devise;
    }

    public void setDevise(DeviseDto devise) {
        this.devise = devise;
    }
}
