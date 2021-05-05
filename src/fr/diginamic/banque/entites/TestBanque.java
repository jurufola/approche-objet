package fr.diginamic.banque.entites;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte("123456789", 2000_000.0);
        Compte compteTaux = new CompteTaux("789456123", 5_000_000.0, 2.02);
        Compte[] tabComptes = { compte, compteTaux};
        //System.out.println(compte);
        for (Compte myCompte : tabComptes) {
            System.out.println(myCompte);
        }
    }
}
