package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {
    public static void main(String[] args) {
        Cercle c1 = new Cercle(5.0);
        Cercle c2 = new Cercle(2.0);
        System.out.println("Le cercle de rayon " + c1.getRayon() + " a pour perimètre : " + c1.perimetre() + " et comme surface " + c1.surface());
        System.out.println("Le cercle de rayon " + c2.getRayon() + " a pour perimètre : " + c2.perimetre() + " et comme surface " + c2.surface());
    }
}
