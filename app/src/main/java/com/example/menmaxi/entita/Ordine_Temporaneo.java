package com.example.menmaxi.entita;

public class Ordine_Temporaneo {

    int id;
    int num_tavolo;
    double prezzo_tot;
    int ordine_effettivo;

    public Ordine_Temporaneo() {
    }

    public Ordine_Temporaneo(int num_tavolo, int ordine_effettivo) {
        this.num_tavolo = num_tavolo;
        this.ordine_effettivo = ordine_effettivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_tavolo() {
        return num_tavolo;
    }

    public void setNum_tavolo(int num_tavolo) {
        this.num_tavolo = num_tavolo;
    }

    public double getPrezzo_tot() {
        return prezzo_tot;
    }

    public void setPrezzo_tot(double prezzo_tot) {
        this.prezzo_tot += prezzo_tot;
    }

    public int getOrdine_effettivo() {
        return ordine_effettivo;
    }

    public void setOrdine_effettivo(int ordine_effettivo) {
        this.ordine_effettivo = ordine_effettivo;
    }
}
