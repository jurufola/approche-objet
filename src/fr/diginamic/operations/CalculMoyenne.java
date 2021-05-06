package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
    private double[] monTab;

    public void ajout(double d){
        if (this.monTab == null) {//Si le tableau est vide, on stocke le premier élement
            this.monTab = new double[]{d};
        }else{// On crée un nouveau tableau de taille plus grande de 1 puis on copie les lelemnts de monTab puis on reaffecte ce tableau à monTab
            double[] newTab = new double[this.monTab.length + 1];
            // Remplissage nouveau tableau avec les valeurs de monTab
            for (int i = 0; i < this.monTab.length; i++) {
                newTab[i] = this.monTab[i];
            }
            //Ajout nouvelle valeur
            newTab[this.monTab.length] = d;
            // Reaffectation monTab
            setMonTab(newTab);
        }

    }

    public double[] getMonTab() {
        return monTab;
    }

    public void setMonTab(double[] monTab) {
        this.monTab = monTab;
    }

    @Override
    public String toString() {
        return "CalculMoyenne{" +
                "monTab=" + Arrays.toString(monTab) +
                '}';
    }
    public double calcul(){
        double somme=0.0;
        for (double v : monTab) {
            somme+=v;
        }
        return somme/monTab.length;
    }
}
