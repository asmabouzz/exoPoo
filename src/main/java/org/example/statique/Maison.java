package org.example.statique;

public class Maison {


    private String couleur ;

    private int nombrePortes;
    private double largeur;
    private double longeur;

    //Attribut de classe: commun a tout les instance
    //<visibilite>static <type><nom>
    //si il est public <Class>.<attribut>
    private static int nombreMaisons;
    public static String nomLatin="Domus";


    public Maison(String couleur, int nombrePortes, double largeur, double longeur) {
        nombreMaisons++;
        this.couleur = couleur;
        this.nombrePortes = nombrePortes;
        this.largeur = largeur;
        this.longeur = longeur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        if(couleur != "rouge") {
            this.couleur = couleur;
        }
    }

    public int getNombrePortes() {
        return nombrePortes;
    }

    public void setNombrePortes(int nombrePortes) {
        this.nombrePortes = nombrePortes;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLongeur() {
        return longeur;
    }

    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }

    //<visibilite>static<type de retour><parametre>
    public static int getNombreMaisons() {
        return nombreMaisons;
    }




}
