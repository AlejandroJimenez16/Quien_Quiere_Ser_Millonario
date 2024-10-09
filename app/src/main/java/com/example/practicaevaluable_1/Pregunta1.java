package com.example.practicaevaluable_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Pregunta1 extends AppCompatActivity {

    Button boton1;
    Button boton2;
    Button boton3;
    Button boton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta1);

        boton1 = (Button) findViewById(R.id.bt1);
        boton2 = (Button) findViewById(R.id.bt2);
        boton3 = (Button) findViewById(R.id.bt3);
        boton4 = (Button) findViewById(R.id.bt4);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton1.setTextColor(Color.GREEN);
                boton2.setTextColor(Color.RED);
                boton3.setTextColor(Color.RED);
                boton4.setTextColor(Color.RED);

            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton1.setTextColor(Color.GREEN);
                boton2.setTextColor(Color.RED);
                boton3.setTextColor(Color.RED);
                boton4.setTextColor(Color.RED);

            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton1.setTextColor(Color.GREEN);
                boton2.setTextColor(Color.RED);
                boton3.setTextColor(Color.RED);
                boton4.setTextColor(Color.RED);

            }
        });

        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton1.setTextColor(Color.GREEN);
                boton2.setTextColor(Color.RED);
                boton3.setTextColor(Color.RED);
                boton4.setTextColor(Color.RED);

            }
        });
    }
    public void volverElegir(View view){
        Intent i = new Intent(this, ElegirPregunta.class);
        startActivity(i);
    }
}