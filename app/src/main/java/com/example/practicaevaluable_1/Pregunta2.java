package com.example.practicaevaluable_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pregunta2 extends AppCompatActivity {

    Button Leon;
    Button Perro;
    Button Halcon;
    Button Ballena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta2);

        Leon= (Button)findViewById(R.id.Leon);
        Perro= (Button)findViewById(R.id.Perro);
        Halcon= (Button)findViewById(R.id.Halcon);
        Ballena= (Button)findViewById(R.id.Ballena);

        Leon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Leon.setTextColor(Color.RED);
                Perro.setTextColor(Color.RED);
                Halcon.setTextColor(Color.GREEN);
                Ballena.setTextColor(Color.RED);
            }
        });

        Perro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Leon.setTextColor(Color.RED);
                Perro.setTextColor(Color.RED);
                Halcon.setTextColor(Color.GREEN);
                Ballena.setTextColor(Color.RED);
            }
        });

        Halcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Leon.setTextColor(Color.RED);
                Perro.setTextColor(Color.RED);
                Halcon.setTextColor(Color.GREEN);
                Ballena.setTextColor(Color.RED);
            }
        });

        Ballena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Leon.setTextColor(Color.RED);
                Perro.setTextColor(Color.RED);
                Halcon.setTextColor(Color.GREEN);
                Ballena.setTextColor(Color.RED);
            }
        });
    }
    public void volverElegir(View view){
        Intent i = new Intent(this, ElegirPregunta.class);
        startActivity(i);
    }

}