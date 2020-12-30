package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Sea_animal_SecondPage extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    TextView txt;
    MediaPlayer penguin,seahorse,seal,starfish,stingray,turtle,whale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sea_animal_second_p);

        //Audio of Wild animal name Declaration
        penguin = MediaPlayer.create(Sea_animal_SecondPage.this, R.raw.penguin);
        seahorse = MediaPlayer.create(Sea_animal_SecondPage.this, R.raw.seahorse);
        seal = MediaPlayer.create(Sea_animal_SecondPage.this, R.raw.seal);
        starfish = MediaPlayer.create(Sea_animal_SecondPage.this, R.raw.starfish);
        stingray = MediaPlayer.create(Sea_animal_SecondPage.this, R.raw.stingray);
        turtle = MediaPlayer.create(Sea_animal_SecondPage.this, R.raw.turtle);
        whale = MediaPlayer.create(Sea_animal_SecondPage.this, R.raw.whale);

        img = findViewById(R.id.img_sea_animalo);
        txt = findViewById(R.id.txt_sea_animalo);
        //Declaration of  Button
        Button Penguin = findViewById(R.id.btn_penguin);
        Button Seahorse = findViewById(R.id.btn_seahorse);
        Button Seal = findViewById(R.id.btn_seal);
        Button Starfish = findViewById(R.id.btn_starfish);
        Button Stingray = findViewById(R.id.btn_stingray);
        Button Turtle = findViewById(R.id.btn_turtle);
        Button Whale = findViewById(R.id.btn_whale);
        Button Back_sea_animal = findViewById(R.id.btn_back_sea_animal);

        Penguin.setOnClickListener(this);
        Seahorse.setOnClickListener(this);
        Seal.setOnClickListener(this);
        Starfish.setOnClickListener(this);
        Stingray.setOnClickListener(this);
        Turtle.setOnClickListener(this);
        Whale.setOnClickListener(this);
        Back_sea_animal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.btn_penguin:
                penguin.start();
                txt.setText("PENGUIN");
                img.setImageResource(R.mipmap.penguin);
                break;
            case R.id.btn_seahorse:
                seahorse.start();
                txt.setText("SEAHORSE");
                img.setImageResource(R.mipmap.seahorse);
                break;
            case R.id.btn_seal:
                seal.start();
                txt.setText("SEAL");
                img.setImageResource(R.mipmap.seal);
                break;
            case R.id.btn_starfish:
                starfish.start();
                txt.setText("STARFISH");
                img.setImageResource(R.mipmap.starfish);
                break;
            case R.id.btn_stingray:
                stingray.start();
                txt.setText("STINGRAY");
                img.setImageResource(R.mipmap.stingray);
                break;
            case R.id.btn_turtle:
                turtle.start();
                txt.setText("TURTLE");
                img.setImageResource(R.mipmap.turtle);
                break;
            case R.id.btn_whale:
                whale.start();
                txt.setText("WHALE");
                img.setImageResource(R.mipmap.whale);
                break;
            case R.id.btn_back_sea_animal:
                i = new Intent(this, Sea_Animal.class);
                startActivity(i);
                break;
        }
    }
}