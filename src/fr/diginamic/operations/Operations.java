package fr.diginamic.operations;

import static java.lang.Double.NaN;

public class Operations {
    public static double calcul(double a, double b, char operateur){
        //double resultat;

        switch(operateur) {
            case '+':
                return (a + b);
            case '-':
                return (a - b);
            case '*':
                return (a * b);
            case '/':
                return (a / b);
                default:
                    System.out.println("L'operateur " + operateur + " ne peut être utilisé");
                    return NaN;
        }


    }
}
