package com.example.kidslearningapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Bird extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    TextView txt;
    MediaPlayer crow, duck, eagle, hen, kingfisher, owl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird);
//Audio Declaration
        crow = MediaPlayer.create(Bird.this, R.raw.crow);
        duck = MediaPlayer.create(Bird.this, R.raw.duck);
        eagle = MediaPlayer.create(Bird.this, R.raw.eagle);
        hen = MediaPlayer.create(Bird.this, R.raw.hen);
        kingfisher = MediaPlayer.create(Bird.this, R.raw.kingfisher);
        owl = MediaPlayer.create(Bird.this, R.raw.owl);


        img = findViewById(R.id.img_bird);
        txt = findViewById(R.id.txt_bird);

        //Declaration of  Button
        Button Crow = findViewById(R.id.btn_crow);
        Button Duck = findViewById(R.id.btn_duckb);
        Button Eagle = findViewById(R.id.btn_eagle);
        Button Hen = findViewById(R.id.btn_hen);
        Button Kingfisher = findViewById(R.id.btn_kingfisher);
        Button Owl = findViewById(R.id.btn_owl);
        Button Next_bird = findViewById(R.id.btn_next_bird);

        Crow.setOnClickListener(this);
        Duck.setOnClickListener(this);
        Eagle.setOnClickListener(this);
        Hen.setOnClickListener(this);
        Kingfisher.setOnClickListener(this);
        Owl.setOnClickListener(this);
        Next_bird.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.btn_crow:
                crow.start();
                txt.setText("CROW");
                img.setImageResource(R.mipmap.crow);
                break;
            case R.id.btn_duckb:
                duck.start();
                txt.setText("DUCK");
                img.setImageResource(R.mipmap.duck);
                break;
            case R.id.btn_eagle:
                eagle.start();
                txt.setText("EAGLE");
                img.setImageResource(R.mipmap.eagle);
                break;
            case R.id.btn_hen:
                hen.start();
                txt.setText("HEN ");
                img.setImageResource(R.mipmap.hen);
                break;
            case R.id.btn_kingfisher:
                kingfisher.start();
                txt.setText("KINGFISHER");
                img.setImageResource(R.mipmap.kingfisher);
                break;
            case R.id.btn_owl:
                owl.start();
                txt.setText("OWL");
                img.setImageResource(R.mipmap.owl);
                break;

            case R.id.btn_next_bird:
                i = new Intent(this, Bird_secondPage.class);
                startActivity(i);
                break;

        }
    }
}