package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
    private Piece[] pieces;

    public Maison(Piece[] pieces) {
        this.pieces = pieces;
    }

    public Piece[] getPieces() {
        return pieces;
    }

    public void setPieces(Piece[] pieces) {
        this.pieces = pieces;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "pieces=" + Arrays.toString(pieces) +
                '}';
    }

    public void ajouterPiece(Piece piece) {
        if (piece ==null || piece.getSuperficie() <= 0 || piece.getNumeroEtage() < 0){
            System.out.println("La pièce à ajouter doit étre une pièce valide ");
        }else if (this.pieces == null) {//Si le tableau est vide, on stocke le premier élement
            this.pieces = new Piece[]{piece};
        }else{// On crée un nouveau tableau de taille plus grande de 1 puis on copie les lelemnts de pieces puis on reaffecte ce tableau à pieces
            Piece[] newTab = new Piece[this.pieces.length + 1];
            // Remplissage nouveau tableau avec les valeurs de pieces
            for (int i = 0; i < this.pieces.length; i++) {
                newTab[i] = this.pieces[i];
            }
            //Ajout nouvelle valeur
            newTab[this.pieces.length] = piece;
            // Reaffectation pieces
            setPieces(newTab);
        }
    }

    public double getSuperficieTotale(){
        double superficieTotale = 0.0;
        for (Piece piece : pieces) {
            superficieTotale+= piece.getSuperficie();
        }
        return superficieTotale;
    }

    public double getSuperficieEtage(int numeroEtage){
        double superficieEtage = 0.0;
        for (Piece piece : pieces) {
            if (piece.getNumeroEtage() == numeroEtage) {
                superficieEtage+= piece.getSuperficie();
            }
        }
        return superficieEtage;
    }

    public double getSuperficieByTypeDePiece(String typePiece){
        double superficieByTypeDePiece = 0.0;

        for (Piece piece : pieces) {
            if((piece.getClass().getSimpleName()).equalsIgnoreCase(typePiece))
                superficieByTypeDePiece+= piece.getSuperficie();
        }
        return superficieByTypeDePiece;
        /*switch (typePiece.toLowerCase()) {

            case "chambre" :
                for (Piece piece : pieces) {
                    if(piece instanceof Chambre)
                    superficieByTypeDePiece+= piece.getSuperficie();
                }
                    return superficieByTypeDePiece;
            case "salon" :
                for (Piece piece : pieces) {
                    if(piece instanceof Salon)
                        superficieByTypeDePiece+= piece.getSuperficie();
                }
                return superficieByTypeDePiece;
            case "cuisine" :
                for (Piece piece : pieces) {
                    if(piece instanceof Cuisine)
                        superficieByTypeDePiece+= piece.getSuperficie();
                }
                return superficieByTypeDePiece;

            case "salledebain" :
                for (Piece piece : pieces) {
                    if(piece instanceof SalleDeBain)
                        superficieByTypeDePiece+= piece.getSuperficie();
                }
                return superficieByTypeDePiece;
            case "wc" :
                for (Piece piece : pieces) {
                    if(piece instanceof Wc)
                        superficieByTypeDePiece+= piece.getSuperficie();
                }
                return superficieByTypeDePiece;
            default:
                System.out.println("Ce type de pièce n'existe pas");
                return -1;

        }*/
    }

    public int getNbPiecesByTypeDePiece(String typeDePiece) {
        int compteur = 0;
        for (Piece piece : pieces) {
            if ((piece.getClass().getSimpleName()).toLowerCase().equals(typeDePiece.toLowerCase())) {
                compteur++;
            }
        }
        return compteur;
    }
}
