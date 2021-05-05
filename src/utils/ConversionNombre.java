package utils;
import java.lang.Integer;

import static java.lang.Integer.getInteger;
import static java.lang.Integer.parseInt;

public class ConversionNombre {
    public static void main(String[] args) {
        String chaine = "12";
        int monInt = Integer.parseInt(chaine);
        System.out.println(monInt);
        int a= 9, b=6;
        System.out.println("Le maximum entre " + a + " et " + b + " est : " + Integer.max(a,b));
    }
}
