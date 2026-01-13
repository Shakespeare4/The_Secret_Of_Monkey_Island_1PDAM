package com.shakespeare;

public abstract class Personatge {
    // attributes
    protected String nom;
    protected int vida;
    
    

    // constructor
    public Personatge(String nomP, int vidaP) {
        this.nom = nomP;
        this.vida = vidaP;
    }

    // methods
    public abstract boolean vida();
    
}