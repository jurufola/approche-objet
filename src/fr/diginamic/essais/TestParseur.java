package fr.diginamic.essais;

import fr.diginamic.parseur.Expression;
import fr.diginamic.parseur.Parser;

public class TestParseur {
    public static void main(String[] args) {
        String chaine ="    3-   x  ";
        Expression exp = Parser.parse(chaine);
        System.out.println(exp.evaluer("x", 6));
    }
}
