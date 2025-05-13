package ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.enums;

public enum TypeFichier {
    CA("Cours Agence"),
    CD("Chiffre DMG"),
    CO("Chiffre ONDA"),
    CB("Cours Bam"),
    PCA("PCA"),
    CGB("Cours GAB"),
    PAD("PAD"),
    TGB("Transaction GAB"),
    CAA("Chiffre Affaire");

    private final String libelle;

    private TypeFichier(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return the libelle
     */
    public String libelle() {
        return libelle;
    }
}
