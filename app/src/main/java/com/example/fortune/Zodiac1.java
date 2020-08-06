package com.example.fortune;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Zodiac1 extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac1);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Zod1 = new Intent(Zodiac1.this,Aquarious.class);
                startActivity(Zod1);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Zod2 = new Intent(Zodiac1.this,Pisces.class);
                startActivity(Zod2);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Zod3 = new Intent(Zodiac1.this,Aries.class);
                startActivity(Zod3);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Zod4 = new Intent(Zodiac1.this,Taurus.class);
                startActivity(Zod4);

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Zod5 = new Intent(Zodiac1.this,Gemini.class);
                startActivity(Zod5);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Zod6 = new Intent(Zodiac1.this,Cancer.class);
                startActivity(Zod6);

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Zod7 = new Intent(Zodiac1.this,Leo.class);
                startActivity(Zod7);

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Zod8 = new Intent(Zodiac1.this,Virgo.class);
                startActivity(Zod8);

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Zod9 = new Intent(Zodiac1.this,Libra.class);
                startActivity(Zod9);

            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Zod10 = new Intent(Zodiac1.this,Scorpio.class);
                startActivity(Zod10);

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Zod11 = new Intent(Zodiac1.this,Sagittarius.class);
                startActivity(Zod11);

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Zod12 = new Intent(Zodiac1.this,Capricorn.class);
                startActivity(Zod12);

            }
        });

    }
}
