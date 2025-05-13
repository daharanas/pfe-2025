package ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.EtatCours;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

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
    private ChargementCourBam chargement ;
    @ManyToOne
    @JoinColumn(name="IDDEVISE", nullable=false)
    private Devise devise;



    public CoursBamTemp() {
        // Obligatoire pour JPA
    }


    public CoursBamTemp(long idCoursBamTemp, BigDecimal coursrb, BigDecimal coursvb, BigDecimal margerb, BigDecimal margevb,  Calendar datecoursBamTemp , EtatCours etatCoursBam,Devise devise , ChargementCourBam chargement ) {
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

    public ChargementCourBam getChargement() {
        return chargement;
    }

    public void setChargement(ChargementCourBam chargement) {
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

