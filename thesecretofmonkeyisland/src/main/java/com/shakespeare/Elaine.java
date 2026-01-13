package com.shakespeare;

public class Elaine extends Heroi {
    //Constructor
    public Elaine(String nom, int vida) {
        super(nom, vida);
        this.nom = nom;
        this.vida = vida;
    }
//Methods
    public void sayHello() { // Elaine greets
        System.out.println("My name is Elaine Marlen, ruler of Melee island.");
    }

    public void sayGoodBye() { // Elaine says goodbye
        System.out.println("Au revoir, may our paths cross again.");

    }

}
