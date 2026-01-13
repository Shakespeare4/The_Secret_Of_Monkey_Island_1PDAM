package com.shakespeare;
public class LeChuck extends Pirata {
    public LeChuck(String nom, int vida){
        super(nom, vida);
        this.vida = vida;
        this.insultsElegits = new String[4];
        insultOriginal1 = ra.nextInt(8);
        while (insultOriginal1 == insultOriginal2) { // we save the three random insults ensuring they don't repeat and the specific insult
        insultOriginal2 = ra.nextInt(8);
        }
        while(insultOriginal1==insultOriginal3||insultOriginal2==insultOriginal3) {
        insultOriginal3 = ra.nextInt(8);
        }
        insultsElegits[0] = opcionsInsult[insultOriginal1];
        insultsElegits[1] = opcionsInsult[insultOriginal2];
        insultsElegits[2] = opcionsInsult[insultOriginal3];
        insultsElegits[3] = "You are a disgrace to your species!";

        
    }
    
    public void sayHello() { // introduction
        System.out.println("I am LeChuck, the fearful ghost captain!");
        System.out.println();
    }
    
    public void sayGoodBye() { // goodbye
        System.out.println("You haven't seen the last of me!");
        System.out.println();
    }
        public boolean replica(String response) { // to check if the hero's answer is correct
        if(response.equals(opcionsResposta[posicioOriginal])){
            return true;
        }else if (response.equals("At least mine know which one they are!")&& unique == true) { // if the answer is correct for LeChuck's special insult
            unique = false; // we reset the boolean value
            return true;
            
        }else{
            return false;
        }

    }
}
