package com.example.menmaxi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.List;
import java.util.Map;

import entities.Menu;
import entities.Piatto;
import managers.MenuSingleton;
import web.ServerRequests;
import web.config.MMApi;

public class MainActivity extends AppCompatActivity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.num_tavolo);

        ServerRequests serverRequests = new ServerRequests(this);
        serverRequests.downloadMenu();
    }

    public void nuovaPagina(View v) {
        Intent paginaCategorie = new Intent(this, SelectCategoria.class);
        //paginaCategorie.putExtra("Numero_Tavolo", num_tavolo);
        startActivity(paginaCategorie);
    }



}