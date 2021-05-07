package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {
    public static void afficher(Forme forme){
        System.out.println("Le perimetre de la forme de type " + forme.getClass().getName() +
                " a pour perimètre : " + forme.calculerPerimetre() + " et comme surface "+ forme.calculerSurface());
    }
}
