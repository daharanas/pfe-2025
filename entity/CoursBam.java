package ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.EtatCours;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="COURS_BAM")
@XmlAccessorType(XmlAccessType.FIELD)
public class CoursBam implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name="COURS_BAM_IDCOURSBAM_GENERATOR", sequenceName="S_COURS_BAM")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COURS_BAM_IDCOURSBAM_GENERATOR")
    @Column(unique=true, nullable=false, precision=6)
    private long idcoursbam;
    @Column(precision=9, scale=6)
    private BigDecimal coursrb;

    @Column(precision=9, scale=6)
    private BigDecimal coursvb;
    @Column(name = "ETAT_COURS", length = 1)
    private EtatCours etatCoursBam;
    @Temporal(TemporalType.DATE)
    //@XmlJavaTypeAdapter(DevBoosterDateFrAdapter.class)
    private Date dateCoursBam;

    @Column(name="COURS_MID_BAM",precision=8, scale=5)
    private BigDecimal coursMidBam;

    @Column(name="COURS_MIN_BAM",precision=8, scale=5)
    private BigDecimal coursMinBam;

    @Column(name="COURS_MAX_BAM",precision=8, scale=5)
    private BigDecimal coursMaxBam;

    @Column(name="MARGE_ACHAT_MAX_BAM",precision=10, scale=8)
    private BigDecimal margeAchatMaxBam;

    @Column(name="MARGE_VENTE_MAX_BAM",precision=10, scale=8)
    private BigDecimal margeVenteMaxBam;

    @Column(name="MRA_MAX",precision=5, scale=4)
    private BigDecimal margeAchatMax;

    @Column(name="MRV_MAX",precision=5, scale=4)
    private BigDecimal margeVenteMax;
    @ManyToOne
    @JoinColumn(name="IDDEVISE", nullable=false)
    private Devise devise;

    public CoursBam() {

    }

    public CoursBam(long idcoursbam, BigDecimal coursrb, BigDecimal coursvb, BigDecimal coursMidBam, BigDecimal coursMinBam, BigDecimal coursMaxBam, BigDecimal margeAchatMaxBam, BigDecimal margeVenteMaxBam, BigDecimal margeAchatMax, BigDecimal margeVenteMax , Devise devise ,EtatCours etatCoursBam , Date datecoursbam ) {
        this.idcoursbam = idcoursbam;
        this.coursrb = coursrb;
        this.coursvb = coursvb;
        this.etatCoursBam = etatCoursBam;
        this.coursMidBam = coursMidBam;
        this.coursMinBam = coursMinBam;
        this.coursMaxBam = coursMaxBam;
        this.dateCoursBam = datecoursbam;
        this.margeAchatMaxBam = margeAchatMaxBam;
        this.margeVenteMaxBam = margeVenteMaxBam;
        this.margeAchatMax = margeAchatMax;
        this.margeVenteMax = margeVenteMax;
        this.devise = devise ;

    }

    public Date getDateCoursBam() {
        return dateCoursBam;
    }

    public void setDateCoursBam(Date dateCoursBam) {
        this.dateCoursBam = dateCoursBam;
    }

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

    public Devise getDevise() {
        return devise;
    }

    public void setDevise(Devise devise) {
        this.devise = devise;
    }

    public EtatCours getEtatCoursBam() {
        return etatCoursBam;
    }

    public void setEtatCoursBam(EtatCours etatCoursBam) {
        this.etatCoursBam = etatCoursBam;
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
