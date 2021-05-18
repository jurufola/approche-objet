package fr.diginamic.recensement;

import java.util.Iterator;
import java.util.Scanner;

public class RecherchePopulationVille extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        scanner.nextLine();
        String nomVille = scanner.nextLine();
        System.out.println("Voici le nom de la commune renseignée " + nomVille);
        Iterator<Ville> iterator = recensement.getVilles().iterator();
        boolean trouve = false;
        while (iterator.hasNext()) {
            Ville ville = iterator.next();
            if (ville.getNomCommune().equalsIgnoreCase((nomVille))) {
                System.out.println(ville);
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Ville inconnue");
        }
    }
}
