package org.example.list;

import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {

        //ArrayList<type> <nomList> = new ArrayList<type>()
        ArrayList<String> prenoms = new ArrayList<String>();

        //la methode add pour ajouter un element a la list
        prenoms.add("sophie");
        prenoms.add("toto");
        prenoms.add("dorian");


        //la methode get permet d'acceder a un element de la list par son indice

        System.out.println(prenoms.get(0));
        System.out.println(prenoms.get(1));
        System.out.println(prenoms.get(2));

        //la methode set permet de modifier un element en precisant son index
        prenoms.set(1,"Asma");

        //la methode size permet de retourner la taille de la liste
        System.out.println("dans cette liste il ya "+prenoms.size()+ " elements");

        // la methode remove permet de supprimer un element
        prenoms.remove(2);

        //la methode size permet de retourner la taille de la liste
        System.out.println("dans cette liste il ya "+prenoms.size()+ " elements");

        //la boucle foreach permet de parcourir la list
        for(String prenom : prenoms){
            System.out.println(prenom);
        }


        //possibilité de parcourir une list avec la boucle for
        for (int i=0;i< prenoms.size();i++){
            System.out.println(prenoms.get(i));
        }


    }
}
