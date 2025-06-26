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
    private BigDecimal mid;
    private BigDecimal rb;
    private BigDecimal vb;
    private BigDecimal acs;
    private BigDecimal vcs;
    private String source;


    public CoursBamTempDto(BigDecimal mid, BigDecimal rb, BigDecimal vb, BigDecimal acs, BigDecimal vcs, String source) {
        this.mid = mid;
        this.rb = rb;
        this.vb = vb;
        this.acs = acs;
        this.vcs = vcs;
        this.source = source;
    }

    public BigDecimal getMid() {
        return mid;
    }

    public void setMid(BigDecimal mid) {
        this.mid = mid;
    }

    public BigDecimal getRb() {
        return rb;
    }

    public void setRb(BigDecimal rb) {
        this.rb = rb;
    }

    public BigDecimal getVb() {
        return vb;
    }

    public void setVb(BigDecimal vb) {
        this.vb = vb;
    }

    public BigDecimal getAcs() {
        return acs;
    }

    public void setAcs(BigDecimal acs) {
        this.acs = acs;
    }

    public BigDecimal getVcs() {
        return vcs;
    }

    public void setVcs(BigDecimal vcs) {
        this.vcs = vcs;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

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
