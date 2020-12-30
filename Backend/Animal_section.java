package com.example.kidslearningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Animal_section extends AppCompatActivity implements View.OnClickListener {
    private CardView Wild_animal_Card, Sea_animal_Card, Farm_animal_Card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_section);

        Wild_animal_Card = findViewById(R.id.Wild_Animal_Card);
        Sea_animal_Card = findViewById(R.id.Sea_Animal_Card);
        Farm_animal_Card = findViewById(R.id.Farm_Animal_Card);

        Wild_animal_Card.setOnClickListener(this);
        Sea_animal_Card.setOnClickListener(this);
        Farm_animal_Card.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.Wild_Animal_Card:
                i = new Intent(this, Wild_animal.class);
                startActivity(i);
                break;

            case R.id.Sea_Animal_Card:
                i = new Intent(this, Sea_Animal.class);
                startActivity(i);
                break;

            case R.id.Farm_Animal_Card:
                i = new Intent(this, Farm_animal.class);
                startActivity(i);
                break;
        }
    }
}