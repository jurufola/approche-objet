package maps;

import listes.Ville;

import java.util.*;

public class MapVilles {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>(Arrays.asList(new Ville("Nice", 343_000), new Ville("Carcassonne", 47_800),
                new Ville("Narbonne", 53_400), new Ville("Lyon", 484_000), new Ville("Foix", 9_700),
                new Ville("Pau", 77_200), new Ville("Marseille", 850_700), new Ville("Tarbes", 40_600)));
        HashMap<String, Ville> mapVilles = new HashMap<>();
        mapVilles.put("Nice", new Ville("Nice", 343_000));
        mapVilles.put("Carcassonne", new Ville("Carcassonne", 47_800));
        mapVilles.put("Narbonne", new Ville("Narbonne", 53_400));
        mapVilles.put("Lyon", new Ville("Lyon", 484_000));
        mapVilles.put("Foix", new Ville("Foix", 9_700));
        mapVilles.put("Pau", new Ville("Pau", 77_200));
        mapVilles.put("Marseille", new Ville("Marseille", 850_700));
        mapVilles.put("Tarbes", new Ville("Tarbes", 40_600));

        Iterator<Ville> iterator = mapVilles.values().iterator();
        //Suppression Villee qui a le moins d'habitant//
        Ville villeLaMoinsPeuplee = mapVilles.get("Nice");
            //Recherche Ville la moins peuplée
        while (iterator.hasNext()) {
            Ville ville = iterator.next();
            if (ville.getNbHabitants() < villeLaMoinsPeuplee.getNbHabitants()) {
                villeLaMoinsPeuplee = ville;
            }
        }
             //Affichage avant suppression
        System.out.println("************Affichage avant suppression**************");
        affichVilles(mapVilles.values());
            //Suppression Ville
        mapVilles.remove(villeLaMoinsPeuplee.getNom());
            //Affichage Villes restantes après suppression
        System.out.println("************Affichage avant suppression**************");
        affichVilles(mapVilles.values());

    }
    public static void affichVilles(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
