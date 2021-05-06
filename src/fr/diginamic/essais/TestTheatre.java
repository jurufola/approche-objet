package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Lamartinne", 300, 150, 3_000.0);
        theatre.inscrire(50, 10);
        theatre.inscrire(50, 10);
        theatre.inscrire(50, 10);
        theatre.inscrire(1, 10);
        System.out.println("Le nombre total d'inscrits : " + theatre.getTotalClientInscrits() + " Pour une recette de : " + theatre.getRecette());


    }
}
