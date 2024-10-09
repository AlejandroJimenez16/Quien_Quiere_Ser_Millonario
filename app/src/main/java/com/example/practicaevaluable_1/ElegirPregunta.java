package com.example.practicaevaluable_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ElegirPregunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_pregunta);
    }

    public void volver(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void irPreg1(View view){
        Intent i = new Intent(this,Pregunta1.class);
        startActivity(i);
    }

    public void irPreg2(View view){
        Intent i = new Intent(this,Pregunta2.class);
        startActivity(i);
    }

    public void irPreg3(View view){
        Intent i = new Intent(this,Pregunta3.class);
        startActivity(i);
    }

    public void irPreg4(View view){
        Intent i = new Intent(this,Pregunta4.class);
        startActivity(i);
    }
}