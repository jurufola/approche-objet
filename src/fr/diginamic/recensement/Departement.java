package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Arrays;

public class Departement implements Comparable<Departement>{
    private String codeDepartement;
    private ArrayList<Ville> villes;
    private int populationDepartement;

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure
     * {@code sgn(x.compareTo(y)) == -sgn(y.compareTo(x))}
     * for all {@code x} and {@code y}.  (This
     * implies that {@code x.compareTo(y)} must throw an exception iff
     * {@code y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code x.compareTo(y)==0}
     * implies that {@code sgn(x.compareTo(z)) == sgn(y.compareTo(z))}, for
     * all {@code z}.
     *
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     *
     * <p>In the foregoing description, the notation
     * {@code sgn(}<i>expression</i>{@code )} designates the mathematical
     * <i>signum</i> function, which is defined to return one of {@code -1},
     * {@code 0}, or {@code 1} according to whether the value of
     * <i>expression</i> is negative, zero, or positive, respectively.
     *
     * @param dept the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(Departement dept) {
        return (this.populationDepartement - dept.populationDepartement);
    }


    public Departement(String codeDepartement, ArrayList<Ville> villes, int populationDepartement) {
        this.codeDepartement = codeDepartement;
        this.villes = villes;
        this.populationDepartement = populationDepartement;
    }

    public Departement(Recensement recensement, String codeDepartement) {
        this.codeDepartement = codeDepartement;
        this.populationDepartement = 0;
        this.villes = new ArrayList<>();
        for (Ville ville : recensement.getVilles()) {
            if (ville.getCodeDepartement().equalsIgnoreCase(codeDepartement)) {
                villes.add(ville);
                this.populationDepartement+=ville.getPopulationTotale();
            }
        }

    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public ArrayList<Ville> getVilles() {
        return villes;
    }

    public void setVilles(ArrayList<Ville> villes) {
        this.villes = villes;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "codeDepartement='" + codeDepartement + '\'' +
                ", villes=" + villes +
                ", populationDepartement=" + populationDepartement +
                '}';
    }

    public int getPopulationDepartement() {
        return populationDepartement;
    }

    public void setPopulationDepartement(int populationDepartement) {
        this.populationDepartement = populationDepartement;
    }
}
