package ma.eai.titre.manex.batchs.ChargCoursAutoBam.Dto;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Devise;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.EtatCours;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.util.List;

public class CoursBamDto {
    private long idcoursbam;
    private Long idDevise;
    private DeviseDto devise;
    private BigDecimal coursrb;
    private BigDecimal coursvb;
    private EtatCours etatCoursBam;
    private BigDecimal coursMidBam;
    private BigDecimal coursMinBam;
    private BigDecimal coursMaxBam;
    private BigDecimal margeAchatMaxBam;
    private BigDecimal margeVenteMaxBam;
    private BigDecimal margeAchatMax;
    private BigDecimal margeVenteMax;


    public CoursBamDto(long idcoursbam, BigDecimal coursrb, BigDecimal coursvb, BigDecimal coursMidBam, BigDecimal coursMinBam, BigDecimal coursMaxBam, BigDecimal margeAchatMaxBam, BigDecimal margeVenteMaxBam, BigDecimal margeAchatMax, BigDecimal margeVenteMax, DeviseDto devise , Long idDevise , EtatCours etatCoursBam  ) {
        this.idcoursbam = idcoursbam;
        this.idDevise = idDevise;
        this.coursrb = coursrb;
        this.coursvb = coursvb;
        this.etatCoursBam = etatCoursBam;
        this.coursMidBam = coursMidBam;
        this.coursMinBam = coursMinBam;
        this.coursMaxBam = coursMaxBam;
        this.margeAchatMaxBam = margeAchatMaxBam;
        this.margeVenteMaxBam = margeVenteMaxBam;
        this.margeAchatMax = margeAchatMax;
        this.margeVenteMax = margeVenteMax;
        this.devise = devise ;

    }

    public Long getIdDevise() {
        return idDevise;
    }

    public void setIdDevise(Long idDevise) {
        this.idDevise = idDevise;
    }

    public EtatCours getEtatCoursBam() {
        return etatCoursBam;
    }

    public void setEtatCoursBam(EtatCours etatCoursBam) {
        this.etatCoursBam = etatCoursBam;
    }

    public DeviseDto getDevise() {
        return devise;
    }

    public void setDevise(DeviseDto devise) {
        this.devise = devise;
    }

    public CoursBamDto() {}

    public long getIdcoursbam() {
        return idcoursbam;
    }

    public void setIdcoursbam(long idcoursbam) {
        this.idcoursbam = idcoursbam;
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

    public BigDecimal getCoursMidBam() {
        return coursMidBam;
    }

    public void setCoursMidBam(BigDecimal coursMidBam) {
        this.coursMidBam = coursMidBam;
    }

    public BigDecimal getCoursMinBam() {
        return coursMinBam;
    }

    public void setCoursMinBam(BigDecimal coursMinBam) {
        this.coursMinBam = coursMinBam;
    }

    public BigDecimal getCoursMaxBam() {
        return coursMaxBam;
    }

    public void setCoursMaxBam(BigDecimal coursMaxBam) {
        this.coursMaxBam = coursMaxBam;
    }

    public BigDecimal getMargeAchatMaxBam() {
        return margeAchatMaxBam;
    }

    public void setMargeAchatMaxBam(BigDecimal margeAchatMaxBam) {
        this.margeAchatMaxBam = margeAchatMaxBam;
    }

    public BigDecimal getMargeVenteMaxBam() {
        return margeVenteMaxBam;
    }

    public void setMargeVenteMaxBam(BigDecimal margeVenteMaxBam) {
        this.margeVenteMaxBam = margeVenteMaxBam;
    }

    public BigDecimal getMargeAchatMax() {
        return margeAchatMax;
    }

    public void setMargeAchatMax(BigDecimal margeAchatMax) {
        this.margeAchatMax = margeAchatMax;
    }

    public BigDecimal getMargeVenteMax() {
        return margeVenteMax;
    }

    public void setMargeVenteMax(BigDecimal margeVenteMax) {
        this.margeVenteMax = margeVenteMax;
    }


}
