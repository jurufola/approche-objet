package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {
    public static void main(String[] args) throws IOException {
        //Recupération Chemin fichier
        Path path = Paths.get("C:\\Users\\juruf_000\\Downloads\\recensement.csv");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        //Suppression première Ligne,
        lines.remove(0);
        List<String> newLines = new ArrayList<>();
        newLines.add("Code département;Nom de la ville;Population Totale");
        //Récuperation villes de plus de 25000 habitants
        for (String line : lines) {
            String[] newLineTab = line.split(";");
            if(Integer.parseInt(newLineTab[9].trim().replaceAll(" ", "")) >= 25000) {
                newLines.add(newLineTab[2] + ";" + newLineTab[6] + ";" + newLineTab[9]);
            }
        }
        for (String newLine : newLines) {
            System.out.println(newLine);
        }
        //Ecriture nouveau Fichier
        Path pathCible = Paths.get("C:\\Users\\juruf_000\\Downloads\\recensement2.csv");
        Files.write(pathCible, newLines, StandardCharsets.UTF_8);
    }
}
