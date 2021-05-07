package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
    private int nbJoursTravail;
    private double montantJournalierRemuneration;

    public Pigiste(String nom, String prenom, int nbJoursTravail, double montantJournalierRemuneration) {
        super(nom, prenom);
        this.nbJoursTravail = nbJoursTravail;
        this.montantJournalierRemuneration = montantJournalierRemuneration;
    }

    @Override
    public double getSalaire() {
        return nbJoursTravail*montantJournalierRemuneration;
    }
}
