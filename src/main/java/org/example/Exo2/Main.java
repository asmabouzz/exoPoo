package org.example.Exo2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Film film1= new Film("La Haine","Mathieu Kassovitz", LocalDate.of(1995,05,31),"Drame");
        Film film2= new Film("Avatar","James Cameron",LocalDate.of(2022,12,14),"Action");

        System.out.println(film1);
        System.out.println(film2);
    }
}
