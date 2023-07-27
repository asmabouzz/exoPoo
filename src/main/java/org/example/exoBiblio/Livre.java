package org.example.exoBiblio;

public class Livre {

    private String titre;
    private String auteur;
    private int nbrPages;
    private boolean estEmprunte;

    public Livre(String titre, String auteur, int nbrPages, boolean estEmprunte) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbrPages = nbrPages;
        this.estEmprunte = false;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbrPages() {
        return nbrPages;
    }

    public void setNbrPages(int nbrPages) {
        this.nbrPages = nbrPages;
    }

    public boolean isEstEmprunte() {
        return estEmprunte;
    }

    public void setEstEmprunte(boolean estEmprunte) {
        this.estEmprunte = estEmprunte;
    }

    public String afficher() {
        return "Livre{" +
                "titre='" + this.titre + '\'' +
                ", auteur='" + this.auteur + '\'' +
                ", nbrPages=" + this.nbrPages +
                ", estEmprunté=" + this.estEmprunte +
                '}';
    }

    public void emprent( ){
        this.estEmprunte= !this.estEmprunte;

    }
}
