package fr.diginamic.banque.entites;

public class Compte {
    private String numeroCompte;
    private double soldeCompte;

    public Compte(String numeroCompte, double soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }
    public String toString() {
        return "numero du compte => " + this.numeroCompte + ", solde du compte => " + this.soldeCompte;
    }
}
