package com.shakespeare;

import java.util.Scanner;

public abstract class Heroi extends Personatge implements Fight, Speak {
    // attributes
    protected Scanner sc = new Scanner(System.in);
    protected boolean hViu;
    protected int resposta;
    protected String respostaString;
    protected String[] opcionsResposta = { // we create an array with the possible answers
            "Do I look that much like your fiancée?",
            "Lucky that you fight like a cow!",
            "I'm glad you went to your family reunion!",
            "With breath like that, they must have drowned!",
            "A shame that nobody has heard of you!",
            "He must have taught you everything you know!",
            "Why, do you want me to lend you one?",
            "If they exist, only you never learned them.",
            "At least mine know which one they are!"
    };

    // constructor
    public Heroi(String nomH, int vidaH) {
        super(nomH, vidaH);
        this.hViu = true; // we initialize the status as alive

    }

    // getters

    public boolean getestatheroi() { // to ask for the hero's status
        return hViu;
    }

    public String getRespostaHeroi() {
        return this.respostaString;
    }

    public String getNomHeroi() {
        return this.nom;
    }

    public int getVidaHeroi(){
        return this.vida;
    }

    // setters
    public void setnomheroi(String newnom) { // to change the hero's name
        this.nom = newnom;
    }

    // methods
    public void defensar() { // to print the response options and return the chosen result
        for (int i = 0; i < opcionsResposta.length; i++) {
            System.out.println((i + 1) + "- " + opcionsResposta[i]);
        }
        this.resposta = sc.nextInt(); // we ask for the answer
        this.respostaString = opcionsResposta[this.resposta - 1];
        // we pass the corresponding value from the array
    }

    public void sayHello() {

    }

    public void sayGoodBye() {

    }

    public void insultar() {

    }

    public boolean vida() { // to reduce the hero's health and check if he is still alive
        this.vida--;
        if (vida > 0) {
            this.hViu = true;
        } else {
            this.hViu = false;
        }
        return hViu;
    }

}
