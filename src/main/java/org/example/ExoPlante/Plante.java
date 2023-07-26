package org.example.ExoPlante;

public abstract class Plante {

    protected String nom;
    protected double hauteur;
    protected String couleurFeuille;


    public Plante(String nom, double hauteur, String couleurFeuille) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.couleurFeuille = couleurFeuille;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public String getCouleurFeuille() {
        return couleurFeuille;
    }

    public void setCouleurFeuille(String couleurFeuille) {
        this.couleurFeuille = couleurFeuille;
    }



    public abstract String affiche();
}
