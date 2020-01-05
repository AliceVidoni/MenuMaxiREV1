package com.example.menmaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectCategoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_categoria);
    }

    public void riepilogoOrdine(View v) {
        Intent ordine = new Intent(this, RiepilogoOrdine.class);
        startActivity(ordine);
    }
}
