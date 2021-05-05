package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse = new AdressePostale("870", "rue de la valsière",  "34790", "Grabels");
        Personne moulaye = new Personne("HAÏDARA", "Moulaye", adresse);
        Personne aman = new Personne("HAÏDARA", "Aman", adresse);
        System.out.println("Moulaye a pour nom : " + moulaye.nom);
        System.out.println("Aman a pour libellé de rue : " +  aman.adresse.libelleRue);

    }
}
