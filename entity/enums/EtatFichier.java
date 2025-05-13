package ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums;
/**
 * @author berradmo
 *
 */
public enum EtatFichier {
    G("Génére"),
    I("Intégré"),
    C("Comptabilisé"),
    R("Rejeté");

    private final String libelle;

    private EtatFichier(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return the libelle
     */
    public String libelle() {
        return libelle;
    }
}
