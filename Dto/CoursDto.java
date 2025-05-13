package ma.eai.titre.manex.batchs.ChargCoursAutoBam.Dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Devise;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)

public class CoursDto {

    private Long idCours;
    private BigDecimal coursGab;
    private BigDecimal coursRb;
    private BigDecimal coursVb;
    private BigDecimal coursacs;
    private BigDecimal coursasd;
    private BigDecimal coursvcs;
    private Date dateValidCours;
    private Date datecours;
    private Date datesaiisie;
    private String etatCalcul;
    private String etatGabGen;
    private String etatcours;
    //private BoolString etatDecl;
    private BigDecimal coursMidBam;
    private BigDecimal coursMinBam;
    private BigDecimal coursMaxBam;
    private BigDecimal margeAchatMaxBam;
    private BigDecimal margeVenteMaxBam;
    private BigDecimal margeAchatMax;
    private BigDecimal margeVenteMax;
    private DeviseDto devise;


    public CoursDto() {
        super();

    }

    public Long getIdCours() {
        return idCours;
    }

    public void setIdCours(Long idCours) {
        this.idCours = idCours;
    }

    public BigDecimal getCoursGab() {
        return coursGab;
    }

    public void setCoursGab(BigDecimal coursGab) {
        this.coursGab = coursGab;
    }

    public BigDecimal getCoursRb() {
        return coursRb;
    }

    public void setCoursRb(BigDecimal coursRb) {
        this.coursRb = coursRb;
    }

    public BigDecimal getCoursVb() {
        return coursVb;
    }

    public void setCoursVb(BigDecimal coursVb) {
        this.coursVb = coursVb;
    }

    public BigDecimal getCoursacs() {
        return coursacs;
    }

    public void setCoursacs(BigDecimal coursacs) {
        this.coursacs = coursacs;
    }

    public BigDecimal getCoursasd() {
        return coursasd;
    }

    public void setCoursasd(BigDecimal coursasd) {
        this.coursasd = coursasd;
    }

    public BigDecimal getCoursvcs() {
        return coursvcs;
    }

    public void setCoursvcs(BigDecimal coursvcs) {
        this.coursvcs = coursvcs;
    }

    public Date getDateValidCours() {
        return dateValidCours;
    }

    public void setDateValidCours(Date dateValidCours) {
        this.dateValidCours = dateValidCours;
    }

    public Date getDatecours() {
        return datecours;
    }

    public void setDatecours(Date datecours) {
        this.datecours = datecours;
    }

    public Date getDatesaiisie() {
        return datesaiisie;
    }

    public void setDatesaiisie(Date datesaiisie) {
        this.datesaiisie = datesaiisie;
    }

    public String getEtatCalcul() {
        return etatCalcul;
    }

    public void setEtatCalcul(String etatCalcul) {
        this.etatCalcul = etatCalcul;
    }

    public String getEtatGabGen() {
        return etatGabGen;
    }

    public void setEtatGabGen(String etatGabGen) {
        this.etatGabGen = etatGabGen;
    }

    public String getEtatcours() {
        return etatcours;
    }

    public void setEtatcours(String etatcours) {
        this.etatcours = etatcours;
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

    public DeviseDto getDevise() {
        return devise;
    }

    public void setDevise(DeviseDto devise) {
        this.devise = devise;
    }

    public CoursDto(Long idCours, BigDecimal coursGab, BigDecimal coursRb, BigDecimal coursVb, BigDecimal coursacs, BigDecimal coursasd, BigDecimal coursvcs, Date dateValidCours, Date datecours, Date datesaiisie, String etatCalcul, String etatGabGen, String etatcours, BigDecimal coursMidBam, BigDecimal coursMinBam, BigDecimal coursMaxBam, BigDecimal margeAchatMaxBam, BigDecimal margeVenteMaxBam, BigDecimal margeAchatMax, BigDecimal margeVenteMax , DeviseDto devise) {
        this.idCours = idCours;
        this.coursGab = coursGab;
        this.coursRb = coursRb;
        this.coursVb = coursVb;
        this.coursacs = coursacs;
        this.coursasd = coursasd;
        this.coursvcs = coursvcs;
        this.dateValidCours = dateValidCours;
        this.datecours = datecours;
        this.datesaiisie = datesaiisie;
        this.etatCalcul = etatCalcul;
        this.etatGabGen = etatGabGen;
        this.etatcours = etatcours;
        this.coursMidBam = coursMidBam;
        this.coursMinBam = coursMinBam;
        this.coursMaxBam = coursMaxBam;
        this.margeAchatMaxBam = margeAchatMaxBam;
        this.margeVenteMaxBam = margeVenteMaxBam;
        this.margeAchatMax = margeAchatMax;
        this.margeVenteMax = margeVenteMax;
        this.devise = devise;

    }

}
