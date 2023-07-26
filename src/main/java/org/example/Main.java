package org.example;

import org.example.statique.Maison;

public class Main {
    public static void main(String[] args) {

        Maison maison = new Maison("orange",4,12.5,20);
        System.out.println(maison.getCouleur());
        maison.setCouleur("bleu");
        System.out.println(maison.getCouleur());
        maison.setCouleur("rouge");
        System.out.println(maison.getCouleur());


       Maison maisonJolie=new Maison("jaune",1,2,3);
        System.out.println("Nombre de maison instancier "+Maison.getNombreMaisons());  //private on passe par le getteur
        System.out.println(Maison.nomLatin); //nomLatin est public pas besoin de getteur

        //exemple de methode static
        Math.round(120.3);
        String .format("%s","toto");
    }
}