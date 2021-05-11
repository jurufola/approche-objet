package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestVille {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>(Arrays.asList(new Ville("Nice", 343_000), new Ville("Carcassonne", 47_800),
                new Ville("Narbonne", 53_400), new Ville("Lyon", 484_000), new Ville("Foix", 9_700),
                new Ville("Pau", 77_200), new Ville("Marseille", 850_700), new Ville("Tarbes", 40_600)));
        //La ville la plus peuplée
        Ville villeLaPlusPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > villeLaPlusPeuplee.getNbHabitants()) {
                villeLaPlusPeuplee = ville;
            }
        }
        System.out.println("La ville plus peuplée est " + villeLaPlusPeuplee
        );

        //Suppression Ville la moins peuplée
        Ville villeLaMoinsPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbHabitants() < villeLaMoinsPeuplee.getNbHabitants()) {
                System.out.println("Je traite la ville de " + ville);
                villeLaMoinsPeuplee = ville;
            }
        }
        System.out.println("ville la moins peuplée " + villeLaMoinsPeuplee);
        villes.remove(villeLaMoinsPeuplee);
        //Nom en majuscule des villes de plus 100 000 habitants
        for (Ville ville : villes) {
            if(ville.getNbHabitants() > 100_000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        }
        //Affichage Villes
        for (Ville ville : villes) {
            System.out.println(ville);
        }

    }
}
