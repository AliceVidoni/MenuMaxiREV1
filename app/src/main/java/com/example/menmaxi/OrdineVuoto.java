package com.example.menmaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrdineVuoto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordine_vuoto);
    }

    public void tornaCategoria(View v) {
        Intent paginaCategorie = new Intent(this, MainActivity.class);
        startActivity(paginaCategorie);
    }
}
