package fr.diginamic.recensement;

import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

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
           villes.add(ville);
           if (ville.getNomCommune().startsWith("Lyon"))
            System.out.println(ville);
        }
        //System.out.println(villes.size());
        Recensement recensement = new Recensement(villes);
        // Menu
        boolean sortir = false;
        while(!sortir) {
            Scanner sc = new Scanner(System.in);
            AffichMenu();
            int choix = sc.nextInt();
            switch (choix) {
                case 1:
                    RecherchePopulationVille recherchePopulationVille = new RecherchePopulationVille();
                    System.out.println("Veuillez saisir un nom de ville : ");
                    recherchePopulationVille.traiter(recensement, sc);
                    break;
                case 2:
                    RecherchePopulationDepartement recherchePopulationDepartement = new RecherchePopulationDepartement();
                    System.out.println("Merci de saisir un code de départemanent : ");
                    recherchePopulationDepartement.traiter(recensement, sc);
                    break;
                case 3:
                    System.out.println("Merci de saisir un nom de région : ");
                    Region regionIdf = new Region(recensement, "Île-de-France");
                    regionIdf.traiter(recensement, sc);
                    break;
                case 4:
                    System.out.println("Les 10 regions les plus peuplées: ");
                    ArrayList<Region> regions = new ArrayList<>();

                    for (Ville ville : recensement.getVilles()) {
                        if (!ListContainRegion(regions,ville.getNomRegion())) {
                            Region region = new Region(recensement, ville.getNomRegion());
                            regions.add(region);
                        }
                    }
                    Collections.sort(regions);
                    for (int i = regions.size() - 1; i >= regions.size() - 10 ; i--) {

                        System.out.println(" Region " + regions.get(i).getNomRegion() + " de population " + regions.get(i).getPopulationRegion());
                    }
                    break;
                case 5:
                    System.out.println("Les 10 départements les plus peuplés: ");
                    ArrayList<Departement> departements = new ArrayList<>();

                    for (Ville ville : recensement.getVilles()) {
                        if (!ListContainDepartement(departements, ville.getCodeDepartement())) {
                            Departement departement = new Departement(recensement, ville.getCodeDepartement());
                            departements.add(departement);
                            // System.out.println(region1);
                        }
                    }
                    Collections.sort(departements);
                    for (int i = departements.size() - 1; i >= departements.size() - 10 ; i--) {

                        System.out.println(" Département " + departements.get(i).getCodeDepartement() + " de population " + departements.get(i).getPopulationDepartement());
                    }
                   // System.out.println(departements.size());
                    break;
                case 6:
                    System.out.println("Veuillez saisir un code de département : ");
                    Departement departement = new Departement(recensement, sc.next());
                    departement.villesLesPlusPeuplees();
                    break;

                case 7:
                    System.out.println("Veuillez saisir un nom de région : ");
                    sc.nextLine();
                    Region region2 = new Region(recensement, sc.nextLine());
                    region2.villesLesPlusPeuplees();
                    break;

                case 8:
                    System.out.println("Les 10 villes les plus peuplées de France ");
                    Collections.sort(recensement.getVilles());
                    for (int i = recensement.getVilles().size() - 1; i >= recensement.getVilles().size() - 10; i--) {
                        System.out.println(recensement.getVilles().get(i).getNomCommune() + " de population " + recensement.getVilles().get(i).getPopulationTotale());
                    }
                    break;

                case 9:
                    sortir = true;
                    System.out.println("Au revoir ...");
                    break;

                default:
                    System.out.println("Option non permise merci de choir entre 1 et 9");

            }
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
    public static boolean ListContainRegion(ArrayList<Region> regions, String nomReg) {

        for (Region region : regions) {
            if (region.getNomRegion().equalsIgnoreCase(nomReg)) {
                return true;
            }
        }
        return false;
    }

    public static boolean ListContainDepartement(ArrayList<Departement> departements, String codeDepartement) {

        for (Departement departement : departements) {
            if (departement.getCodeDepartement().equalsIgnoreCase(codeDepartement)) {
                return true;
            }
        }
        return false;
    }
}
