package org.example.Exo3;

public class Main {

    public static void main(String[] args) {

        Joueur joueur1= new Joueur("WarriorDu59 ",1,10);

        System.out.println(joueur1);

        int point ;
        //joueur1.setPointsExperiance(joueur1.effectuerUneQuete(point));

        for (int i=1;i<= joueur1.getNiveau();i++){
            System.out.println("Le joueur "+joueur1.getNom()+" passe au niveau : " +joueur1.getNiveau());

            for (int j=1;j<=10;j++){
                point =joueur1.getPointsExperiance();
                System.out.println("Le joueur "+joueur1.getNom()+" effectue la quete n° : " +j);
                joueur1.setPointsExperiance(joueur1.effectuerUneQuete(point));
                System.out.println(joueur1.getPointsExperiance());

            }
            joueur1.setNiveau(joueur1.niveau(joueur1.getPointsExperiance(), joueur1.getNiveau()));
            System.out.println(joueur1.getNiveau());
        }

    }
}
