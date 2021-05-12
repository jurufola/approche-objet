package maps;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        ArrayList<Pays> pays = new ArrayList<>(Arrays.asList(new Pays("Mali", 20_000_000, "Afrique"), new Pays("Allemagne", 80_000_000, "Europe"),
                new Pays("Belgique", 10_000_000, "Europe"), new Pays("Russie", 150_000_000, "Asie"), new Pays("Chine", 1_400_000_000, "Asie"),
                new Pays("Indonesie", 220_000_000, "Océanie"), new Pays("Australie", 20_000_000, "Océanie")));

        HashMap<String, Integer> mapNbPaysParContinent = new HashMap<>();
        for (Pays pay : pays) {
            System.out.println("Je traite le pays " + pay.getNom() + " de contient " + pay.getContinent() + " present " + nbPaysParContinent(pays, pay.getContinent()) + " fois");
            mapNbPaysParContinent.put(pay.getContinent(), nbPaysParContinent(pays, pay.getContinent()));
        }
        // Affichage map
        Iterator<String> it = mapNbPaysParContinent.keySet().iterator();
        while (it.hasNext()) {
            String continent = it.next();
            System.out.println(continent + " -> " + mapNbPaysParContinent.get(continent));
        }

    }
    /**
     * compte le nombre de pays de continent dans l' ArrayList de pays
     */
    public static int nbPaysParContinent(ArrayList<Pays> pays, String continent) {
        int compteur = 0;
        for (Pays pay : pays) {
            if (pay.getContinent().equals(continent)) {
                compteur++;
            }
        }
        return compteur;
    }
}
