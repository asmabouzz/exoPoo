package org.example.exoHotel;

public class Chambre {

    private int numChambre;
    private boolean statusChambre;
    private int nbrLits;
    private double tarif;

    //constructeur


    public Chambre(int numChambre, boolean statusChambre, int nbrLits, double tarif) {
        this.numChambre = numChambre;
        this.statusChambre = statusChambre;
        this.nbrLits = nbrLits;
        this.tarif = tarif;
    }


    //getteur setteur


    public int getNumChambre() {
        return numChambre;
    }

    public void setNumChambre(int numChambre) {
        this.numChambre = numChambre;
    }

    public boolean isStatusChambre() {
        return statusChambre;
    }

    public void setStatusChambre(boolean statusChambre) {
        this.statusChambre = statusChambre;
    }

    public int getNbrLits() {
        return nbrLits;
    }

    public void setNbrLits(int nbrLits) {
        this.nbrLits = nbrLits;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }


    //toString


    @Override
    public String toString() {
        return "Chambre{" +
                "numChambre=" + numChambre +
                ", statusChambre=" + statusChambre +
                ", nbrLits=" + nbrLits +
                ", tarif=" + tarif +
                '}';
    }
}
