package org.example.exoBiblio;

import java.util.ArrayList;
import java.util.List;

public class Biblio {

    private ArrayList<Livre> livres;


    public Biblio() {
       livres = new ArrayList<>();
    }


    //ajouter livres
        public void ajoutlivre (Livre livreCree) {
            livres.add(livreCree);
        }




        //supprimer un livre
    public void remove(Livre livreDelete) {
        livres.remove(livreDelete);
    }


        //afficher les livres de la collection
    public void afficheCollection() {
        for (Livre livre : livres) {
            livre.afficher() ;
        }
    }


        //modifier un etat de livre
    public void modifierEtat(Livre livreEmprunter) {
       livreEmprunter.setEstEmprunte(true);
    }

    public void retourLivre(Livre livreEmprunter) {
        livreEmprunter.setEstEmprunte(false);
    }

}
