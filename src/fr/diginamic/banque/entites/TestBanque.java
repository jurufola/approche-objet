package fr.diginamic.banque.entites;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte("123456789", 2000_000.0);
        System.out.println(compte);
    }
}
