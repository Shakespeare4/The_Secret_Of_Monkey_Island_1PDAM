package com.shakespeare;

import java.util.Random; // we import the Random class

public abstract class Pirata extends Personatge implements Speak, Fight {
    protected Random ra = new Random(); // we initialize the random
    protected String[] insults;
    protected String[] insultsElegits;
    protected boolean pViu, unique;
    protected int insultOriginal1, insultOriginal2, insultOriginal3, posicioOriginal, posInsult;
    protected String[] opcionsInsult = { // we create an array with the possible insults
    "You are as repulsive as a monkey in lingerie!",
    "You fight like a farmer!",
    "I have spoken to apes more educated than you!",
    "Every enemy I have fought has been annihilated!",
    "My sword is known throughout the Caribbean!",
    "I had a dog more intelligent than you!",
    "Have you finally stopped wearing diapers?",
    "There are no words for how revolting you are.",
    };
    protected String[] opcionsResposta = { // we create an array with the possible answers
    "Do I look that much like your fiancée?",
    "Lucky that you fight like a cow!",
    "I'm glad you went to your family reunion!",
    "With breath like that, they must have drowned!",
    "A shame that nobody has heard of you!",
    "He must have taught you everything you know!",
    "Why, do you want me to lend you one?",
    "If they exist, only you never learned them.",
    };
    // constructor
    public Pirata(String nouNom, int novaVida) {
        super(nouNom, novaVida);
        this.nom = nouNom;
        this.vida = novaVida;
        insults = new String[3]; // we initialize the insults array
        vida = ra.nextInt(1, 4); // we initialize health with a random value between 1 and 3
        pViu = true; // we initialize the status as alive

    }

    //getters

    public boolean getEstatpirata() { // to ask for the pirate's status
        return this.pViu;
    }

    public String getNomPirata() { // to ask for the pirate's name
        return this.nom;
    }
    public int getVidaPirata(){
        return this.vida;
    }

        public void insultar() { // to return a random insult and save its original position
        posInsult = ra.nextInt(insultsElegits.length);
        if (insultsElegits[posInsult].equals(opcionsInsult[insultOriginal1])) {
            posicioOriginal = insultOriginal1;
        } else if (insultsElegits[posInsult].equals(opcionsInsult[insultOriginal2])) {
            posicioOriginal = insultOriginal2;
        } else if (insultsElegits[posInsult].equals(opcionsInsult[insultOriginal3])) {
            posicioOriginal = insultOriginal3;
        } else if(posInsult == 3) { // the number 3 can only be LeChuck's unique insult, so we check that it is with a boolean
            unique = true;
        }
        System.out.println(insultsElegits[posInsult]);
        System.out.println();
    }
        public boolean vida() { // to reduce the pirate's health and check if he is still alive
        --this.vida;
        if (vida > 0) {
            this.pViu = true;
        } else {
            this.pViu = false;
        }
        return pViu;
    }
    public abstract boolean replica(String response);

    public void defensar(){

    }
}
