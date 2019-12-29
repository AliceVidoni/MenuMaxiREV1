package com.example.menmaxi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.num_tavolo);
    }

    public void nuovaPagina(View v) {
        Intent paginaCategorie = new Intent(this, SelectCategoria.class);
        //paginaCategorie.putExtra("Numero_Tavolo", num_tavolo);
        startActivity(paginaCategorie);
    }
}