package fr.diginamic.essais;

import fr.diginamic.entites.Spectacle;
import fr.diginamic.entites.TheatrePro;

public class TestTheatrePro {
    public static void main(String[] args) {
        Spectacle[] spectacles = new Spectacle[4];
        spectacles[0] = new Spectacle("Mimi", "concert", 15.0, 100, 0);
        spectacles[1] = new Spectacle("Mina", "comédie", 10.0, 80, 0);
        spectacles[2] = new Spectacle("Mira", "improvisation", 8.0, 90, 0);
        spectacles[3] = new Spectacle("Minou", "danse", 12.0, 100, 0);
        TheatrePro theatrePro = new TheatrePro("La marmaille", spectacles);
        theatrePro.inscrire(50, "Mimi");
        theatrePro.inscrire(50, "Mimi");
        theatrePro.inscrire(1, "Mimi");
        theatrePro.inscrire(80, "Mina");
        theatrePro.inscrire(85, "Mira");
        theatrePro.inscrire(100, "Minou");
        System.out.println("Le nombre total d'inscrit est de : " + theatrePro.getNbTotalClients());
        System.out.println("La recette globale de l'etablissement est de : " + theatrePro.getRecetteTotale());
        System.out.println(theatrePro);
    }
}
