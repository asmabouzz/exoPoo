package org.example.exoHotel;

import org.example.exoBiblio.Livre;

import java.util.ArrayList;

public class Reservation {

    private int numReservation;
    private StatusReservationEnum StatusReservationEnum ;
    private ArrayList<Chambre> chambres;

    private Client client;


    //constructeur

    public Reservation(int numReservation, org.example.exoHotel.StatusReservationEnum statusReservationEnum, ArrayList<Chambre> chambres, Client client) {
        this.numReservation = numReservation;
        StatusReservationEnum = statusReservationEnum;
        this.chambres = chambres;
        this.client = client;
    }


    //getteur setteur

    public int getNumReservation() {
        return numReservation;
    }

    public void setNumReservation(int numReservation) {
        this.numReservation = numReservation;
    }

    public org.example.exoHotel.StatusReservationEnum getStatusReservationEnum() {
        return StatusReservationEnum;
    }

    public void setStatusReservationEnum(org.example.exoHotel.StatusReservationEnum statusReservationEnum) {
        StatusReservationEnum = statusReservationEnum;
    }

    public ArrayList<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(ArrayList<Chambre> chambres) {
        this.chambres = chambres;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    //toString


    @Override
    public String toString() {
        return "Reservation{" +
                "numReservation=" + numReservation +
                ", StatusReservationEnum=" + StatusReservationEnum +
                ", chambres=" + chambres +
                ", client=" + client +
                '}';
    }
}
