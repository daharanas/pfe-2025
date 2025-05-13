package ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums;
/**
 * @author berradmo
 *
 */

public enum SensFichier {
    E("Entré"),
    S("Sortie");

    private final String libelle;

    private SensFichier(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return the libelle
     */
    public String libelle() {
        return libelle;
    }

}
