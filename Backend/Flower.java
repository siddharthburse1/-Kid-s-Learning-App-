package com.example.kidslearningapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Flower extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    TextView txt;
    MediaPlayer aster, frangipani, hibiscus, jasmine, lavender, lotus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);

//Audio   Declaration
        aster = MediaPlayer.create(Flower.this, R.raw.aster);
        frangipani = MediaPlayer.create(Flower.this, R.raw.frangipani);
        hibiscus = MediaPlayer.create(Flower.this, R.raw.hibiscus);
        jasmine = MediaPlayer.create(Flower.this, R.raw.jasmine);
        lavender = MediaPlayer.create(Flower.this, R.raw.lavender);
        lotus = MediaPlayer.create(Flower.this, R.raw.lotus);


        img = findViewById(R.id.img_flower);
        txt = findViewById(R.id.txt_flower);

        //Declaration of  Button
        Button Aster = findViewById(R.id.btn_aster);
        Button Frangipani = findViewById(R.id.btn_frangipani);
        Button Hibiscus = findViewById(R.id.btn_hibiscus);
        Button Jasmine = findViewById(R.id.btn_jasmine);
        Button Lavender = findViewById(R.id.btn_lavender);
        Button Lotus = findViewById(R.id.btn_lotus);
        Button Next_flower = findViewById(R.id.btn_next_flower);

        Aster.setOnClickListener(this);
        Frangipani.setOnClickListener(this);
        Hibiscus.setOnClickListener(this);
        Jasmine.setOnClickListener(this);
        Lavender.setOnClickListener(this);
        Lotus.setOnClickListener(this);
        Next_flower.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.btn_aster:
                aster.start();
                txt.setText("ASTER");
                img.setImageResource(R.mipmap.aster);
                break;
            case R.id.btn_frangipani:
                frangipani.start();
                txt.setText("FRANGIPANI");
                img.setImageResource(R.mipmap.frangipani);
                break;
            case R.id.btn_hibiscus:
                hibiscus.start();
                txt.setText("HIBISCUS");
                img.setImageResource(R.mipmap.hibiscus);
                break;
            case R.id.btn_jasmine:
                jasmine.start();
                txt.setText("JASMINE");
                img.setImageResource(R.mipmap.jasmine);
                break;
            case R.id.btn_lavender:
                lavender.start();
                txt.setText("LAVENDER");
                img.setImageResource(R.mipmap.lavender);
                break;
            case R.id.btn_lotus:
                lotus.start();
                txt.setText("LOTUS");
                img.setImageResource(R.mipmap.lotus);
                break;

            case R.id.btn_next_flower:
                i = new Intent(this, Flower_secondPage.class);
                startActivity(i);
                break;

        }
    }
}