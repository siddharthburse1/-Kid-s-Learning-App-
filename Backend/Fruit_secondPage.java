package com.example.kidslearningapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Fruit_secondPage extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    TextView txt;
    MediaPlayer mango,orange,papaya,pineapple,strawberry,water_melon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_second_page);
//Audio   Declaration
        mango = MediaPlayer.create(Fruit_secondPage.this, R.raw.mango);
        orange = MediaPlayer.create(Fruit_secondPage.this, R.raw.orange);
        papaya = MediaPlayer.create(Fruit_secondPage.this, R.raw.papaya);
        pineapple = MediaPlayer.create(Fruit_secondPage.this, R.raw.pineapple);
        strawberry = MediaPlayer.create(Fruit_secondPage.this, R.raw.strawberry);
        water_melon = MediaPlayer.create(Fruit_secondPage.this, R.raw.watermelon);

        img = findViewById(R.id.img_fruito);
        txt = findViewById(R.id.txt_fruito);

        //Declaration of  Button
        Button Mango = findViewById(R.id.btn_mango);
        Button Orange = findViewById(R.id.btn_orange);
        Button Papaya = findViewById(R.id.btn_papaya);
        Button Pineapple = findViewById(R.id.btn_pineapple);
        Button Strawberry = findViewById(R.id.btn_strawberry);
        Button Water_melon = findViewById(R.id.btn_water_melon);
        Button Back_fruit = findViewById(R.id.btn_back_fruit);

        Mango.setOnClickListener(this);
        Orange.setOnClickListener(this);
        Papaya.setOnClickListener(this);
        Pineapple.setOnClickListener(this);
        Strawberry.setOnClickListener(this);
        Water_melon.setOnClickListener(this);
        Back_fruit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.btn_mango:
                mango.start();
                txt.setText("MANGO");
                img.setImageResource(R.mipmap.mango);
                break;
            case R.id.btn_orange:
                orange.start();
                txt.setText("ORANGE");
                img.setImageResource(R.mipmap.orangef);
                break;
            case R.id.btn_papaya:
                papaya.start();
                txt.setText("PAPAYA");
                img.setImageResource(R.mipmap.papaya);
                break;
            case R.id.btn_pineapple:
                pineapple.start();
                txt.setText("PINEAPPLE ");
                img.setImageResource(R.mipmap.pineapple);
                break;
            case R.id.btn_strawberry:
                strawberry.start();
                txt.setText("STRAWBERRY");
                img.setImageResource(R.mipmap.strawberry);
                break;
            case R.id.btn_water_melon:
                water_melon.start();
                txt.setText("WATER MELON");
                img.setImageResource(R.mipmap.water_melon);
                break;

            case R.id.btn_back_fruit:
                i = new Intent(this, Fruit.class);
                startActivity(i);
                break;

        }
    }
}