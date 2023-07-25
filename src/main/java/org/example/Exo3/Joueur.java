package org.example.Exo3;

public class Joueur {

    private String nom;
    private int niveau;
    private int pointsExperiance;

    public Joueur(String nom, int niveau, int pointsExperiance) {
        this.nom = nom;
        this.niveau = niveau;
        this.pointsExperiance = pointsExperiance;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getPointsExperiance() {
        return pointsExperiance;
    }

    public void setPointsExperiance(int pointsExperiance) {
        this.pointsExperiance = pointsExperiance;
    }



    public int effectuerUneQuete(int pointsExperiance){

     return   pointsExperiance+=10;

    }


    public int niveau(int pointsExperiance,int niveau){

        if (pointsExperiance > 100){
            niveau +=1;
        }
    return niveau;

    }



    @Override
    public String toString() {
        return "Joueur{" +
                "nom='" + nom + '\'' +
                ", niveau=" + niveau +
                ", pointsExperiance=" + pointsExperiance +
                '}';
    }



}
