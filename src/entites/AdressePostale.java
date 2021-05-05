package entites;

public class AdressePostale {
    public String numRue;
    public String libelleRue;
    public String codePostal;
    public String ville;

    public AdressePostale(String numRue, String libelleRue, String codePostal, String ville) {
        this.numRue = numRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
}
