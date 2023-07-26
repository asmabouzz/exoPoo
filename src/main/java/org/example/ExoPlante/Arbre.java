package org.example.ExoPlante;

public class Arbre extends Plante {

    private double circonférenceTronc;

    public Arbre(String nom, double hauteur, String couleurFeuille,double circonférenceTronc) {
        super(nom, hauteur, couleurFeuille);
        this.circonférenceTronc = circonférenceTronc;

    }


    @Override
    public String affiche(){

        return "Plante{" +
                "nom='" + this.getNom() + '\'' +
                ", hauteur=" + this.getHauteur() +
                ", couleurFeuille='" + this.getCouleurFeuille() + '\'' +
                ", circonférenceTronc='"+ circonférenceTronc +
                '}';
    }


}
