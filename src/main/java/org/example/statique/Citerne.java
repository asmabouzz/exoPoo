package org.example.statique;

public class Citerne {

    private double poidAvide;
    private  double capaciteMax;
    private double niveauRemplissage;


    private static double total;

    public Citerne(double poidAvide, double capaciteMax, double niveauRemplissage) {
        total += niveauRemplissage;
        this.poidAvide = poidAvide;
        this.capaciteMax = capaciteMax;
        this.niveauRemplissage = niveauRemplissage;
    }

    public double getPoidAvide() {
        return poidAvide;
    }

    public void setPoidAvide(double poidAvide) {
        this.poidAvide = poidAvide;
    }

    public double getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(double capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public double getNiveauRemplissage() {
        return niveauRemplissage;
    }

    public void setNiveauRemplissage(double niveauRemplissage) {
        this.niveauRemplissage = niveauRemplissage;
    }

    public static double getTotal() {

        return total;
    }

    public static void setTotal(double total) {
        Citerne.total = total;
    }

    @Override
    public String toString() {
        return "Citerne{" +
                "poidAvide=" + poidAvide +
                ", capaciteMax=" + capaciteMax +
                ", niveauRemplissage=" + niveauRemplissage +
                '}';
    }

    public void remplir(double volume){

        if(this.niveauRemplissage<this.capaciteMax){
        niveauRemplissage=this.niveauRemplissage+volume;
        total+=volume;
        }
    }
    public void vider(double volume){
        if(volume<this.niveauRemplissage) {
            niveauRemplissage = this.niveauRemplissage - volume;
            total -= volume;
        }
    }

    public double poidsFinal(){
        return this.getPoidAvide()+this.getNiveauRemplissage();
    }


}
