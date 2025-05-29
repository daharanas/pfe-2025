package ma.eai.titre.manex.batchs.ChargCoursAutoBam.filter;

import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.Calendar;

public class ChargementCoursFilter {
    private String statut;         // Status du lot (ex : EN_ATTENTE, VALIDE, REJETE)
    private String sasSaisie;      // Utilisateur qui a saisi le lot
    private String sasValidation;  // Utilisateur qui a validé le lot (si applicable)

    @XmlJavaTypeAdapter(DevBoosterCalendarAdapter.class)
    private Calendar dateDebut;

    @XmlJavaTypeAdapter(DevBoosterCalendarAdapter.class)
    private Calendar dateFin;

    private Pager pager;

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
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
