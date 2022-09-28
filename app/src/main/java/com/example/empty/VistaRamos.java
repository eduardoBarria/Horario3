package com.example.empty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VistaRamos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_ramos);
    }
    public void onClick(View view){
        // Toast.makeText(getApplicationContext(), "Cambiando de actividad", Toast.LENGTH_LONG;
        Intent i = new Intent(VistaRamos.this, VistaAgregarRamos.class);
        startActivity(i);
    }

    public void onClick2(View view){
        // Toast.makeText(getApplicationContext(), "Cambiando de actividad", Toast.LENGTH_LONG;
        Intent i = new Intent(VistaRamos.this, VistaAgregarRamos.class);
        startActivity(i);
    }
}