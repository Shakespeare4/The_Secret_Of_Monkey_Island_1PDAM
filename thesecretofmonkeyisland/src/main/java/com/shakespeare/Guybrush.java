package com.shakespeare;

import java.util.Random;

public class Guybrush extends Heroi {
    // attributes
    private String[] respostes = new String[4];
    private int respostaOriginal;
    private Random ra = new Random();

    // constructor
    public Guybrush(String nom, int vida) {
        super(nom, vida);
        this.nom = nom;
        this.vida = vida;
        this.hViu = true;
    }
    
    // methods
    @Override // overrides the parent method
    public void defensar() { // prints the response options and stores the selected value
        respostaOriginal = ra.nextInt(9);
        for (int c = 0; c < 4; ++c) { // chooses 4 responses starting from a random position in the array
            if (respostaOriginal == opcionsResposta.length - 1) { // we check if the chosen answer is greater than the number of insults
                respostes[c] = opcionsResposta[respostaOriginal]; // we save the chosen answer in the array
                respostaOriginal = 0; // we reset the answer position to 0 to start from the beginning
            } else {
                respostes[c] = opcionsResposta[respostaOriginal];
                ++respostaOriginal;
            }

        }
        for (int i = 0; i < respostes.length; i++) { // we print all the chosen answers
            System.out.println((i + 1) + " " + respostes[i]);
        }
        System.out.println();
        this.resposta = sc.nextInt(); // we ask for the answer
        System.out.println();
        this.respostaString = respostes[this.resposta - 1];
        // we pass the corresponding value from the array
    }

    public void sayHello() {
        System.out.println("I am Guybrush Threepwood, great pirate!");
        System.out.println();
    }

    public void sayGoodBye() {
        System.out.println("That's all folks!");
        System.out.println();

    }


    @Override
    public boolean vida() { // to reduce the hero's health and check if he is still alive
        this.vida -= 2;
        if (this.vida > 0) {
            this.hViu = true;
        } else {
            this.hViu = false;
        }
        return hViu;
    }
}
