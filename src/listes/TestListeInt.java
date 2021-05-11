package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> listEntiers = new ArrayList<>();
        listEntiers.add(-1);
        listEntiers.add(5);
        listEntiers.add(7);
        listEntiers.add(3);
        listEntiers.add(-2);
        listEntiers.add(4);
        listEntiers.add(8);
        listEntiers.add(5);
        //Afficahage List
        Iterator<Integer> iterator = listEntiers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //Taille liste
        System.out.println("La taille de la liste est de : " + listEntiers.size());
        // Le plus grand le la liste
        iterator = listEntiers.iterator();
        int max = listEntiers.get(0);
        while(iterator.hasNext()) {
            int courant = iterator.next();
            if (max < courant) {
                max = courant;
            }
        }
        System.out.println("Le max est : " + max);
        // Le min
        int min = listEntiers.get(0);
        int positionMin = 0;
        for (int i = 0; i < listEntiers.size(); i++) {
                if (min > listEntiers.get(i)) {
                    min = listEntiers.get(i);
                    positionMin = i;
                }
        }

        System.out.println("Le min est : " + min + " à la position " + positionMin);
        //Suppression min
        listEntiers.remove(positionMin);
        //Affichage liste
        iterator = listEntiers.iterator(); // reset iterateur
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Recherche élements négatifs
        for (int i = 0; i < listEntiers.size(); i++) {
            if (listEntiers.get(i) < 0) {
                listEntiers.set(i, -listEntiers.get(i));
            }
        }
        //Affichage liste finale
        iterator = listEntiers.iterator(); // reset iterateur
        System.out.println("****** Liste finale ******");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
