package ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="COURS_FIX_TAMP")

public class CoursFixingTemp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COURS_FIXING_TEMP_GENERATOR")
    @Column(name = "ID_FIX_TEMP", unique = true, nullable = false, precision = 6)
    private Long idFixTemp;
    @ManyToOne
    @JoinColumn(name = "ID_DEVISE", nullable = false)
    private Devise devise;
    @Column(name = "COURS_FIX_RET", precision = 9, scale = 6)
    private BigDecimal coursFixTempRet;

    @Column(name = "COURS_FIX_VER", precision = 9, scale = 6)
    private BigDecimal coursFixTempVer;
    public CoursFixingTemp() {

    }

    public CoursFixingTemp(long idFixTemp, Devise devise, BigDecimal coursFixTempRet, BigDecimal coursFixTempVer) {
        this.idFixTemp = idFixTemp;
        this.devise = devise;
        this.coursFixTempRet = coursFixTempRet;
        this.coursFixTempVer = coursFixTempVer;
    }

    public Long getIdFixTemp() {
        return idFixTemp;
    }

    public void setIdFixTemp(long idFixTemp) {
        this.idFixTemp = idFixTemp;
    }

    public Devise getDevise() {
        return devise;
    }

    public void setDevise(Devise devise) {
        this.devise = devise;
    }

    public BigDecimal getCoursFixTempRet() {
        return coursFixTempRet;
    }

    public void setCoursFixTempRet(BigDecimal coursFixTempRet) {
        this.coursFixTempRet = coursFixTempRet;
    }

    public BigDecimal getCoursFixTempVer() {
        return coursFixTempVer;
    }

    public void setCoursFixTempVer(BigDecimal coursFixTempVer) {
        this.coursFixTempVer = coursFixTempVer;
    }
   @ManyToOne
    @JoinColumn(name = "id_devise") // ou le nom de la colonne en base
    private Devise devis;



    @Override
    public String toString() {
        return "CoursTemp [idFixTemp=" + idFixTemp + ", devise=" + devise + ", coursFixTempRet=" + coursFixTempRet +
                ", coursFixTempVer=" + coursFixTempVer + ",]";
    }
}