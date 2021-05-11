package listes;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> listChaines = new ArrayList<>((Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon",
                "Foix", "Pau", "Marseille", "Tarbes")));
        // La ville ayant le plus grand nombre de lettres
        int tailleMaxVille = listChaines.get(0).length();
        String villeTailleMax = null;
        for (String chaine : listChaines) {
            if (chaine.length() > tailleMaxVille) {
                tailleMaxVille = chaine.length();
                villeTailleMax = chaine;
            }
        }
        System.out.println("La ville qui a le plus grand nombre de lettres est : " + villeTailleMax);
        //Tous les Noms de ville en majuscule
        for (int i = 0; i < listChaines.size(); i++) {
            listChaines.set(i, listChaines.get(i).toUpperCase());
            System.out.println(listChaines.get(i));
        }

        //Suppression des villes dont le nom commence par N
        Iterator<String> iterator = listChaines.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().startsWith("N")){
                iterator.remove();
            }
        }
        //Affichage Liste
        System.out.println("****** Affichage Liste ******");
        for (String chaine : listChaines) {
            System.out.println(chaine);
        }
    }
}
