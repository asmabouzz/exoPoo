package org.example.generique;

public class Boite<T> {


    //generique : on presice pas le type
    private T contenu;

    public Boite(T contenu) {
        this.contenu = contenu;
    }

    public T getContenu() {
        return contenu;
    }

    public void setContenu(T contenu) {
        this.contenu = contenu;
    }

    @Override
    public String toString() {
        return "Boite{" +
                "contenu=" + contenu +
                '}';
    }
}
