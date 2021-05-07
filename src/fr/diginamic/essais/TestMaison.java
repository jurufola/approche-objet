package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Chambre chambre = new Chambre(10.0, 0);
        Salon salon = new Salon(40.0, 0);
        Cuisine cuisine = new Cuisine(12.0, 0);
        SalleDeBain salleDeBain = new SalleDeBain(6.0, 1);
        Wc wc = new Wc(3.0, 1);
        Piece[] pieces = new Piece[5];
        pieces[0] = chambre;
        pieces[1] = salon;
        pieces[2] = cuisine;
        pieces[3] = salleDeBain;
        pieces[4] = wc;
        Maison maison = new Maison(null);
        for (Piece piece : pieces) {
            maison.ajouterPiece(piece);
            System.out.println("ajout d'une piece");
            System.out.println("La superficie totale de la maison est de : " + maison.getSuperficieTotale());
        }
        System.out.println("La superficie totale de la maison est de : " + maison.getSuperficieTotale());
        System.out.println("Superficie Etage Rez de chaussée : " + maison.getSuperficieEtage(0));
        System.out.println("Superficie Etage 1er étage : " + maison.getSuperficieEtage(1));
        System.out.println(maison);
        maison.ajouterPiece(null);
        System.out.println(maison);
        System.out.println("La superficie totale de la maison est de : " + maison.getSuperficieTotale());
        System.out.println("Rajout chambre à l'etage ");
        maison.ajouterPiece(new Chambre(15.0, 1));
        System.out.println(maison);
        System.out.println("superficie au RDC " + maison.getSuperficieEtage(0));
        System.out.println("superficie au 1er " + maison.getSuperficieEtage(1));
        System.out.println(maison.getSuperficieTotale());
        maison.ajouterPiece(new Chambre(0.0,-2 ));
        System.out.println(maison);
        System.out.println("***************");
        System.out.println("La superficie totale des chambres : " + maison.getSuperficieByTypeDePiece("chambre"));
        System.out.println("La superficie totale des SDB : " + maison.getSuperficieByTypeDePiece("salleDebain"));
        System.out.println("Le nombre de chambres : " + maison.getNbPiecesByTypeDePiece("CHAMBRE"));
        System.out.println("Le nombre de SDB : " + maison.getNbPiecesByTypeDePiece("SALLEDEbain"));
        System.out.println(chambre.getClass().getSimpleName() );
        String chaine = "CHAMBRE";
        System.out.println(chaine.substring(0, 1).toUpperCase()+ chaine.substring(1).toLowerCase());

    }
}
