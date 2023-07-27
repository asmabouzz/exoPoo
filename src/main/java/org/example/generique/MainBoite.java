package org.example.generique;

import org.example.heritage.Chat;

public class MainBoite {
    public static void main(String[] args) {
        //boite pour String
        Boite<String> boite = new Boite<>("asma");
        String contenueString = boite.getContenu();
        System.out.println("Contenu de la boite string "+contenueString);

       //boite pour objet chat
        Boite<Chat> boiteChat = new Boite<>(new Chat("fifi",42,"bleu",4));
        String contenueChat = String.valueOf(boiteChat.getContenu());
        System.out.println("Contenu de la boite string "+contenueChat);

        //boite pour double
        Boite<Double> boiteDouble = new Boite<>(5.0);
        String contenueDouble = String.valueOf(boiteDouble.getContenu());
        System.out.println("Contenu de la boite string "+contenueDouble);
    }
}
