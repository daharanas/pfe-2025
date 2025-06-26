package ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.EtatCours;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="COURS_BAM")
@XmlAccessorType(XmlAccessType.FIELD)
public class CoursBam implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name="COURS_BAM_IDCOURSBAM_GENERATOR", sequenceName="S_COURS_BAM")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COURS_BAM_IDCOURSBAM_GENERATOR")
    @Column(unique=true, nullable=false, precision=6)
    private Long idcoursbam;
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
    private ChargementCoursBam chargement ;
    @Column(name="MID",precision=3, scale=2)
    private BigDecimal mid;
    @Column(name="RB",precision=3, scale=2)
    private BigDecimal rb;
    @Column(name="VB",precision=3, scale=2)
    private BigDecimal vb;
    @Column(name="ACS",precision=3, scale=2)
    private BigDecimal acs;
    @Column(name="VCS",precision=3, scale=2)
    private BigDecimal vcs;
    @Column(name="SOURCE",precision=3, scale=2)
    private String source;
    @ManyToOne
    @JoinColumn(name="IDDEVISE", nullable=false)
    private Devise devise;
    @ManyToOne
    @JoinColumn(name = "ID_COURS_CHARGEMENT") // FK vers ChargementCourBam
    private ChargementCoursBam chargementCoursBam;


    public CoursBam() {

    }

    public CoursBam(long idcoursbam, BigDecimal coursrb, BigDecimal coursvb, BigDecimal coursMidBam, BigDecimal coursMinBam, BigDecimal coursMaxBam, BigDecimal margeAchatMaxBam, BigDecimal margeVenteMaxBam, BigDecimal margeAchatMax, BigDecimal margeVenteMax , Devise devise ,EtatCours etatCoursBam , Date datecoursbam ,BigDecimal mid, BigDecimal rb, BigDecimal vb, BigDecimal acs, BigDecimal vcs, String source ) {
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
        this.mid = mid;
        this.rb = rb;
        this.vb = vb;
        this.acs = acs;
        this.vcs = vcs;
        this.source = source;

    }

    public ChargementCoursBam getChargement() {
        return chargement;
    }

    public void setChargement(ChargementCoursBam chargement) {
        this.chargement = chargement;
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

    public ChargementCoursBam getChargementCoursBam() {
        return chargementCoursBam;
    }

    public void setChargementCoursBam(ChargementCoursBam chargementCoursBam) {
        this.chargementCoursBam = chargementCoursBam;
    }

    public Date getDateCoursBam() {
        return dateCoursBam;
    }

    public void setDateCoursBam(Date dateCoursBam) {
        this.dateCoursBam = dateCoursBam;
    }

    public Long getIdcoursbam() {
        return idcoursbam;
    }

    public void setIdcoursbam(Long idcoursbam) {
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
