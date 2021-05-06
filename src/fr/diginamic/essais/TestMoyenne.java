package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne c = new CalculMoyenne();
        CalculMoyenne c2 = new CalculMoyenne();
        c2.ajout(1.0);
        c2.ajout(2.0);
        c.ajout(20.0);
        c.ajout(19.0);
        c.ajout(18.0);
        c.ajout(16.0);
        c.ajout(16.0);
        c.ajout(16.0);
        c.ajout(16.0);
        System.out.println(c);
        System.out.println("La moyenne des élements du 1er tableau est : " + c.calcul());
        System.out.println("La moyenne des élements du second tableau est : " + c2.calcul());

    }
}
