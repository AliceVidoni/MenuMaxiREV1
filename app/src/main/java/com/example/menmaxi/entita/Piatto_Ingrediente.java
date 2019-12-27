package com.example.menmaxi.entita;

public class Piatto_Ingrediente {

    Piatto piatto;
    Ingrediente ingrediente;

    public Piatto_Ingrediente() {
    }

    public Piatto_Ingrediente(Piatto piatto, Ingrediente ingrediente) {
        this.piatto = piatto;
        this.ingrediente = ingrediente;
    }

    public Piatto getPiatto() {
        return piatto;
    }

    public void setPiatto(Piatto piatto) {
        this.piatto = piatto;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
}
