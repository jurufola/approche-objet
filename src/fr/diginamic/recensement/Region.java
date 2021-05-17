package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Region extends MenuService {
    private ArrayList<Departement> departements;
    private String nomRegion;

    public Region(ArrayList<Departement> departements, String nomRegion) {
        this.departements = departements;
        this.nomRegion = nomRegion;
    }

    public ArrayList<Departement> getRegions() {
        return departements;
    }

    public void setRegions(ArrayList<Departement> regions) {
        this.departements = regions;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        String nomRegion = scanner.next();
        int populatationRegion = 0;
        Iterator<Ville> iterator = recensement.getVilles().iterator();
        while (iterator.hasNext()) {
            Ville ville = iterator.next();
            System.out.println(" Je traite la ville de " + ville.getNomCommune());
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
                System.out.println(ville);
                populatationRegion+= ville.getPopulationTotale();
            }
        }
        System.out.println("La population de la région " + nomRegion + " est de : " + populatationRegion);
    }
}
