package org.example.Exo3;

public class Main {

    public static void main(String[] args) {

            Joueur joueur1= new Joueur("WarriorDu59 ");


            for (int j=1;j<=40;j++){
                System.out.println("Le joueur "+joueur1.getNom()+" effectue la quete n° : " +j);
                joueur1.effectuerUneQuete();


            }
            joueur1.setNom("LeGigaBossDuJava");
            System.out.println("WarriorDu59 change de pseudo : "+joueur1.getNom());
    }
}
