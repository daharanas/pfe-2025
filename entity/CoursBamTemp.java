package ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.EtatCours;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

@Entity
@Table(name="COURS_TEMP")
@XmlAccessorType(XmlAccessType.FIELD)
public class CoursBamTemp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COURS_BAM_TEMP_IDCOURSBAMTEMP_GENERATOR")
    @Column(unique=true, nullable=false, precision=6)
    private long idCoursBamTemp;
    @Column(name="COURS_RB",  precision=6 , scale=6)
    private BigDecimal coursrb;
    @Column(name = "ETAT_COURS", length = 1)
    private EtatCours etatCoursBam;
    @Column(name="COURS_VB", precision=6, scale=6)
    private BigDecimal coursvb;
    @Column(name="MARGE_RB",precision=3, scale=2)
    private BigDecimal margerb;
    @ManyToOne
    @JoinColumn(name = "CHARGEMENT_ID")
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

    public CoursBamTemp(long idCoursBamTemp, BigDecimal coursrb, EtatCours etatCoursBam, BigDecimal coursvb, BigDecimal margerb, ChargementCoursBam chargement, BigDecimal mid, BigDecimal rb, BigDecimal vb, BigDecimal acs, BigDecimal vcs, String source, Devise devise, BigDecimal margevb, Calendar datecoursBamTemp) {
        this.idCoursBamTemp = idCoursBamTemp;
        this.coursrb = coursrb;
        this.etatCoursBam = etatCoursBam;
        this.coursvb = coursvb;
        this.margerb = margerb;
        this.chargement = chargement;
        this.mid = mid;
        this.rb = rb;
        this.vb = vb;
        this.acs = acs;
        this.vcs = vcs;
        this.source = source;
        this.devise = devise;
        this.margevb = margevb;
        this.datecoursBamTemp = datecoursBamTemp;
    }

    public CoursBamTemp() {
        // Obligatoire pour JPA
    }


    public CoursBamTemp(long idCoursBamTemp, BigDecimal coursrb, BigDecimal coursvb, BigDecimal margerb, BigDecimal margevb,  Calendar datecoursBamTemp , EtatCours etatCoursBam,Devise devise , ChargementCoursBam chargement ) {
        this.idCoursBamTemp = idCoursBamTemp;
        this.coursrb = coursrb;
        this.coursvb = coursvb;
        this.etatCoursBam = etatCoursBam;
        this.margerb = margerb;
        this.margevb = margevb;
        this.devise = devise;
        this.datecoursBamTemp = datecoursBamTemp;
        this.chargement = chargement ;
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

    public EtatCours getEtatCoursBam() {
        return etatCoursBam;
    }

    public Devise getDevise() {
        return devise;
    }

    public void setDevise(Devise devise) {
        this.devise = devise;
    }

    public void setEtatCoursBam(EtatCours etatCoursBam) {
        this.etatCoursBam = etatCoursBam;
    }

    public long getIdCoursBamTemp() {
        return idCoursBamTemp;
    }

    public BigDecimal getCoursrb() {
        return coursrb;
    }

    public BigDecimal getCoursvb() {
        return coursvb;
    }

    public BigDecimal getMargerb() {
        return margerb;
    }

    public BigDecimal getMargevb() {
        return margevb;
    }



    public Calendar getDatecoursBamTemp() {
        return datecoursBamTemp;
    }

    @Column(name="MARGE_VB",precision=3, scale=2)
    private BigDecimal margevb;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATECOURS_BAM_TEMP")
    //@XmlJavaTypeAdapter(DevBoosterCalendarAdapter.class)
    private Calendar datecoursBamTemp;

    public void setIdCoursBamTemp(long idCoursBamTemp) {
        this.idCoursBamTemp = idCoursBamTemp;
    }

    public void setCoursrb(BigDecimal coursrb) {
        this.coursrb = coursrb;
    }

    public void setCoursvb(BigDecimal coursvb) {
        this.coursvb = coursvb;
    }

    public void setMargerb(BigDecimal margerb) {
        this.margerb = margerb;
    }

    public void setMargevb(BigDecimal margevb) {
        this.margevb = margevb;
    }

    public ChargementCoursBam getChargement() {
        return chargement;
    }

    public void setChargement(ChargementCoursBam chargement) {
        this.chargement = chargement;
    }

    public void setDatecoursBamTemp(Calendar datecoursBamTemp) {
        this.datecoursBamTemp = datecoursBamTemp;
    }
    @Override
    public String toString() {
        return "CoursBamTemp [idcoursbamtemp=" + idCoursBamTemp + ", coursrb=" + coursrb
                + ", coursvb=" + coursvb  + " datecoursBamTemp=" + datecoursBamTemp +  "margerb=" + margerb + ", margevb="
                + margevb + ", ]";
    }
}

