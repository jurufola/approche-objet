package fr.diginamic.parseur;

public class Parser {
   public static Expression parse(String chaine) {
        // Recuperation des membres à partir de la chaîne de caractères
        String gauche,droite, chaineSansEspaces = chaine.replaceAll(" ", "");
        char operateur;
        String[] tabChaine = chaineSansEspaces.split("[-+*/]");

        operateur = chaineSansEspaces.charAt(tabChaine[0].length());
        gauche = tabChaine[0];
        droite = tabChaine[1];
       System.out.println(new Expression(gauche, operateur, droite));
        return new Expression(gauche, operateur, droite);

    }
}
