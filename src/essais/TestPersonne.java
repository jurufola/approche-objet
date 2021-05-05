package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne moulaye = new Personne();
        Personne aman = new Personne();
        AdressePostale adresse = new AdressePostale();
        adresse.numRue = "298";
        adresse.libelleRue = "Rue du grand champ";
        adresse.codePostal = "34790";
        adresse.ville = "Grabels";
        moulaye.nom = "HAÏDARA";
        moulaye.prenom = "Moulaye";
        aman.nom = "HAÏDARA";
        aman.prenom = "Aman";
        moulaye.adresse = adresse;
        aman.adresse = adresse;
        System.out.println(moulaye);
        System.out.println(aman);

    }
}
