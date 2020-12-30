package com.example.kidslearningapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Fruit extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    TextView txt;
    MediaPlayer apple,banana,coconut,dragon_food,grapes,lemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
//Audio   Declaration
        apple = MediaPlayer.create(Fruit.this, R.raw.apple);
        banana = MediaPlayer.create(Fruit.this, R.raw.banana);
        coconut = MediaPlayer.create(Fruit.this, R.raw.coconut);
        dragon_food = MediaPlayer.create(Fruit.this, R.raw.dragonfood);
        grapes = MediaPlayer.create(Fruit.this, R.raw.grapes);
        lemon = MediaPlayer.create(Fruit.this, R.raw.lemon);


        img = findViewById(R.id.img_fruit);
        txt = findViewById(R.id.txt_fruit);

        //Declaration of  Button
        Button Apple = findViewById(R.id.btn_apple);
        Button Banana = findViewById(R.id.btn_banana);
        Button Coconut = findViewById(R.id.btn_coconut);
        Button Dragon_food = findViewById(R.id.btn_dragon_food);
        Button Grapes = findViewById(R.id.btn_grapes);
        Button Lemon = findViewById(R.id.btn_lemon);
        Button Next_fruit = findViewById(R.id.btn_next_fruit);

        Apple.setOnClickListener(this);
        Banana.setOnClickListener(this);
        Coconut.setOnClickListener(this);
        Dragon_food.setOnClickListener(this);
        Grapes.setOnClickListener(this);
        Lemon.setOnClickListener(this);
        Next_fruit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.btn_apple:
                apple.start();
                txt.setText("APPLE");
                img.setImageResource(R.mipmap.apple);
                break;
            case R.id.btn_banana:
                banana.start();
                txt.setText("BANANA");
                img.setImageResource(R.mipmap.banana);
                break;
            case R.id.btn_coconut:
                coconut.start();
                txt.setText("COCONUT");
                img.setImageResource(R.mipmap.coconut);
                break;
            case R.id.btn_dragon_food:
                dragon_food.start();
                txt.setText("DRAGON FOOD");
                img.setImageResource(R.mipmap.dragon_food);
                break;
            case R.id.btn_grapes:
                grapes.start();
                txt.setText("GRAPES");
                img.setImageResource(R.mipmap.grapes);
                break;
            case R.id.btn_lemon:
                lemon.start();
                txt.setText("LEMON");
                img.setImageResource(R.mipmap.lemon);
                break;

            case R.id.btn_next_fruit:
                i = new Intent(this, Fruit_secondPage.class);
                startActivity(i);
                break;

        }
    }
}