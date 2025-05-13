package ma.eai.titre.manex.batchs.ChargCoursAutoBam.Dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBamTemp;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.StatusChargement;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class ChargmentCoursBamDto implements Serializable {
private Long idCoursChargement;
private BigDecimal coursRB;
private BigDecimal coursRV;
private String sasSaisie;
private String sasValidation;
private String nomFichier;
private Date dateSaisie ;
private List<CoursBamTemp> coursBamTemp ;
private StatusChargement status;
public ChargmentCoursBamDto() {
    super();
}

    public ChargmentCoursBamDto(Long idCoursChargement, BigDecimal coursRB, BigDecimal coursRV, String sasSaisie, String sasValidation, String nomFichier, Date dateSaisie, StatusChargement status, List<CoursBamTemp> coursBamTemp) {
        this.idCoursChargement = idCoursChargement;
        this.coursRB = coursRB;
        this.coursRV = coursRV;
        this.sasSaisie = sasSaisie;
        this.sasValidation = sasValidation;
        this.nomFichier = nomFichier;
        this.dateSaisie = dateSaisie;
        this.status = status;
        this.coursBamTemp = coursBamTemp;
    }

    public Long getIdCoursChargement() {
        return idCoursChargement;
    }

    public void setIdCoursChargement(Long idCoursChargement) {
        this.idCoursChargement = idCoursChargement;
    }

    public BigDecimal getCoursRB() {
        return coursRB;
    }

    public void setCoursRB(BigDecimal coursRB) {
        this.coursRB = coursRB;
    }

    public BigDecimal getCoursRV() {
        return coursRV;
    }

    public void setCoursRV(BigDecimal coursRV) {
        this.coursRV = coursRV;
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

    public void setDateSaisie(Date dateSaisie) {
        this.dateSaisie = dateSaisie;
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
