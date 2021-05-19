package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        /*long debut = System.currentTimeMillis();
        StringBuilder chaine = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            chaine.append(i+1);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));*/
        long debut = System.currentTimeMillis();
        String chaine = "";
        for (int i = 0; i < 100_000; i++) {
           chaine+=i;
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
    }

}
