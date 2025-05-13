package ma.eai.titre.manex.batchs.ChargCoursAutoBam.Dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.EtatFichier;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.SensFichier;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.TypeFichier;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
@XmlAccessorType(XmlAccessType.FIELD)

public class FichierEchangeDto implements Serializable {
    private long idFichier;
    private String cdfFichier;
    private Calendar coursDateGen;
    private Calendar dateStockage;
    private EtatFichier etatFichier;
    private String nomFichier;
    private SensFichier sensFichier;
    private TypeFichier typeFichier;
    private String motifRejet;
    private String refEvent;

    public FichierEchangeDto(long idFichier, String cdfFichier, Calendar coursDateGen, Calendar dateStockage, EtatFichier etatFichier, String nomFichier, SensFichier sensFichier, TypeFichier typeFichier, String motifRejet, String refEvent) {
        this.idFichier = idFichier;
        this.cdfFichier = cdfFichier;
        this.coursDateGen = coursDateGen;
        this.dateStockage = dateStockage;
        this.etatFichier = etatFichier;
        this.nomFichier = nomFichier;
        this.sensFichier = sensFichier;
        this.typeFichier = typeFichier;
        this.motifRejet = motifRejet;
        this.refEvent = refEvent;
    }

    public FichierEchangeDto() {

    }

    public long getIdFichier() {
        return idFichier;
    }

    public void setIdFichier(long idFichier) {
        this.idFichier = idFichier;
    }

    public String getCdfFichier() {
        return cdfFichier;
    }

    public void setCdfFichier(String cdfFichier) {
        this.cdfFichier = cdfFichier;
    }

    public Calendar getCoursDateGen() {
        return coursDateGen;
    }

    public void setCoursDateGen(Calendar coursDateGen) {
        this.coursDateGen = coursDateGen;
    }

    public Calendar getDateStockage() {
        return dateStockage;
    }

    public void setDateStockage(Calendar dateStockage) {
        this.dateStockage = dateStockage;
    }

    public EtatFichier getEtatFichier() {
        return etatFichier;
    }

    public void setEtatFichier(EtatFichier etatFichier) {
        this.etatFichier = etatFichier;
    }

    public String getNomFichier() {
        return nomFichier;
    }

    public void setNomFichier(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public SensFichier getSensFichier() {
        return sensFichier;
    }

    public void setSensFichier(SensFichier sensFichier) {
        this.sensFichier = sensFichier;
    }

    public TypeFichier getTypeFichier() {
        return typeFichier;
    }

    public void setTypeFichier(TypeFichier typeFichier) {
        this.typeFichier = typeFichier;
    }

    public String getMotifRejet() {
        return motifRejet;
    }

    public void setMotifRejet(String motifRejet) {
        this.motifRejet = motifRejet;
    }

    public String getRefEvent() {
        return refEvent;
    }

    public void setRefEvent(String refEvent) {
        this.refEvent = refEvent;
    }
}
