package com.example.empty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
       // Toast.makeText(getApplicationContext(), "Cambiando de actividad", Toast.LENGTH_LONG;
        Intent i = new Intent(MainActivity.this, HorarioCompleto.class);
        startActivity(i);
    }
    public void onClick2(View view){
        // Toast.makeText(getApplicationContext(), "Cambiando de actividad", Toast.LENGTH_LONG;
        Intent a = new Intent(MainActivity.this, VistaRamos.class);
        startActivity(a);
    }
}