package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;

public class TestForme {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(5.0);
        Rectangle rectange = new Rectangle(2.0, 3.0);
        Carre carre = new Carre(3.0);
        Forme[] formes= new Forme[]{cercle, rectange, carre };
        for (Forme forme : formes) {
            AffichageForme.afficher(forme);
        }

    }
}
