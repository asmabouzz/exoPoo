package org.example.heritage;

public class Chat extends Animal{

    private int vies;

    public Chat(String nom, int age, String couleur,int vies) {
        super(nom, age, couleur);
        this.vies = 7;
    }
}
