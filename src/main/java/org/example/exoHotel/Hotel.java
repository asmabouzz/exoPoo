package org.example.exoHotel;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Client> clients;
    private ArrayList<Chambre> chambres;

    private ArrayList<Reservation> reservations ;

    //constructeur


    public Hotel(ArrayList<Client> clients, ArrayList<Chambre> chambres, ArrayList<Reservation> reservations) {
        this.clients = clients;
        this.chambres = chambres;
        this.reservations = reservations;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(ArrayList<Chambre> chambres) {
        this.chambres = chambres;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }



    //toString


    @Override
    public String toString() {
        return "Hotel{" +
                "clients=" + clients +
                ", chambres=" + chambres +
                ", reservations=" + reservations +
                '}';
    }
}
