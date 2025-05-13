package ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity;

import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.EtatFichier;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.SensFichier;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums.TypeFichier;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
@Entity
public class FichierEchange implements Serializable {
    @Id
    @SequenceGenerator(name = "FICHIER_ECHANGE_GEN", sequenceName = "S_FICHIER_ECHANGE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FICHIER_ECHANGE_GEN")
    @Column(name = "ID_FICHIER", unique = true, nullable = false, precision = 6)
    private long idFichier;

    @Column(name = "CDF_FICHIER", length = 5)
    private String cdfFichier;

    @Temporal(TemporalType.DATE)
    @Column(name = "COURS_DATE_GEN")
    //@XmlJavaTypeAdapter(DevBoosterCalendarAdapter.class)
    private Calendar coursDateGen;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_STOCKAGE")
    //@XmlJavaTypeAdapter(DevBoosterCalendarStringAdapter.class)
    private Calendar dateStockage;

    @Column(name = "ETAT_FICHIER", length = 1)
    @Enumerated(EnumType.STRING)
    private EtatFichier etatFichier;

    @Column(name = "NOM_FICHIER_ECHANGE", length = 100)
    private String nomFichier;

    @Column(name = "SENS_FICHIER", length = 1)
    @Enumerated(EnumType.STRING)
    private SensFichier sensFichier;

    @Column(name = "TYPE_FICHIER", length = 40)
    @Enumerated(EnumType.STRING)
    private TypeFichier typeFichier;

    @Column(name="MOTIF_REJET", length=200)
    private String motifRejet;

    @Column(name = "REF_EVENT", length = 50)
    private String refEvent;
    public FichierEchange() {

    }

    public FichierEchange(long idFichier, String cdfFichier, Calendar coursDateGen, Calendar dateStockage, EtatFichier etatFichier, String nomFichier, SensFichier sensFichier, TypeFichier typeFichier, String motifRejet, String refEvent) {
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
