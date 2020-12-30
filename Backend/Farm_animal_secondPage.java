package com.example.kidslearningapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Farm_animal_secondPage extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    TextView txt;
    MediaPlayer goat_n, horse_n, monkey_n, pig_n, rabbit_n, sheep_n;
    MediaPlayer goat_v, horse_v, monkey_v, pig_v, rabbit_v, sheep_v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farm_animal_second_page);

        //Audio of Farm2 animal name Declaration
        goat_n = MediaPlayer.create(Farm_animal_secondPage.this, R.raw.goatn);
        horse_n = MediaPlayer.create(Farm_animal_secondPage.this, R.raw.horsen);
        monkey_n = MediaPlayer.create(Farm_animal_secondPage.this, R.raw.monkeyn);
        pig_n = MediaPlayer.create(Farm_animal_secondPage.this, R.raw.pign);
        rabbit_n = MediaPlayer.create(Farm_animal_secondPage.this, R.raw.rabbitn);
        sheep_n = MediaPlayer.create(Farm_animal_secondPage.this, R.raw.sheepn);

        // sound/voice of Farm2 animal name Declaration
        goat_v = MediaPlayer.create(Farm_animal_secondPage.this, R.raw.goatv);
        horse_v = MediaPlayer.create(Farm_animal_secondPage.this, R.raw.horsev);
        monkey_v = MediaPlayer.create(Farm_animal_secondPage.this, R.raw.monkeyv);
        pig_v = MediaPlayer.create(Farm_animal_secondPage.this, R.raw.pigv);
        rabbit_v = MediaPlayer.create(Farm_animal_secondPage.this, R.raw.rabbitv);
        sheep_v = MediaPlayer.create(Farm_animal_secondPage.this, R.raw.sheepv);

        img = findViewById(R.id.img_farm_animalo);
        txt = findViewById(R.id.txt_farm_animalo);

        //Declaration of  Button
        Button Goat = findViewById(R.id.btn_goat);
        Button Horse = findViewById(R.id.btn_horse);
        Button Monkey = findViewById(R.id.btn_monkey);
        Button Pig = findViewById(R.id.btn_pig);
        Button Rabbit = findViewById(R.id.btn_rabbit);
        Button Sheep = findViewById(R.id.btn_sheep);
        Button Back_farmanimal = findViewById(R.id.btn_back_farmanimal);

        Goat.setOnClickListener(this);
        Horse.setOnClickListener(this);
        Monkey.setOnClickListener(this);
        Pig.setOnClickListener(this);
        Rabbit.setOnClickListener(this);
        Sheep.setOnClickListener(this);
        Back_farmanimal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.btn_goat:
                goat_n.start();
                goat_n.setNextMediaPlayer(goat_v);
                txt.setText("GOAT");
                img.setImageResource(R.mipmap.goat);
                break;
            case R.id.btn_horse:
                horse_n.start();
                horse_n.setNextMediaPlayer(horse_v);
                txt.setText("HORSE");
                img.setImageResource(R.mipmap.horse);
                break;
            case R.id.btn_monkey:
                monkey_n.start();
                monkey_n.setNextMediaPlayer(monkey_v);
                txt.setText("MONKEY");
                img.setImageResource(R.mipmap.monkeya);
                break;
            case R.id.btn_pig:
                pig_n.start();
                pig_n.setNextMediaPlayer(pig_v);
                txt.setText("PIG");
                img.setImageResource(R.mipmap.pig);
                break;
            case R.id.btn_rabbit:
                rabbit_n.start();
                rabbit_n.setNextMediaPlayer(rabbit_v);
                txt.setText("RABBIT");
                img.setImageResource(R.mipmap.rabbit);
                break;
            case R.id.btn_sheep:
                sheep_n.start();
                sheep_n.setNextMediaPlayer(sheep_v);
                txt.setText("SHEEP");
                img.setImageResource(R.mipmap.sheep);
                break;

            case R.id.btn_back_farmanimal:
                i = new Intent(this, Farm_animal.class);
                startActivity(i);
                break;
        }
    }
}