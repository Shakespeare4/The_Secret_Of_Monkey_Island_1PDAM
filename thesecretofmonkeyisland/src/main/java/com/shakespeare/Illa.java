package com.shakespeare;

import java.util.Random; // we import the Random class

public class Illa {
    // attributes
    private Random ra = new Random();
    private String nom;
    private Pirata illa[];
    private Pirata pirataIntroduit;
    private int longIlla;

    private String[] nameOptionsIlla = { // we create an array with the possible island names
            "Mêlée",
            "Booty",
            "Scabb",
            "Monkey Island"
    };
            private String[] opcionsNomPirata = { // we create an array with the possible pirate names
            "John pirata",
            "Largo LaGrande",
            "Jerry el Gallego",
            "Antonio Matapulpos",
            "Eustaquio el iluminado",
            "Oriol el bufagaites",
            "Jacobo Gorrión",
            "Gato Pirata"
    };

    // Constructor
    public Illa() {
        this.illa = new Pirata[ra.nextInt(2, 8)]; // we initialize the size of the island
        this.longIlla = illa.length; // we save the array length in a variable
        this.nom = nameOptionsIlla[ra.nextInt(4)];// we choose a random name from our options
        for (int i = 1; i < longIlla; i++) { // we fill each position of the island array with a new pirate
            pirataIntroduit = new PirataNormal(opcionsNomPirata[ra.nextInt(8)], ra.nextInt(1,3)); // each pirate has a random name
            illa[i] = pirataIntroduit;
        }
        pirataIntroduit = new LeChuck("Pirata Lechuck", ra.nextInt(2,7)); // the pirate at position 0, which in our case is the last, is always LeChuck
        illa[0] = pirataIntroduit;
    }

    // getters
    public int getLongitudIlla() { // to ask for the island's length
        return illa.length;
    }

    public String getnomIlla() { // to ask for the island's name
        return this.nom;
    }

    // methods
    public Pirata vullUnPirata(int index) { // to ask for a pirate within the island
        return illa[index];

    }

}
