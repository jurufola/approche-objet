package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        //Recuperation chemin fichier
        Path path = Paths.get("C:\\Users\\juruf_000\\Downloads\\recensement.csv");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        ArrayList<Ville> villes = new ArrayList<>();
        Iterator<String> iterator = lines.iterator();
        System.out.println(iterator.next()); // Pour lire la première ligne
        while (iterator.hasNext()) {
           String line = iterator.next();
           String[] tabLine = line.split(";");
           Ville ville = new Ville(tabLine[0], tabLine[1], tabLine[2], tabLine[5], tabLine[6], Integer.parseInt((tabLine[9]).replaceAll(" ", "")));
            //System.out.println(ville);
            villes.add(ville);
        }
        System.out.println(villes.size());
        Recensement recensement = new Recensement(villes);
        // Menu
        Scanner sc = new Scanner(System.in);
        AffichMenu();
        int choix = sc.nextInt();

        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomCommune().equalsIgnoreCase("Lyon 1er arrondissement")) {

                System.out.println(ville);
            }
        }

        switch (choix) {
            case 1:
                RecherchePopulationVille recherchePopulationVille = new RecherchePopulationVille();
                System.out.println("Veuillez saisir un nom de ville : ");
                recherchePopulationVille.traiter(recensement, sc);
                break;
            case 2:
                RecherchePopulationDepartement recherchePopulationDepartement = new RecherchePopulationDepartement();
                System.out.println("Meri de saisir un code de départemanent : ");
                recherchePopulationDepartement.traiter(recensement, sc);
            break;
            case 3:
                System.out.println("Merci de saisir un nom de région : ");
                Region region = new Region(new ArrayList<Departement>(), "region bidon");
                region.traiter(recensement, sc);
                break;

        }
    }
    public static void AffichMenu() {
        System.out.println("********** Menu **********");
        System.out.println("-   1. Population d'une ville donnée");
        System.out.println("-   2. Population d'un département donné");
        System.out.println("-   3. Population d'une region donnée");
        System.out.println("-   4. Afficher les 10 régions les plus peuplées");
        System.out.println("-   5. Afficher les 10 départements les plus peuplés");
        System.out.println("-   6. Afficher les 10 villes les plus peuplées d’un département");
        System.out.println("-   7. Afficher les 10 villes les plus peuplées d’une région");
        System.out.println("-   8. Afficher les 10 villes les plus peuplées de France");
        System.out.println("-   9. Sortir");
    }
}
