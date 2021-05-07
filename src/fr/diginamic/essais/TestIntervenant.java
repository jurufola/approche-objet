package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Salarie salarie = new Salarie("Moulaye", "HAÏDARA", 2000.0);
        System.out.println("Le salaire du salarié " + salarie.getPrenom() + " est de : " + salarie.getSalaire());
        Pigiste pigiste = new Pigiste("Doumet", "Sandy", 10, 70);
        System.out.println("Le salaire du pigiste " + pigiste.getPrenom() + " est de : " + pigiste.getSalaire());
        System.out.println("*****************************");
        salarie.afficherDonnees();
        pigiste.afficherDonnees();

    }
}
