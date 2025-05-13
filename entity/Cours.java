package ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "COURS")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cours implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "COURS_IDCOURS_GENERATOR", sequenceName = "S_COURS")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COURS_IDCOURS_GENERATOR")
    @Column(name = "ID_COURS", unique = true, nullable = false, precision = 6)
    private Long idCours;

    @Column(name = "COURS_GAB", precision = 8, scale = 5)
    private BigDecimal coursGab;

    @Column(name = "COURS_RB", precision = 9, scale = 6)
    private BigDecimal coursRb;

    @Column(name = "COURS_VB", precision = 9, scale = 6)
    private BigDecimal coursVb;

    @Column(precision = 8, scale = 5)
    private BigDecimal coursacs;

    @Column(precision = 8, scale = 5)
    private BigDecimal coursasd;

    @Column(precision = 8, scale = 5)
    private BigDecimal coursvcs;

    @Temporal(TemporalType.TIMESTAMP)
    //@XmlJavaTypeAdapter(DevBoosterDateStringAdapter.class)
    @Column(name = "DATE_VALID_COURS")
    private Date dateValidCours;

    @Temporal(TemporalType.DATE)
    //@XmlJavaTypeAdapter(DevBoosterDateFrAdapter.class)
    private Date datecours;

    @Temporal(TemporalType.DATE)
    private Date datesaiisie;

    @Column(name = "ETAT_CALCUL", length = 1)
    private String etatCalcul;

    @Column(name = "ETAT_GAB_GEN", length = 1)
    private String etatGabGen;

    @Column(length = 10)
    private String etatcours;

    /*@Column(name = "ETAT_DECL", length = 1)
    @Enumerated(EnumType.STRING)
    private BoolString etatDecl;*/

    @Column(name = "COURS_MID_BAM", precision = 8, scale = 5)
    private BigDecimal coursMidBam;

    @Column(name = "COURS_MIN_BAM", precision = 8, scale = 5)
    private BigDecimal coursMinBam;

    @Column(name = "COURS_MAX_BAM", precision = 8, scale = 5)
    private BigDecimal coursMaxBam;

    @Column(name = "MARGE_ACHAT_MAX_BAM", precision = 10, scale = 8)
    private BigDecimal margeAchatMaxBam;

    @Column(name = "MARGE_VENTE_MAX_BAM", precision = 10, scale = 8)
    private BigDecimal margeVenteMaxBam;

    @Column(name = "MRA_MAX", precision = 10, scale = 8)
    private BigDecimal margeAchatMax;

    @Column(name = "MRV_MAX", precision = 10, scale = 8)
    private BigDecimal margeVenteMax;

    @ManyToOne
    @JoinColumn(name="IDDEVISE", nullable=false)
    private Devise devise;




    // bi-directional many-to-one association to CoursBam

    public Cours(){

    }

    public Cours(Long idCours, BigDecimal coursGab, BigDecimal coursRb, BigDecimal coursVb, BigDecimal coursacs, BigDecimal coursasd, BigDecimal coursvcs, Date dateValidCours, Date datecours, Date datesaiisie, String etatCalcul, String etatGabGen, String etatcours, /*BoolString etatDecl,*/ BigDecimal coursMidBam, BigDecimal coursMinBam, BigDecimal coursMaxBam, BigDecimal margeAchatMaxBam, BigDecimal margeVenteMaxBam, BigDecimal margeAchatMax, BigDecimal margeVenteMax, /*CoursBam coursBam,*/ Devise devise) {
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
        //this.etatDecl = etatDecl;
        this.coursMidBam = coursMidBam;
        this.coursMinBam = coursMinBam;
        this.coursMaxBam = coursMaxBam;
        this.margeAchatMaxBam = margeAchatMaxBam;
        this.margeVenteMaxBam = margeVenteMaxBam;
        this.margeAchatMax = margeAchatMax;
        this.margeVenteMax = margeVenteMax;
        //this.coursBam = coursBam;
        this.devise = devise ;
    }


    public Devise getDevise() {
        return devise;
    }

    public void setDevise(Devise devise) {
        this.devise = devise;
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




    @Override
    public String toString() {
        return "Cours [idCours=" + idCours + ", coursGab=" + coursGab
                + ", coursRb=" + coursRb + ", coursVb=" + coursVb
                + ", coursacs=" + coursacs + ", coursasd=" + coursasd
                + ", coursvcs=" + coursvcs + ", etatCalcul=" + etatCalcul
                + ", etatGabGen=" + etatGabGen + ", etatcours=" + etatcours
                + /*", etatDecl=" + etatDecl + */", coursMidBam=" + coursMidBam
                + ", coursMinBam=" + coursMinBam + ", coursMaxBam="
                + coursMaxBam + ", margeAchatMaxBam=" + margeAchatMaxBam
                + ", margeVenteMaxBam=" + margeVenteMaxBam + ", margeAchatMax="
                + margeAchatMax + ", margeVenteMax=" + margeVenteMax
                + ", coursBam=" + /*coursBam.getIdcoursbam() +*/ ", devise=" + devise.getCodedevise() +" "+ devise.getCodeswift() + "] \n";
    }
}
