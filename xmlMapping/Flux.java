package ma.eai.titre.manex.batchs.ChargCoursAutoBam.xmlMapping;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "entete", "objet" })
@XmlRootElement(name = "flux")
public class Flux {
    @XmlElement(required = true)
    protected Entete entete;
    @XmlElement(required = true)
    protected Objet objet;

    public Flux() {
    }

    public Flux(boolean createElements) {
        if (createElements) {
            setEntete(new Entete());
            setObjet(new Objet());
        }
    }

    /**
     * Gets the value of the entete property.
     *
     * @return possible object is {@link Entete }
     *
     */
    public Entete getEntete() {
        return entete;
    }

    /**
     * Sets the value of the entete property.
     *
     * @param value
     * allowed object is {@link Entete }
     *
     */
    public void setEntete(Entete value) {
        this.entete = value;
    }

    /**
     * Gets the value of the objet property.
     *
     * @return possible object is {@link Objet }
     *
     */
    public Objet getObjet() {
        return objet;
    }

    /**
     * Sets the value of the objet property.
     *
     * @param value
     * allowed object is {@link Objet }
     *
     */
    public void setObjet(Objet value) {
        this.objet = value;
    }

    @Override
    public String toString() {
        return "Flux [\n\t" + entete + " \n\t" + objet + "\n]";
    }
}
