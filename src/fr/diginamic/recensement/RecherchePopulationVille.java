package fr.diginamic.recensement;

import java.util.Iterator;
import java.util.Scanner;

public class RecherchePopulationVille extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        String nomVille = scanner.next();
        Iterator<Ville> iterator = recensement.getVilles().iterator();
        boolean trouve = false;
        while (iterator.hasNext() && !trouve) {
            Ville ville = iterator.next();
            System.out.println(" Je traite la ville de " + ville.getNomCommune());
            if (ville.getNomCommune().equalsIgnoreCase((nomVille))) {
                System.out.println(" La population de la ville de " + ville.getNomCommune() + " est de " + ville.getPopulationTotale());
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Ville inconnue");
        }
    }
}
