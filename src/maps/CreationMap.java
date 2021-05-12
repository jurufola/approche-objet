package maps;

import java.util.HashMap;

public class CreationMap {
    public static void main(String[] args) {
        HashMap<String, Double> mapSalaires = new HashMap<>();
        mapSalaires.put("Paul", 1750.0);
        mapSalaires.put("Hicham", 1825.0);
        mapSalaires.put("Yu", 2250.0);
        mapSalaires.put("Ingrid", 2015.0);
        mapSalaires.put("Chantal", 1750.0);
        System.out.println("La taille du map : " + mapSalaires.size());

    }
}
