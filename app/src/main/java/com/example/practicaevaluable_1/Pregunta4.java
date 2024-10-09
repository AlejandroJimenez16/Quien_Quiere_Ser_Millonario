package com.example.practicaevaluable_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pregunta4 extends AppCompatActivity {
    Button AG;
    Button AU;
    Button N;
    Button OR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta4);

        AG = (Button) findViewById(R.id.AG);
        AU = (Button) findViewById(R.id.AU);
        N = (Button) findViewById(R.id.N);
        OR = (Button) findViewById(R.id.OR);

        AG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AG.setTextColor(Color.RED);
                AU.setTextColor(Color.GREEN);
                N.setTextColor(Color.RED);
                OR.setTextColor(Color.RED);

            }
        });

        AU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AG.setTextColor(Color.RED);
                AU.setTextColor(Color.GREEN);
                N.setTextColor(Color.RED);
                OR.setTextColor(Color.RED);

            }
        });

        N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AG.setTextColor(Color.RED);
                AU.setTextColor(Color.GREEN);
                N.setTextColor(Color.RED);
                OR.setTextColor(Color.RED);

            }
        });

        OR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AG.setTextColor(Color.RED);
                AU.setTextColor(Color.GREEN);
                N.setTextColor(Color.RED);
                OR.setTextColor(Color.RED);

            }
        });

    }
    public void volverElegir(View view){
        Intent i = new Intent(this, ElegirPregunta.class);
        startActivity(i);
    }


}