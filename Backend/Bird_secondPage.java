package com.example.kidslearningapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Bird_secondPage extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    TextView txt;
    MediaPlayer parrot,peacock,penguin,pigeon,sparrow,swan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird_second_page);
        //Audio Declaration
        parrot = MediaPlayer.create(Bird_secondPage.this, R.raw.parrot);
        peacock = MediaPlayer.create(Bird_secondPage.this, R.raw.peacock);
        penguin = MediaPlayer.create(Bird_secondPage.this, R.raw.penguin);
        pigeon = MediaPlayer.create(Bird_secondPage.this, R.raw.pigeon);
        sparrow = MediaPlayer.create(Bird_secondPage.this, R.raw.sparrow);
        swan = MediaPlayer.create(Bird_secondPage.this, R.raw.swan);


        img = findViewById(R.id.img_birdo);
        txt = findViewById(R.id.txt_birdo);

        //Declaration of  Button
        Button Parrot = findViewById(R.id.btn_parrot);
        Button Peacock = findViewById(R.id.btn_peacock);
        Button Penguin = findViewById(R.id.btn_penguinb);
        Button Pigeon = findViewById(R.id.btn_pigeon);
        Button Sparrow = findViewById(R.id.btn_sparrow);
        Button Swan = findViewById(R.id.btn_swan);
        Button Back_bird = findViewById(R.id.btn_back_bird);

        Parrot.setOnClickListener(this);
        Peacock.setOnClickListener(this);
        Penguin.setOnClickListener(this);
        Pigeon.setOnClickListener(this);
        Sparrow.setOnClickListener(this);
        Swan.setOnClickListener(this);
        Back_bird.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.btn_parrot:
                parrot.start();
                txt.setText("PARROT");
                img.setImageResource(R.mipmap.parrot);
                break;
            case R.id.btn_peacock:
                peacock.start();
                txt.setText("PEACOCK");
                img.setImageResource(R.mipmap.peacock);
                break;
            case R.id.btn_penguinb:
                penguin.start();
                txt.setText("PENGUIN");
                img.setImageResource(R.mipmap.penguin);
                break;
            case R.id.btn_pigeon:
                pigeon.start();
                txt.setText("PIGEON ");
                img.setImageResource(R.mipmap.pigeon);
                break;
            case R.id.btn_sparrow:
                sparrow.start();
                txt.setText("SPARROW");
                img.setImageResource(R.mipmap.sparrow);
                break;
            case R.id.btn_swan:
                swan.start();
                txt.setText("SWAN");
                img.setImageResource(R.mipmap.swan);
                break;

            case R.id.btn_back_bird:
                i = new Intent(this, Bird.class);
                startActivity(i);
                break;

        }
    }
}