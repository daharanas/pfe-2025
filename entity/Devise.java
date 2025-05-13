package ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@Entity
@Table(name = "DEVISE")
@XmlAccessorType(XmlAccessType.FIELD)
public class Devise implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "DEVISE_IDDEVISE_GENERATOR", sequenceName = "S_DEVISE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEVISE_IDDEVISE_GENERATOR")
    @Column(unique = true, nullable = false, precision = 19)
    private Long id_devise;
    @Column(name = "CODE", length = 3)
    private String code;

    @Column(name = "CODE_ISO", length = 3)
    private String codeIso;

    @Column(length = 5)
    private String codebam;

    @Column(length = 2)
    private String codedevise;

    @Column(length = 3)
    private String codeswift;

    @Column(length = 1)
    private String etatdevise;

    @Lob
    private byte[] imagedevise;

    @Column(length = 20)
    private String libelledevise;

    @Column(length = 20)
    private String nomimage;

    @Column(length = 3)
    private String sigledevise;

    private BigDecimal unitedevise;

    @Transient
    private String libelleDeviseLong;


    public Devise(Long iddevise) {
        this.id_devise = iddevise;
    }

    public Devise(Long id_devise, String code, String codeIso, String codebam, String codedevise, String codeswift, String etatdevise, byte[] imagedevise, String libelledevise, String nomimage, String sigledevise, BigDecimal unitedevise, String libelleDeviseLong) {
        this.id_devise = id_devise;
        this.code = code;
        this.codeIso = codeIso;
        this.codebam = codebam;
        this.codedevise = codedevise;
        this.codeswift = codeswift;
        this.etatdevise = etatdevise;
        this.imagedevise = imagedevise;
        this.libelledevise = libelledevise;
        this.nomimage = nomimage;
        this.sigledevise = sigledevise;
        this.unitedevise = unitedevise;
        this.libelleDeviseLong = libelleDeviseLong;
    }
/*public Devise(Long iddevise, String codeDevise) {
        this.id_devise = iddevise;
        this.codedevise = codeDevise;
    }*/

    public Long getId_devise() {
        return this.id_devise;
    }

    public void setId_devise(Long id_devise) {
        this.id_devise = id_devise;
    }
    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getCodebam() {
        return this.codebam;
    }

    public void setCodebam(String codebam) {
        this.codebam = codebam;
    }

    public String getCodedevise() {
        return this.codedevise;
    }

    public void setCodedevise(String codedevise) {
        this.codedevise = codedevise;
    }

    public String getCodeswift() {
        return this.codeswift;
    }

    public void setCodeswift(String codeswift) {
        this.codeswift = codeswift;
    }

    public String getEtatdevise() {
        return this.etatdevise;
    }

    public void setEtatdevise(String etatdevise) {
        this.etatdevise = etatdevise;
    }

    public byte[] getImagedevise() {
        return this.imagedevise;
    }

    public void setImagedevise(byte[] imagedevise) {
        this.imagedevise = imagedevise;
    }

    public String getLibelledevise() {
        return this.libelledevise;
    }

    public void setLibelledevise(String libelledevise) {
        this.libelledevise = libelledevise;
    }

    public String getNomimage() {
        return this.nomimage;
    }

    public void setNomimage(String nomimage) {
        this.nomimage = nomimage;
    }

    public String getSigledevise() {
        return this.sigledevise;
    }

    public void setSigledevise(String sigledevise) {
        this.sigledevise = sigledevise;
    }

    public BigDecimal getUnitedevise() {
        return this.unitedevise;
    }

    public void setUnitedevise(BigDecimal unitedevise) {
        this.unitedevise = unitedevise;
    }

    public String getCodeIso() {
        return codeIso;
    }

    public void setCodeIso(String codeIso) {
        this.codeIso = codeIso;
    }

    public Devise(Long iddevise, String codeIso, String codebam,
                  String codedevise, String codeswift, String etatdevise,
                  byte[] imagedevise, String libelledevise, String nomimage,
                  String sigledevise, BigDecimal unitedevise) {
        super();
        this.id_devise = iddevise;
        this.codeIso = codeIso;
        this.codebam = codebam;
        this.codedevise = codedevise;
        this.codeswift = codeswift;
        this.etatdevise = etatdevise;
        this.imagedevise = imagedevise;
        this.libelledevise = libelledevise;
        this.nomimage = nomimage;
        this.sigledevise = sigledevise;
        this.unitedevise = unitedevise;
    }

    public Devise() {
        super();
    }

    @Override
    public String toString() {
        return "Devise ["
                + (id_devise != null ? "iddevise=" + id_devise + ", " : "")
                + (codeIso != null ? "codeIso=" + codeIso + ", " : "")
                + (codebam != null ? "codebam=" + codebam + ", " : "")
                + (codedevise != null ? "codedevise=" + codedevise + ", " : "")
                + (codeswift != null ? "codeswift=" + codeswift + ", " : "")
                + (etatdevise != null ? "etatdevise=" + etatdevise + ", " : "")
                + (imagedevise != null ? "imagedevise="
                + Arrays.toString(imagedevise) + ", " : "")
                + (libelledevise != null ? "libelledevise=" + libelledevise
                + ", " : "")
                + (nomimage != null ? "nomimage=" + nomimage + ", " : "")
                + (sigledevise != null ? "sigledevise=" + sigledevise + ", "
                : "")
                + (unitedevise != null ? "unitedevise=" + unitedevise : "")
                + "]";
    }

    public String getLibelleDeviseLong() {
        return libelleDeviseLong;
    }

    public void setLibelleDeviseLong(String libelleDeviseLong) {
        this.libelleDeviseLong = libelleDeviseLong;
    }

}
