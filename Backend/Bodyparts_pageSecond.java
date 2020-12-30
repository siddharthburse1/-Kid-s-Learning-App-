package com.example.kidslearningapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Bodyparts_pageSecond extends AppCompatActivity implements View.OnClickListener {
    Button hair, chin, shoulder, teeth, toefinger, forhead, cheek, chest, stomach, ankel, btn_back;
    MediaPlayer Hair, Chin, Shoulder, Teeth, Toefinger, Forhead, Cheek, Chest, Stomach, Ankel, Btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyparts_pagetwo);
//Audio Declaration
        Hair = MediaPlayer.create(Bodyparts_pageSecond.this, R.raw.hair);
        Chin = MediaPlayer.create(Bodyparts_pageSecond.this, R.raw.chin);
        Shoulder = MediaPlayer.create(Bodyparts_pageSecond.this, R.raw.shoulder);
        Teeth = MediaPlayer.create(Bodyparts_pageSecond.this, R.raw.teeth);
        Toefinger = MediaPlayer.create(Bodyparts_pageSecond.this, R.raw.toefinger);
        Forhead = MediaPlayer.create(Bodyparts_pageSecond.this, R.raw.forehead);
        Cheek = MediaPlayer.create(Bodyparts_pageSecond.this, R.raw.cheek);
        Chest = MediaPlayer.create(Bodyparts_pageSecond.this, R.raw.chest);
        Stomach = MediaPlayer.create(Bodyparts_pageSecond.this, R.raw.stomach);
        Ankel = MediaPlayer.create(Bodyparts_pageSecond.this, R.raw.ankel);
        Btn_back = MediaPlayer.create(Bodyparts_pageSecond.this, R.raw.part_of_body);


        hair = findViewById(R.id.btn_hair);
        chin = findViewById(R.id.btn_chin);
        shoulder = findViewById(R.id.btn_shoulder);
        teeth = findViewById(R.id.btn_teeth);
        toefinger = findViewById(R.id.btn_toefinger);
        forhead = findViewById(R.id.btn_forhead);
        cheek = findViewById(R.id.btn_cheek);
        chest = findViewById(R.id.btn_chest);
        stomach = findViewById(R.id.btn_stomach);
        ankel = findViewById(R.id.btn_ankel);
        btn_back = findViewById(R.id.btn_back);


        hair.setOnClickListener(this);
        chin.setOnClickListener(this);
        shoulder.setOnClickListener(this);
        teeth.setOnClickListener(this);
        toefinger.setOnClickListener(this);
        forhead.setOnClickListener(this);
        cheek.setOnClickListener(this);
        chest.setOnClickListener(this);
        stomach.setOnClickListener(this);
        ankel.setOnClickListener(this);
        btn_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.btn_hair:
                Hair.start();
                break;
            case R.id.btn_chin:
                Chin.start();
                break;
            case R.id.btn_shoulder:
                Shoulder.start();
                break;
            case R.id.btn_teeth:
                Teeth.start();
                break;
            case R.id.btn_toefinger:
                Toefinger.start();
                break;
            case R.id.btn_forhead:
                Forhead.start();
                break;
            case R.id.btn_cheek:
                Cheek.start();
                break;
            case R.id.btn_chest:
                Chest.start();
                break;
            case R.id.btn_stomach:
                Stomach.start();
                break;
            case R.id.btn_ankel:
                Ankel.start();
                break;
            case R.id.btn_back:
                i = new Intent(this, Bodyparts.class);
                startActivity(i);
                break;

        }

    }
}