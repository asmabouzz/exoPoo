package org.example.statique;

public class Main {
    public static void main(String[] args) {


        Citerne citerne = new Citerne(175.0,600,10.0);
        Citerne citerne1 = new Citerne(70.0,800,25.0);


        System.out.println("volume de depart de waterTank1 est de : "+citerne.getNiveauRemplissage());
        System.out.println("volume de depart de waterTank2 est de : "+citerne1.getNiveauRemplissage());
        System.out.println("le total est de : "+Citerne.getTotal());


        citerne1.remplir(5.0);
        System.out.println("le total devien : "+Citerne.getTotal());

        citerne.remplir(60.0);
        System.out.println("le total devien : "+Citerne.getTotal());

        citerne1.vider(5.0);
        System.out.println("le total devien : "+Citerne.getTotal());

        citerne1.vider(20.0);
        System.out.println("le total devien : "+Citerne.getTotal());



        System.out.println("le volume de waterTank1 est de "+citerne.getNiveauRemplissage());
        System.out.println("le volume de waterTank2 est de "+citerne1.getNiveauRemplissage());
        System.out.println("le poid total de waterTank1 est de "+citerne.poidsFinal());
        System.out.println("le poid total de waterTank2 est de "+citerne1.poidsFinal());





    }

}
