package ma.eai.titre.manex.batchs.ChargCoursAutoBam.Dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.io.Serializable;
import java.math.BigDecimal;
@XmlAccessorType(XmlAccessType.FIELD)
public class DeviseDto implements Serializable {
    private Long id_devise;
    private String codeIso;
    private String codebam;
    private String codedevise;
    private String codeswift;
    private String etatdevise;
    private byte[] imagedevise;
    private String libelledevise;
    private String nomimage;
    private String sigledevise;
    private BigDecimal unitedevise;
    private String libelleDeviseLong;
    private String code;

    public DeviseDto() {

    }

    public DeviseDto(Long id_devise, String codeIso, String codebam, String codedevise, String codeswift, String etatdevise, byte[] imagedevise, String libelledevise, String nomimage, String sigledevise, BigDecimal unitedevise, String libelleDeviseLong) {
        this.id_devise = id_devise;
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
        this.code = code;
    }

    public Long getId_devise() {
        return id_devise;
    }
    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code = code;
    }

    public void setId_devise(Long id_devise) {
        this.id_devise = id_devise;
    }

    public String getCodeIso() {
        return codeIso;
    }

    public void setCodeIso(String codeIso) {
        this.codeIso = codeIso;
    }

    public String getCodebam() {
        return codebam;
    }

    public void setCodebam(String codebam) {
        this.codebam = codebam;
    }

    public String getCodedevise() {
        return codedevise;
    }

    public void setCodedevise(String codedevise) {
        this.codedevise = codedevise;
    }

    public String getCodeswift() {
        return codeswift;
    }

    public void setCodeswift(String codeswift) {
        this.codeswift = codeswift;
    }

    public String getEtatdevise() {
        return etatdevise;
    }

    public void setEtatdevise(String etatdevise) {
        this.etatdevise = etatdevise;
    }

    public byte[] getImagedevise() {
        return imagedevise;
    }

    public void setImagedevise(byte[] imagedevise) {
        this.imagedevise = imagedevise;
    }

    public String getLibelledevise() {
        return libelledevise;
    }

    public void setLibelledevise(String libelledevise) {
        this.libelledevise = libelledevise;
    }

    public String getNomimage() {
        return nomimage;
    }

    public void setNomimage(String nomimage) {
        this.nomimage = nomimage;
    }

    public String getSigledevise() {
        return sigledevise;
    }

    public void setSigledevise(String sigledevise) {
        this.sigledevise = sigledevise;
    }

    public BigDecimal getUnitedevise() {
        return unitedevise;
    }

    public void setUnitedevise(BigDecimal unitedevise) {
        this.unitedevise = unitedevise;
    }

    public String getLibelleDeviseLong() {
        return libelleDeviseLong;
    }

    public void setLibelleDeviseLong(String libelleDeviseLong) {
        this.libelleDeviseLong = libelleDeviseLong;
    }
}
