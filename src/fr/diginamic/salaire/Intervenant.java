package fr.diginamic.salaire;

import java.sql.SQLOutput;

public abstract class Intervenant {
    protected String nom, prenom;
    public abstract double getSalaire();

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void afficherDonnees(){
        System.out.println("L'intervenant a comme nom : " + getNom());
        System.out.println("L'intervenant a comme prénom : " + getPrenom());
        System.out.println("L'intervenant a comme salaire : " + getSalaire());
        if (this instanceof Salarie){
            System.out.println("Il est un salarié");
        }
        if (this instanceof Pigiste){
            System.out.println("Il est un pigiste");
        }

    }
}
