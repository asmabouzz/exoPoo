package org.example.ExoPlante;

public class Arbre extends Plante {

    protected String circonférenceTronc;

    public Arbre(String nom, double hauteur, String couleurFeuille,String circonférenceTronc) {
        super(nom, hauteur, couleurFeuille);
        this.circonférenceTronc = circonférenceTronc;

    }


    @Override
    public String affiche(){

        return "Plante{" +
                "nom='" + nom + '\'' +
                ", hauteur=" + hauteur +
                ", couleurFeuille='" + couleurFeuille + '\'' +
                ", circonférenceTronc='"+ circonférenceTronc +
                '}';
    }


}
