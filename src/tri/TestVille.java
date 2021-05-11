package tri;

import listes.Ville;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestVille {

    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>(Arrays.asList(new Ville("Nice", 343_000), new Ville("Carcassonne", 47_800),
            new Ville("Narbonne", 53_400), new Ville("Lyon", 484_000), new Ville("Foix", 9_700),
            new Ville("Pau", 77_200), new Ville("Marseille", 850_700), new Ville("Tarbes", 40_600)));

        Collections.sort(villes);

        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}
