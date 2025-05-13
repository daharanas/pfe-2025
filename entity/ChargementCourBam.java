package ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.StatusChargement;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBamTemp;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CHARGEMENT_COURS_BAM")
@XmlAccessorType(XmlAccessType.FIELD)
public class ChargementCourBam  implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name="CHARGMENT_COURS_BAM_IDCOURSBAM_GENERATOR", sequenceName="S_COURS_BAM")
    @Column(name = "ID_COURS_CHARGEMENT", unique = true, nullable = false, precision = 6)
    private Long idCoursCargement;

    @Column(name = "COURS_RB", precision = 9, scale = 6)
    private BigDecimal coursRb;
    @Column(name = "COURS_VB", precision = 9, scale = 6)
    private BigDecimal coursVb;
    @Column(name = "SAS_SAISIE", length = 10)
    private String sasSaisie ;
    @Column(name = "SAS_VALIDATION", length = 10)
    private String sasValidation ;
    @Column(name = "NOM_FICHIER", length = 10)
    private String nomFichier ;
    @Temporal(TemporalType.DATE)
    private Date dateSaisie;
    @OneToMany(mappedBy = "chargement" , cascade = CascadeType.ALL)
    @JoinColumn(name="COURS_BAM_TEMP")
    private List<CoursBamTemp> coursBamTemp;
    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS_FICHIER", length = 5)
    private StatusChargement status;
    public ChargementCourBam() {
        super();
    }

    public ChargementCourBam(Long idCoursCargement, BigDecimal coursRb, BigDecimal coursVb, String sasSaisie, String sasValidation, String nomFichier, Date datesaiisie, StatusChargement status, List<CoursBamTemp> coursBamTemp) {
        this.idCoursCargement = idCoursCargement;
        this.coursRb = coursRb;
        this.coursVb = coursVb;
        this.sasSaisie = sasSaisie;
        this.sasValidation = sasValidation;
        this.nomFichier = nomFichier;
        this.dateSaisie = datesaiisie;
        this.status = status;
        this.coursBamTemp = coursBamTemp;
    }

    public Long getIdCoursCargement() {
        return idCoursCargement;
    }

    public void setIdCoursCargement(Long idCoursCargement) {
        this.idCoursCargement = idCoursCargement;
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

    public String getSasSaisie() {
        return sasSaisie;
    }

    public void setSasSaisie(String sasSaisie) {
        this.sasSaisie = sasSaisie;
    }

    public String getSasValidation() {
        return sasValidation;
    }

    public void setSasValidation(String sasValidation) {
        this.sasValidation = sasValidation;
    }

    public String getNomFichier() {
        return nomFichier;
    }

    public void setNomFichier(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public Date getDateSaisie() {
        return dateSaisie;
    }

    public void setDateSaisie(Date datesaiisie) {
        this.dateSaisie = datesaiisie;
    }

    public StatusChargement getStatus() {
        return status;
    }

    public void setStatus(StatusChargement status) {
        this.status = status;
    }

    public List<CoursBamTemp> getCoursBamTemp() {
        return coursBamTemp;
    }

    public void setCoursBamTemp(List<CoursBamTemp> coursBamTemp) {
        this.coursBamTemp = coursBamTemp;
    }
}
