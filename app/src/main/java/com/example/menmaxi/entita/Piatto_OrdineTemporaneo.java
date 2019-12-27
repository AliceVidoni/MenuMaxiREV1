package com.example.menmaxi.entita;

public class Piatto_OrdineTemporaneo {

    Piatto piatto;
    Ordine_Temporaneo ordine_temporaneo;

    public Piatto_OrdineTemporaneo() {
    }

    public Piatto_OrdineTemporaneo(Piatto piatto, Ordine_Temporaneo ordine_temporaneo) {
        this.piatto = piatto;
        this.ordine_temporaneo = ordine_temporaneo;
    }

    public Piatto getPiatto() {
        return piatto;
    }

    public void setPiatto(Piatto piatto) {
        this.piatto = piatto;
    }

    public Ordine_Temporaneo getOrdine_temporaneo() {
        return ordine_temporaneo;
    }

    public void setOrdine_temporaneo(Ordine_Temporaneo ordine_temporaneo) {
        this.ordine_temporaneo = ordine_temporaneo;
    }
}
