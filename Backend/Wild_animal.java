package com.example.kidslearningapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Wild_animal extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    TextView txt;
    MediaPlayer bear_n, bison_n, cheetah_n, deer_n, elephant_n, fox_n, wolf_n;
    MediaPlayer bear_v, bison_v, cheetah_v, deer_v, elephant_v, fox_v, wolf_v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wild_animal);

        //Audio of Wild animal name Declaration
        bear_n = MediaPlayer.create(Wild_animal.this, R.raw.bearn);
        bison_n = MediaPlayer.create(Wild_animal.this, R.raw.bisonn);
        cheetah_n = MediaPlayer.create(Wild_animal.this, R.raw.cheetahn);
        deer_n = MediaPlayer.create(Wild_animal.this, R.raw.deern);
        elephant_n = MediaPlayer.create(Wild_animal.this, R.raw.elephantn);
        fox_n = MediaPlayer.create(Wild_animal.this, R.raw.foxn);
        wolf_n = MediaPlayer.create(Wild_animal.this, R.raw.wolfn);


        // sound/voice of Wild animal name Declaration
        bear_v = MediaPlayer.create(Wild_animal.this, R.raw.bearv);
        bison_v = MediaPlayer.create(Wild_animal.this, R.raw.bisonv);
        cheetah_v = MediaPlayer.create(Wild_animal.this, R.raw.cheetahv);
        deer_v = MediaPlayer.create(Wild_animal.this, R.raw.deerv);
        elephant_v = MediaPlayer.create(Wild_animal.this, R.raw.elephantv);
        fox_v = MediaPlayer.create(Wild_animal.this, R.raw.foxv);
        wolf_v = MediaPlayer.create(Wild_animal.this, R.raw.wolfv);

        img = findViewById(R.id.img_wild_animalo);
        txt = findViewById(R.id.txt_wild_animalo);

        //Declaration of  Button
        Button Bear = findViewById(R.id.btn_bear);
        Button Bison = findViewById(R.id.btn_bison);
        Button Cheetah = findViewById(R.id.btn_cheetah);
        Button Deer = findViewById(R.id.btn_deer);
        Button Elephant = findViewById(R.id.btn_elephant);
        Button Fox = findViewById(R.id.btn_fox);
        Button Wolf = findViewById(R.id.btn_wolf);
        Button Next_wildanimal = findViewById(R.id.btn_next_wildanimal);

        Bear.setOnClickListener(this);
        Bison.setOnClickListener(this);
        Cheetah.setOnClickListener(this);
        Deer.setOnClickListener(this);
        Elephant.setOnClickListener(this);
        Fox.setOnClickListener(this);
        Wolf.setOnClickListener(this);
        Next_wildanimal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.btn_bear:
                bear_n.start();
                bear_n.setNextMediaPlayer(bear_v);
                txt.setText("BEAR");
                img.setImageResource(R.mipmap.bear);
                break;
            case R.id.btn_bison:
                bison_n.start();
                bison_n.setNextMediaPlayer(bison_v);
                txt.setText("BISON");
                img.setImageResource(R.mipmap.bison);
                break;
            case R.id.btn_cheetah:
                cheetah_n.start();
                cheetah_n.setNextMediaPlayer(cheetah_v);
                txt.setText("CHEETAH");
                img.setImageResource(R.mipmap.cheetah);
                break;
            case R.id.btn_deer:
                deer_n.start();
                deer_n.setNextMediaPlayer(deer_v);
                txt.setText("DEER");
                img.setImageResource(R.mipmap.deer);
                break;
            case R.id.btn_elephant:
                elephant_n.start();
                elephant_n.setNextMediaPlayer(elephant_v);
                txt.setText("ELEPHANT");
                img.setImageResource(R.mipmap.elephant);
                break;
            case R.id.btn_fox:
                fox_n.start();
                fox_n.setNextMediaPlayer(fox_v);
                txt.setText("FOX");
                img.setImageResource(R.mipmap.fox);
                break;
            case R.id.btn_wolf:
                wolf_n.start();
                wolf_n.setNextMediaPlayer(wolf_v);
                txt.setText("WOLF");
                img.setImageResource(R.mipmap.wolf);
                break;
            case R.id.btn_next_wildanimal:
                i = new Intent(this, Wild_animal_secondPage.class);
                startActivity(i);
                break;
        }

    }
}