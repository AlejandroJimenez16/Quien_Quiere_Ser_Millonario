package com.example.practicaevaluable_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pregunta3 extends AppCompatActivity {

    Button num1;
    Button num2;
    Button num3;
    Button num4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3);

        num1 = (Button)findViewById(R.id.num1);
        num2 = (Button)findViewById(R.id.num2);
        num3 = (Button)findViewById(R.id.num3);
        num4 = (Button)findViewById(R.id.num4);

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setTextColor(Color.RED);
                num2.setTextColor(Color.RED);
                num3.setTextColor(Color.RED);
                num4.setTextColor(Color.GREEN);
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setTextColor(Color.RED);
                num2.setTextColor(Color.RED);
                num3.setTextColor(Color.RED);
                num4.setTextColor(Color.GREEN);
            }
        });


        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setTextColor(Color.RED);
                num2.setTextColor(Color.RED);
                num3.setTextColor(Color.RED);
                num4.setTextColor(Color.GREEN);
            }
        });


        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setTextColor(Color.RED);
                num2.setTextColor(Color.RED);
                num3.setTextColor(Color.RED);
                num4.setTextColor(Color.GREEN);
            }
        });
    }
}