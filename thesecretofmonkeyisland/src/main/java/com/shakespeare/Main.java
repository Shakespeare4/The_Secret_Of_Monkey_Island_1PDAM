
package com.shakespeare;

import java.util.Scanner; // we import the Scanner class

public class Main {
    public static void main(String[] args) {
        // we create the attributes
        Scanner sc = new Scanner(System.in);
        Illa carib = new Illa(); // we create the island
        boolean esCorrecte, start = false;
        Pirata pirataRonda;
        int input, illaLongitud;
        Heroi h = null;
        // Game introduction
        while (start == false) { // we make the player choose a character and ensure it is valid
            System.out.println("Choose the hero of our story: ");
            System.out.println("1- Guybrush Threepwood");
            System.out.println("2- Elaine Marlen");
            input = sc.nextInt();
            if (input == 1) {
                h = new Guybrush("Guybrush Threepwood", 10);
                start = true;
            } else if (input == 2) {
                h = new Elaine("Elaine Marlen", 10);
                start = true;
            } else {
                System.out.println("That is not a valid hero");
            }
        }
        h.sayHello();
        illaLongitud = carib.getLongitudIlla();
        System.out.println();
        System.out.println(h.getNomHeroi() + " enters the island " + carib.getnomIlla() + "...");
        System.out.println();

        // The game begins
        while (h.getestatheroi() && illaLongitud > 0) { // while the hero is alive and the island has pirates
            pirataRonda = carib.vullUnPirata(illaLongitud - 1); // we ask for a pirate from the end of the island array
            System.out.println("The pirate "+pirataRonda.getNomPirata()+" approaches...");
            System.out.println();
            pirataRonda.sayHello();
            // The round begins
            while (h.getestatheroi() && pirataRonda.getEstatpirata()) { // while the hero and pirate of the round are alive
                pirataRonda.insultar(); // the pirate insults
                h.defensar(); // the hero responds
                esCorrecte = pirataRonda.replica(h.getRespostaHeroi()); // we check if the answer is correct
                if (esCorrecte) { // if it is correct
                    System.out.println("Agh! This round... is yours!");
                    System.out.println();
                    pirataRonda.vida(); // we reduce the pirate's health
                } else { // if it is incorrect
                    System.out.println("Has a leech taught you to speak? This one is mine!");
                    System.out.println();
                    h.vida(); // we reduce the hero's health
                    h.getestatheroi();
                }

                if (!pirataRonda.getEstatpirata()) { // if the pirate has died
                    pirataRonda.sayGoodBye();
                    System.out.println();
                    System.out.println(h.getNomHeroi() + " has " + h.getVidaHeroi() + " health points remaining");
                    System.out.println();
                } else if (!h.getestatheroi()) { // if the hero has died
                    h.sayGoodBye();
                    System.out.println();
                } else { // if both are alive
                    System.out.println(h.getNomHeroi() + " has " + h.getVidaHeroi() + " health points remaining");
                    System.out.println();
                    System.out.println(pirataRonda.getNomPirata() + " has " + pirataRonda.getVidaPirata() + " health points remaining");
                    System.out.println();
                }
            }
            illaLongitud--; // we subtract one from the island's length

        }
        if (h.getestatheroi()) { // if the hero is still alive at the end of the game
            System.out.println("Congratulations " + h.getNomHeroi() + "! You have conquered the island " + carib.getnomIlla() + "!"); // we print the final victory message
            System.out.println();
            System.out.println("Don't forget your complementary 100% cotton t-shirt");
            System.out.println();
        }
        sc.close(); // we close the scanner
    }
}