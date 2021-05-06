package fr.diginamic.entites;

public class Theatre {
    private String nom;
    private int capacite;
    private int totalClientsInscrits;
    private double recette;

    public Theatre(String nom, int capacite, int inscrits, double recette) {
        this.nom = nom;
        this.capacite = capacite;
        this.totalClientsInscrits = inscrits;
        this.recette = recette;
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public int getTotalClientInscrits() {
        return totalClientsInscrits;
    }

    public void setTotalClientInscrits(int totalClientInscrits) {
        this.totalClientsInscrits = totalClientInscrits;
    }

    public double getRecette() {
        return recette;
    }

    public void setRecette(double recette) {
        this.recette = recette;
    }

    public void inscrire(int nbClients, double prixPlace){
        if ((nbClients + totalClientsInscrits)<=capacite) {
            totalClientsInscrits+= nbClients;
            recette+= prixPlace * nbClients;
        }else {
            System.out.println("Capacité maximale atteinte");
        }
    }
}
