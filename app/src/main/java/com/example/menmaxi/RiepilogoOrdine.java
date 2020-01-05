package com.example.menmaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RiepilogoOrdine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riepilogo_ordine);
    }

    public void metodoPagamento(View v) {
        Intent ordine = new Intent(this, MetodoPagamento.class);
        startActivity(ordine);
    }

    public void tornaCategoria(View v) {
        Intent ordine = new Intent(this, SelectCategoria.class);
        startActivity(ordine);
    }
}
