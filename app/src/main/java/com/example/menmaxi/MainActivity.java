package com.example.menmaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import web.ServerRequests;

public class MainActivity extends AppCompatActivity {

    String categoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ServerRequests sr=new ServerRequests(this);
        sr.downloadMenu();

        Button btnPanini=findViewById(R.id.panini);
        Button btnFritti=findViewById(R.id.fritti);
        Button btnDolci=findViewById(R.id.dolce);
        Button btnBibite=findViewById(R.id.bibite);
        String categoria="";
       /* View.OnClickListener gestore=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String categoria="";
                switch (v.getId()) {
                    case R.id.panini:
                        categoria="Panini";
                        break;
                    case R.id.fritti:
                        categoria="Fritti";
                        break;
                    case R.id.bibite:
                        categoria="Bibite";
                        break;
                    case R.id.dolce:
                        categoria="Dolce";
                        break;
                }
            }
        };

        btnBibite.setOnClickListener(gestore);
        btnDolci.setOnClickListener(gestore);
        btnFritti.setOnClickListener(gestore);
        btnPanini.setOnClickListener(gestore); */


    }

    public void metodoPagamento(View v) {
        Intent in=new Intent (this, MetodoPagamento.class);
        startActivity(in);
    }

    public void vaiCategoria(View v) {
        Intent i=new Intent(this, CategoriaSelezionata.class);
        // i.putExtra("categoria", categoria);
        startActivity(i);
    }

    public void vediOrdine(View v) {
        /* se esiste un ordine
            Intent in=new Intent(this, OrdinePieno.class);
            startActivity(in);
          altrimenti
            Intent in=new Intent(this, OrdineVuoto.class);
            startActivity(in);
         */
    }
}