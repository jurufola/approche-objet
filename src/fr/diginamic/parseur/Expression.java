package fr.diginamic.parseur;

import static java.lang.Double.NaN;

public class Expression {
    private String gauche, droite;
    private char operateur;
    public Expression(String gauche, char operateur, String droite) {
        this.gauche = gauche;
        this.operateur = operateur;
        this.droite = droite;
    }

    public String getGauche() {
        return gauche;
    }

    public void setGauche(String gauche) {
        this.gauche = gauche;
    }

    public char getOperateur() {
        return operateur;
    }

    public void setOperateur(char operateur) {
        this.operateur = operateur;
    }

    public String getDroite() {
        return droite;
    }

    public void setDroite(String droite) {
        this.droite = droite;
    }

    @Override
    public String toString() {
        return "Expression{" +
                "gauche=" + gauche +
                ", operateur=" + operateur +
                ", droite=" + droite +
                '}';
    }

    public double evaluer(String x, double value){
        double g = 0.0, d = 0.0;
        //Savoir qui de droite ou gauche est x
        if (gauche.equals(x)) {
            g = value;
            d = Double.parseDouble(droite);
        }else if (droite.equals(x)){
            d = value;
            g = Double.parseDouble(gauche);
        }
        switch (operateur) {
            case '+' :
                return g + d;
            case '-' :
                return g - d;
            case '*' :
                return g * d;
            case '/' :
                return g / d;
            default:
                System.out.println("Ce operateur n'est pas permis");
                return NaN;
        }
    }
}
