package com.example.menmaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RimuoviPortata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rimuovi_portata);
    }

    public void tornaOrdine(View v) {
        Intent ordine = new Intent(this, OrdinePieno.class);
        startActivity(ordine);
    }
}
