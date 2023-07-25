package org.example.Exo2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Film {

    private String titre;
    private String realisateur;
    private String anneSortie;
    private String genre;

    public Film(String titre, String realisateur, String anneSortie, String genre) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.anneSortie = anneSortie;
        this.genre = genre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getAnneSortie() {
        return anneSortie;
    }

    public void setAnneSortie(String anneSortie) {
        this.anneSortie = anneSortie;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "Film{" +
                "titre='" + titre +"'"+
                ", realisateur='" + realisateur +"'"+
                ", anneSortie=" + anneSortie +
                ", genre='" + genre +"'"+
                '}';
    }
}
