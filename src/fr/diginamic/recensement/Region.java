package fr.diginamic.recensement;

import java.util.*;

public class Region extends MenuService implements Comparable<Region> {
    private ArrayList<Departement> departements;
    private String nomRegion;
    private int populationRegion;

    @Override
    public String toString() {
        return "Region{" +
                "departements=" + departements +
                ", nomRegion='" + nomRegion + '\'' +
                ", populationRegion=" + populationRegion +
                '}';
    }

    public Region(Recensement recensement, String nomRegion) {
        this.nomRegion = nomRegion;
        this.populationRegion = 0;
        this.departements = new ArrayList<>();
        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
                //System.out.println("je traite la ville " + ville);
                //Ajout departement si et seulement si departement n'existe pas encore dans l 'arraylist departements
                Departement dept = new Departement(recensement, ville.getCodeDepartement());
                //System.out.println(dept);
                if (!ListContainDepartement(this.departements, dept)) {
                    //System.out.println("Je traite le departement " + dept.getCodeDepartement());
                    this.departements.add(dept);
                    this.populationRegion+= dept.getPopulationDepartement();
                }
            }
        }
    }


    public int getPopulationRegion() {
        return populationRegion;
    }

    public void setPopulationRegion(int populationRegion) {
        this.populationRegion = populationRegion;
    }

    public Region(ArrayList<Departement> departements, String nomRegion, int populationRegion) {
        this.departements = departements;
        this.nomRegion = nomRegion;
        this.populationRegion = populationRegion;
    }

    public ArrayList<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(ArrayList<Departement> regions) {
        this.departements = regions;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        scanner.nextLine();
        String nomRegion = scanner.nextLine();
        int populationRegion = 0;
        Iterator<Ville> iterator = recensement.getVilles().iterator();
        while (iterator.hasNext()) {
            Ville ville = iterator.next();
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
                System.out.println(ville);
                populationRegion+= ville.getPopulationTotale();
            }
        }
        this.setPopulationRegion(populationRegion);
        System.out.println("La population de la région " + nomRegion + " est de : " + populationRegion);
    }

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
     * @param reg the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(Region reg) {
        return this.populationRegion - reg.populationRegion;
    }

   /* public Region(ArrayList<Departement> departements) {
        ;
    }*/

    public boolean ListContainDepartement(ArrayList<Departement> departements, Departement dept) {

        for (Departement departement : departements) {
            if (departement.getCodeDepartement().equalsIgnoreCase(dept.getCodeDepartement())) {
                return true;
            }
        }
        return false;
    }

    public void villesLesPlusPeuplees(){
        ArrayList<Ville> villes = new ArrayList<>();
        ArrayList<Departement> departements = this.getDepartements();
        for (Departement departement : departements) {
            villes.addAll(departement.getVilles());
        }
        if (villes.size() == 0) {
            System.out.println("La region " + this.getNomRegion() + " est inconnue");
        }else {
            System.out.println("La région " + this.getNomRegion() + " a " + villes.size() + " communes");
            Collections.sort(villes);
            System.out.println("Les 10 villes les plus peuplées de la région " + this.getNomRegion() + " : ");
            for (int i = villes.size() - 1; i >= villes.size() - 10; i--) {
                System.out.println(villes.get(i).getNomCommune() + " de population " + villes.get(i).getPopulationTotale());
            }
        }
    }
}
