package interfaces;

public class Rectangle implements ObjetGeometrique{
    private double longueur, largeur;

    /**
     * Retourne le périmètre d'un rectangle
     *
     * @return double
     */
    @Override
    public double perimetre() {
        return 2 * (this.longueur + this.largeur);
    }

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    /**
     * Retourne la surface d'un rectangle
     *
     * @return double
     */
    @Override
    public double surface() {
        return (this.longueur * this.largeur);
    }
}
