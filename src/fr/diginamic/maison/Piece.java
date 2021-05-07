package fr.diginamic.maison;

public abstract class Piece {
    protected double superficie;
    protected int numeroEtage;

    public Piece(double superficie, int numeroEtage) {
        this.superficie = superficie;
        this.numeroEtage = numeroEtage;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getNumeroEtage() {
        return numeroEtage;
    }

    public void setNumeroEtage(int numeroEtage) {
        this.numeroEtage = numeroEtage;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "superficie=" + superficie +
                ", numeroEtage=" + numeroEtage +
                '}';
    }
}
