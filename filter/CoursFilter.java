package ma.eai.titre.manex.batchs.ChargCoursAutoBam.filter;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.Calendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "coursFilter")
public class CoursFilter {
    private String devise;       // Code devise
    private String statut;       // Etat du cours
    private String typeCours;    // MID, RB, VB,
    private String source;       // EXCEL, MANUEL

    private Long idCours;        // Pour recherche directe

    @XmlJavaTypeAdapter(DevBoosterCalendarAdapter.class)
    private Calendar dateDebut;

    @XmlJavaTypeAdapter(DevBoosterCalendarAdapter.class)
    private Calendar dateFin;

    private Pager pager;




    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getTypeCours() {
        return typeCours;
    }

    public void setTypeCours(String typeCours) {
        this.typeCours = typeCours;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getIdCours() {
        return idCours;
    }

    public void setIdCours(Long idCours) {
        this.idCours = idCours;
    }

    public Calendar getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Calendar dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Calendar getDateFin() {
        return dateFin;
    }

    public void setDateFin(Calendar dateFin) {
        this.dateFin = dateFin;
    }

    public Pager getPager() {
        return pager;
    }

    public void setPager(Pager pager) {
        this.pager = pager;
    }
}
