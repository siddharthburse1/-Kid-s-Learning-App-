package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Sea_Animal extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    TextView txt;
    MediaPlayer angelfish,anglerfish,clownfish,crab,dolphin,jellyfish,octopus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sea__animal);
        //Audio   Declaration
        angelfish =MediaPlayer.create(Sea_Animal.this,R.raw.angelfish);
        anglerfish =MediaPlayer.create(Sea_Animal.this,R.raw.anglerfish);
        clownfish =MediaPlayer.create(Sea_Animal.this,R.raw.clownfish);
        crab =MediaPlayer.create(Sea_Animal.this,R.raw.crab);
        dolphin =MediaPlayer.create(Sea_Animal.this,R.raw.dolphin);
        jellyfish =MediaPlayer.create(Sea_Animal.this,R.raw.jellyfish);
        octopus =MediaPlayer.create(Sea_Animal.this,R.raw.octopus);


        img = findViewById(R.id.img_sea_animal);
        txt = findViewById(R.id.txt_sea_animal);
        //Declaration of  Button
        Button Angelfish = findViewById(R.id.btn_anglefish);
        Button Anglerfish = findViewById(R.id.btn_anglerfish);
        Button Clownfish = findViewById(R.id.btn_clownfish);
        Button Crab = findViewById(R.id.btn_crab);
        Button Dolphin = findViewById(R.id.btn_dolphin);
        Button Jellyfish = findViewById(R.id.btn_jellyfish);
        Button Octopus = findViewById(R.id.btn_octopus);
        Button Next_sea_animal = findViewById(R.id.btn_Next_Sea_animal);

        Angelfish.setOnClickListener(this);
        Anglerfish.setOnClickListener(this);
        Clownfish.setOnClickListener(this);
        Crab.setOnClickListener(this);
        Dolphin.setOnClickListener(this);
        Jellyfish.setOnClickListener(this);
        Octopus.setOnClickListener(this);
        Next_sea_animal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.btn_anglefish:
                angelfish.start();
                txt.setText("ANGLEFISH");
                img.setImageResource(R.mipmap.anglefish);
                break;
            case R.id.btn_anglerfish:
                anglerfish.start();
                txt.setText("ANGLERFISH");
                img.setImageResource(R.mipmap.anglerfish);
                break;
            case R.id.btn_clownfish:
                clownfish.start();
                txt.setText("CLOWNFISH");
                img.setImageResource(R.mipmap.clownfish);
                break;
            case R.id.btn_crab:
                crab.start();
                txt.setText("CRAB");
                img.setImageResource(R.mipmap.crab);
                break;
            case R.id.btn_dolphin:
                dolphin.start();
                txt.setText("DOLPHIN");
                img.setImageResource(R.mipmap.dolphin);
                break;
            case R.id.btn_jellyfish:
                jellyfish.start();
                txt.setText("JELLYFISH");
                img.setImageResource(R.mipmap.jellyfish);
                break;
            case R.id.btn_octopus:
                octopus.start();
                txt.setText("OCTOPUS");
                img.setImageResource(R.mipmap.octopus);
                break;
            case R.id.btn_Next_Sea_animal:
                i = new Intent(this,Sea_animal_SecondPage.class);
                startActivity(i);
                break;
        }
    }
}