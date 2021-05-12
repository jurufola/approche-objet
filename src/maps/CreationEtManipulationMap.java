package maps;

import java.util.*;

public class CreationEtManipulationMap {
    public static void main(String[] args) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        // Ajout Lille, Lyon et Bordeaux
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");
        //L 'ensemble des clés
        Set<Integer> mapVillesCles = mapVilles.keySet();
        System.out.println("L'ensmble des clés ");
        for (Integer mapVillesCle : mapVillesCles) {
            System.out.println(mapVillesCle);
        }
        //L 'ensemble des valeurs
        Collection<String> mapVillesValeurs = mapVilles.values();
        System.out.println("L'ensmble des valeurs ");
        for (String mapVillesValeur : mapVillesValeurs) {
            System.out.println(mapVillesValeur);
        }
        //Taille map
        System.out.println("La taille de la map : " + mapVilles.size());

    }
}
