package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Arrays;

public class Departement {
    private String codeDepartement;
    private ArrayList<Ville> villes;

    public Departement(String codeDepartement, ArrayList<Ville> villes) {
        this.codeDepartement = codeDepartement;
        this.villes = villes;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public ArrayList<Ville> getVilles() {
        return villes;
    }

    public void setVilles(ArrayList<Ville> villes) {
        this.villes = villes;
    }


}
