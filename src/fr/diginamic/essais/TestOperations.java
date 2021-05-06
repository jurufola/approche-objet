package fr.diginamic.essais;


import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        System.out.println(Operations.calcul(1.0, 2.0, '+'));
        System.out.println(Operations.calcul(1.0, 2.0, '-'));
        System.out.println(Operations.calcul(1.0, 2.0, '*'));
        System.out.println(Operations.calcul(1.0, 2.0, '/'));
        System.out.println(Operations.calcul(1.0, 2.0, 't'));
    }
}
