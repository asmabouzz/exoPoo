package org.example.exoBiblio;

public class Main {
    public static void main(String[] args) {

     Biblio biblioteque= new Biblio();

        Livre livre1= new Livre("asma","asma",50,true);
        Livre livre2= new Livre("ikhlass","ikhlass",184,false);
        Livre livre3= new Livre("joud","joud",200,false);
        Livre livre4= new Livre("ocean","ocean",90,false);
        Livre livre5= new Livre("dorian","dorian",100,true);



        biblioteque.ajoutlivre(livre1);
        biblioteque.ajoutlivre(livre2);
        biblioteque.ajoutlivre(livre3);
        biblioteque.ajoutlivre(livre4);
        biblioteque.ajoutlivre(livre5);

        biblioteque.afficheCollection();

        biblioteque.remove(livre3);
        System.out.println("############################");
        biblioteque.afficheCollection();

       biblioteque.modifierEtat(livre2);
        System.out.println("############################");
       biblioteque.afficheCollection();
    }
}
