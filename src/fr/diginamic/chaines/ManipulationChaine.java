package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";
        // Question 1
        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);
        // Question 2
        int longueurChaine = chaine.length();
        System.out.println("La longeur de la chaine de caractère " + chaine + " est : " + longueurChaine);
        // Question 3
        System.out.println("L'index du premier ; de la chaine " +  chaine + " est " + chaine.indexOf(';'));
        // Question 4
        System.out.println("Le nom de famille dans la chaine est : " + chaine.substring(0, chaine.indexOf(';')));
        // Question 5
        System.out.println("Le nom de famille dans la chaine est en majuscules : " + (chaine.substring(0, chaine.indexOf(';'))).toUpperCase());
        // Question 6
        System.out.println("Le nom de famille dans la chaine est en majuscules : " + (chaine.substring(0, chaine.indexOf(';'))).toLowerCase());
        // Question 7
        String[] tabChaine = chaine.split(";");
        System.out.println("Contenu tabChaine");
        for (String s : tabChaine) {
            System.out.println(s);
        }
        // Question 9
        String nom = tabChaine[0];
        String prenom = tabChaine[1];
        double salaire = Double.parseDouble(tabChaine[2].replace( " ", ""));
        Salarie salarie = new Salarie(nom, prenom, salaire);
        System.out.println(salarie);
    }

}
