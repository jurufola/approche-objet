package fr.diginamic.entites;

import java.util.Arrays;

public class TheatrePro /*extends Theatre*/ {
    private String nom;
    private double recette;
    private Spectacle[] spectacles;

    public TheatrePro(String nom, Spectacle[] spectacles) {
        this.nom = nom;
        this.recette = 0.0;
        this.spectacles = spectacles;
    }

    public void ajouterSpectacle(Spectacle spectacle){
        if (spectacles == null) {//Si le tableau est vide, on stocke le premier élement
            spectacles = new Spectacle[]{spectacle};
        }else{// On crée un nouveau tableau de taille plus grande de 1 puis on copie les elements de spectacles puis on reaffecte ce tableau à spectacles
            Spectacle[] newTab = new Spectacle[spectacles.length + 1];
            // Remplissage nouveau tableau avec les valeurs de spectacles
            for (int i = 0; i < spectacles.length; i++) {
                newTab[i] = spectacles[i];
            }
            //Ajout nouvelle valeur
            newTab[spectacles.length] = spectacle;
            // Reaffectation spectacles
            spectacles = newTab;
        }
    }
    public Spectacle getSpectacle(String nomSpectacle) {
        for (Spectacle spectacle : this.spectacles) {
            if (spectacle.getNom().equals(nomSpectacle)){
                return spectacle;
            }
        }
        return null;
    }

    public void inscrire(int nbClients, String nomSpectacle){

        //Recuperation Spectacle
        Spectacle spectacle = getSpectacle(nomSpectacle);
        if (spectacle == null) {
            System.out.println("Spectacle inconnu");
        }else if ((spectacle.getNbInscrits() + nbClients) <= spectacle.getCapaciteMax()){
            spectacle.setNbInscrits(spectacle.getNbInscrits() + nbClients);
            recette+= spectacle.getTarif() * nbClients;
            System.out.println(nbClients + " client(s) a/ont été inscrit(s) au spectacle " + nomSpectacle + " ");
        }else {
            System.out.println("Capacité max atteinte");
        }
    }

    public double getRecetteTotale() {
        return recette;
    }

    public int getNbTotalClients() {
        int nbTotalClients = 0;
        for (Spectacle spectacle : spectacles) {
            nbTotalClients+= spectacle.getNbInscrits();
        }
        return nbTotalClients;
    }

    @Override
    public String toString() {
        return "TheatrePro{" +
                "nom='" + nom + '\'' +
                ", recette=" + recette +
                ", spectacles=" + Arrays.toString(spectacles) +
                '}';
    }
}
