package com.example.menmaxi.entita;

import java.util.Date;

public class Ordine_Effettivo {

    int id;
    Date data;
    double prezzo_tot;

    public Ordine_Effettivo() {
    }

    public Ordine_Effettivo(Date data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getPrezzo_tot() {
        return prezzo_tot;
    }

    public void setPrezzo_tot(double prezzo_tot) {
        this.prezzo_tot = prezzo_tot;
    }
}
