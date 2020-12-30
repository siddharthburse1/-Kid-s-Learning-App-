package com.example.kidslearningapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Farm_animal extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    TextView txt;
    MediaPlayer cat_n, chicken_n, cow_n, dog_n, donkey_n, duck_n,cat_v, chicken_v, cow_v, dog_v, donkey_v, duck_v;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farm_animal);
        //Audio of Farm animal name Declaration
        cat_n = MediaPlayer.create(Farm_animal.this, R.raw.catn);
        chicken_n = MediaPlayer.create(Farm_animal.this, R.raw.chickenn);
        cow_n = MediaPlayer.create(Farm_animal.this, R.raw.cown);
        dog_n = MediaPlayer.create(Farm_animal.this, R.raw.dogn);
        donkey_n = MediaPlayer.create(Farm_animal.this, R.raw.donkeyn);
        duck_n = MediaPlayer.create(Farm_animal.this, R.raw.duckn);

        // sound/voice of Farm animal name Declaration
        cat_v = MediaPlayer.create(Farm_animal.this, R.raw.catv);
        chicken_v = MediaPlayer.create(Farm_animal.this, R.raw.chickenv);
        cow_v= MediaPlayer.create(Farm_animal.this, R.raw.cowv);
        dog_v = MediaPlayer.create(Farm_animal.this, R.raw.dogv);
        donkey_v = MediaPlayer.create(Farm_animal.this, R.raw.donkeyv);
        duck_v = MediaPlayer.create(Farm_animal.this, R.raw.duckv);

        img = findViewById(R.id.img_farm_animal);
        txt = findViewById(R.id.txt_farm_animal);


        //Declaration of  Button
        Button Cat = findViewById(R.id.btn_cat);
        Button Chicken = findViewById(R.id.btn_chicken);
        Button Cow = findViewById(R.id.btn_cow);
        Button Dog = findViewById(R.id.btn_dog);
        Button Donkey = findViewById(R.id.btn_donkey);
        Button Duck = findViewById(R.id.btn_duck);
        Button Next_farmanimal = findViewById(R.id.btn_next_farmanimal);

        Cat.setOnClickListener(this);
        Chicken.setOnClickListener(this);
        Cow.setOnClickListener(this);
        Dog.setOnClickListener(this);
        Donkey.setOnClickListener(this);
        Duck.setOnClickListener(this);
        Next_farmanimal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.btn_cat:
                cat_n.start();
                cat_n.setNextMediaPlayer(cat_v);
                txt.setText("CAT");
                img.setImageResource(R.mipmap.cat);
                break;
            case R.id.btn_chicken:
                chicken_n.start();
                chicken_n.setNextMediaPlayer(chicken_v);
                chicken_n.start();
                txt.setText("CHICKEN");
                img.setImageResource(R.mipmap.chicken);
                break;
            case R.id.btn_cow:
                cow_n.start();
                cow_n.setNextMediaPlayer(cow_v);
                txt.setText("COW");
                img.setImageResource(R.mipmap.cow);
                break;
            case R.id.btn_dog:
                dog_n.start();
                dog_n.setNextMediaPlayer(dog_v);
                txt.setText("DOG");
                img.setImageResource(R.mipmap.dog);
                break;
            case R.id.btn_donkey:
                donkey_n.start();
                donkey_n.setNextMediaPlayer(donkey_v);
                txt.setText("DONKEY");
                img.setImageResource(R.mipmap.donkey);
                break;
            case R.id.btn_duck:
                duck_n.start();
                duck_n.setNextMediaPlayer(duck_v);
                txt.setText("DUCK");
                img.setImageResource(R.mipmap.duck);
                break;

            case R.id.btn_next_farmanimal:
                i = new Intent(this, Farm_animal_secondPage.class);
                startActivity(i);
                break;
        }
    }


}