package com.example.kidslearningapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Flower_secondPage extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    TextView txt;
    MediaPlayer marigold, rose, sunflower, tulip, water_lily, zinna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_second_page);
//Audio   Declaration
        marigold = MediaPlayer.create(Flower_secondPage.this, R.raw.marigold);
        rose = MediaPlayer.create(Flower_secondPage.this, R.raw.rose);
        sunflower = MediaPlayer.create(Flower_secondPage.this, R.raw.sunflower);
        tulip = MediaPlayer.create(Flower_secondPage.this, R.raw.tulip);
        water_lily = MediaPlayer.create(Flower_secondPage.this, R.raw.waterlily);
        zinna = MediaPlayer.create(Flower_secondPage.this, R.raw.zinna);

        img = findViewById(R.id.img_flowero);
        txt = findViewById(R.id.txt_flowero);

        //Declaration of  Button
        Button Marigold = findViewById(R.id.btn_marigold);
        Button Rose = findViewById(R.id.btn_rose);
        Button Sunflower = findViewById(R.id.btn_sunflower);
        Button Tulip = findViewById(R.id.btn_tulip);
        Button Water_lily = findViewById(R.id.btn_water_lily);
        Button Zinna = findViewById(R.id.btn_zinna);
        Button Back_flower = findViewById(R.id.btn_back_flower);

        Marigold.setOnClickListener(this);
        Rose.setOnClickListener(this);
        Sunflower.setOnClickListener(this);
        Tulip.setOnClickListener(this);
        Water_lily.setOnClickListener(this);
        Zinna.setOnClickListener(this);
        Back_flower.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.btn_marigold:
                marigold.start();
                txt.setText("MARIGOLD");
                img.setImageResource(R.mipmap.marigold);
                break;
            case R.id.btn_rose:
                rose.start();
                txt.setText("ROSE");
                img.setImageResource(R.mipmap.rose);
                break;
            case R.id.btn_sunflower:
                sunflower.start();
                txt.setText("SUNFLOWER");
                img.setImageResource(R.mipmap.sunflower);
                break;
            case R.id.btn_tulip:
                tulip.start();
                txt.setText("TULIP");
                img.setImageResource(R.mipmap.tulip);
                break;
            case R.id.btn_water_lily:
                water_lily.start();
                txt.setText("WATER LILY");
                img.setImageResource(R.mipmap.water_lily);
                break;
            case R.id.btn_zinna:
                zinna.start();
                txt.setText("ZINNA");
                img.setImageResource(R.mipmap.zinna);
                break;
            case R.id.btn_back_flower:
                i = new Intent(this, Flower.class);
                startActivity(i);
                break;

        }

    }
}