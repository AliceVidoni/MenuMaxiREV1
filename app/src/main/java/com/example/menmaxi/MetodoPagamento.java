package com.example.menmaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MetodoPagamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodo_pagamento);
    }

    public void confermaRichiesta(View v) {
        Intent richiesta= new Intent(this, RichiestaConfermata.class);
        startActivity(richiesta);
    }

    public void tornaOrdine(View v) {
        Intent ordine = new Intent(this, RiepilogoOrdine.class);
        startActivity(ordine);
    }
}
