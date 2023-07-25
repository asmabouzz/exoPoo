package org.example.Exo1;

public class Chaise {

    public int nbrPieds;
    public String materieaux;
    public String couleur;
    public double prix;

     //costructeur sans paramétre
    public Chaise(){
    };

    //constructeur avec nbrPied


    public Chaise(double prix) {
        this.prix= prix;
    }

    //constructeur avec tout les paramétres
    public Chaise(int nbrPieds ,String materieaux, String couleur,double prix) {
        this(prix);
        this.nbrPieds = nbrPieds;
        this.materieaux = materieaux;
        this.couleur = couleur;
    }





    @Override
    public String toString() {
        return "Je suis une Chaise avec " + nbrPieds +" pied(s) en "+ materieaux+" de couleur "+ couleur + " a un prix de "+prix;
    }
}
