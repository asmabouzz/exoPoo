package org.example.exoHotel;

public class Client {

     private int id;
     private String nom;
     private String prenom;
     private String numTel;


     //constructeur

    public Client(int id, String nom, String prenom, String numTel) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.numTel = numTel;
    }


    //getteur setteur


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }


    //toString


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numTel='" + numTel + '\'' +
                '}';
    }
}
