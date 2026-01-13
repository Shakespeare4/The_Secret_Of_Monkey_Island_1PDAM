package com.shakespeare;
public class PirataNormal extends Pirata {

    // constructor
    public PirataNormal(String nom, int vida) {
        super(nom, vida);
        this.nom = nom;
        this.pViu = true;
        this.insultsElegits = new String[3];
        insultOriginal1 = ra.nextInt(8);
        insultOriginal2 = ra.nextInt(8);
        insultOriginal3 = ra.nextInt(8);
        while (insultOriginal1 == insultOriginal2) {
            insultOriginal2 = ra.nextInt(8);
        }
        while (insultOriginal1 == insultOriginal3 || insultOriginal2 == insultOriginal3) {
            insultOriginal3 = ra.nextInt(8);
        }
        insultsElegits[0] = this.opcionsInsult[insultOriginal1]; // we assign the chosen insults to the insults array 
        insultsElegits[1] = this.opcionsInsult[insultOriginal2];
        insultsElegits[2] = this.opcionsInsult[insultOriginal3];
    }

    // methods
    public boolean replica(String response) { // to check if the hero's answer is correct
        return response.equals(opcionsResposta[posicioOriginal]);

    }



    public void sayHello() { // greeting
        System.out.println("Do you think you are pirate material? Because why don't you draw and we find out!");
        System.out.println();
    }

    public void sayGoodBye() { // goodbye
        System.out.println("Well, I can't even beat you with a handicap!");
        System.out.println();
    }
}
