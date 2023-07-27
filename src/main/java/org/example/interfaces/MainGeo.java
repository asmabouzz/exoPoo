package org.example.interfaces;

public class MainGeo {

    public static void main(String[] args) {

        Cercle cercle=new Cercle("cercle1",5.0);
        Rectangle rectangle=new Rectangle("rectangle1",4.0,6.0);

        cercle.afficherDetails();
        rectangle.afficherDetails();
        System.out.println("Aire du cercle : "+cercle.calculerAire());
        System.out.println("Aire du rectangle : "+rectangle.calculerAire());

        System.out.println(Forme.compareAire(cercle,rectangle));

        //Utilisation du polymorphisme avec un tableau de formes

        Forme[] formes={cercle,rectangle};
        System.out.println();
        System.out.println("detail du tableau de formes");
        System.out.println("###########################");

        for (Forme forme:formes) {

             forme.afficherDetails();
            System.out.println("###########################");

        }



        //Utilisation du polymorphisme pour calculer aire total de mes formes
        double aireTotal=0.0;
        for (Forme forme:formes) {

            aireTotal+= forme.calculerAire();


        }
        System.out.println("Aire totale des formes : "+aireTotal);


        Cercle cercle2=new Cercle("cercle2",8.0);
        Rectangle rectangle2=new Rectangle("rectangle2",8.0,16.0);

        Calculable[] formes2={cercle2,rectangle2};
        double aireTotal2=0.0;

        for (Calculable forme : formes2) {

            aireTotal2+= forme.calculerAire() ;
        }
        System.out.println("Aire total des formes 2 : "+aireTotal2);

        for (Calculable forme : formes2) {

            if(forme instanceof Forme){
                //cast
                ((Forme)forme).afficherDetails();
                System.out.println("##############################");
            }
        }



    }
}
