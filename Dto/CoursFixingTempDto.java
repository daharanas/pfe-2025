package ma.eai.titre.manex.batchs.ChargCoursAutoBam.Dto;

import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.Devise;

import java.io.Serializable;
import java.math.BigDecimal;

public class CoursFixingTempDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long idFixingTemp;
    private BigDecimal coursFixTempRet;
    private BigDecimal coursFixingTempver;
    private Devise devise ;

    public CoursFixingTempDto(Long idFixingTemp, BigDecimal coursFixTempRet, BigDecimal coursFixingTempver, Devise devise) {
        this.idFixingTemp = idFixingTemp;
        this.coursFixTempRet = coursFixTempRet;
        this.coursFixingTempver = coursFixingTempver;
        this.devise = devise;
    }

    public Long getIdFixingTemp() {
        return idFixingTemp;
    }

    public void setIdFixingTemp(Long idFixingTemp) {
        this.idFixingTemp = idFixingTemp;
    }

    public BigDecimal getCoursFixTempRet() {
        return coursFixTempRet;
    }

    public void setCoursFixTempRet(BigDecimal coursFixTempRet) {
        this.coursFixTempRet = coursFixTempRet;
    }

    public BigDecimal getCoursFixingTempver() {
        return coursFixingTempver;
    }

    public void setCoursFixingTempver(BigDecimal coursFixingTempver) {
        this.coursFixingTempver = coursFixingTempver;
    }

    public Devise getDevise() {
        return devise;
    }

    public void setDevise(Devise devise) {
        this.devise = devise;
    }
}
