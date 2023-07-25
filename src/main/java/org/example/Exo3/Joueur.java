package org.example.Exo3;

public class Joueur {

    private String nom;
    private int niveau;
    private int pointsExperiance;

    public Joueur(String nom) {
        this.nom = nom;

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



    public void effectuerUneQuete(){

       this.pointsExperiance+=10;
       niveau();

    }


    private void niveau(){

        if (this.pointsExperiance >= 100){
            this.niveau ++;
            this.pointsExperiance=0;
            System.out.println("Le joueur "+nom+" passe au niveau : " +niveau);
        }

    }



}
