package com.example.menmaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class RichiestaConfermata extends AppCompatActivity implements Runnable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_richiesta_confermata);
        Handler mHandler =new Handler();
        mHandler.postDelayed(this, 8000);
    }


    @Override
    public void run() {
        Intent intent=new Intent (this, MainActivity.class);
        startActivityForResult(intent, 100);
    }
}
