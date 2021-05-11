package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> listEntier = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listEntier.add(i+1);
        }
        System.out.println("La taille de mon ArrayList d'entiers est : " + listEntier.size());

        //Affichage
        for (Integer integer : listEntier) {
            System.out.println(integer);
        }
    }
}
