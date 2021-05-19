package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        long debutStringBuilder = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            stringBuilder.append(i+1);
        }
        long finStringBuilder = System.currentTimeMillis();
        System.out.println("StringBuilder: temps écoulé en millisecondes :" + (finStringBuilder- debutStringBuilder));
        String chaine = "";
        long debut = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
           chaine+=i+1;
        }
        long fin = System.currentTimeMillis();
        System.out.println("String: temps écoulé en millisecondes :" + (fin - debut));
    }

}
