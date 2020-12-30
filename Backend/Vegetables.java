package com.example.kidslearningapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Vegetables extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    TextView txt;
    MediaPlayer cabbage,carrot,corn,cucumber,onion,potato,pumpkin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);
//Audio Declaration
        cabbage = MediaPlayer.create(Vegetables.this, R.raw.cabbage);
        carrot = MediaPlayer.create(Vegetables.this, R.raw.carrot);
        corn = MediaPlayer.create(Vegetables.this, R.raw.corn);
        cucumber = MediaPlayer.create(Vegetables.this, R.raw.cucumber);
        onion = MediaPlayer.create(Vegetables.this, R.raw.onion);
        potato = MediaPlayer.create(Vegetables.this, R.raw.potato);
        pumpkin = MediaPlayer.create(Vegetables.this, R.raw.pumpkin);

        img = findViewById(R.id.img_vegetables);
        txt = findViewById(R.id.txt_vegetables);

        //Declaration of  Button
        Button Cabbage = findViewById(R.id.btn_cabbage);
        Button Carrot = findViewById(R.id.btn_carrot);
        Button Corn = findViewById(R.id.btn_corn);
        Button Cucumber = findViewById(R.id.btn_cucumber);
        Button Onion = findViewById(R.id.btn_onion);
        Button Potato = findViewById(R.id.btn_potato);
        Button Pumpkin = findViewById(R.id.btn_pumpkin);

        Cabbage.setOnClickListener(this);
        Carrot.setOnClickListener(this);
        Corn.setOnClickListener(this);
        Cucumber.setOnClickListener(this);
        Onion.setOnClickListener(this);
        Potato.setOnClickListener(this);
        Pumpkin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_cabbage:
                cabbage.start();
                txt.setText("CABBAGE");
                img.setImageResource(R.mipmap.cabbage);
                break;
            case R.id.btn_carrot:
                carrot.start();
                txt.setText("CARROT");
                img.setImageResource(R.mipmap.carrot);
                break;
            case R.id.btn_corn:
                corn.start();
                txt.setText("CORN");
                img.setImageResource(R.mipmap.corn);
                break;
            case R.id.btn_cucumber:
                cucumber.start();
                txt.setText("CUCUMBER");
                img.setImageResource(R.mipmap.cucumber);
                break;
            case R.id.btn_onion:
                onion.start();
                txt.setText("ONION");
                img.setImageResource(R.mipmap.onion);
                break;
            case R.id.btn_potato:
                potato.start();
                txt.setText("POTATO");
                img.setImageResource(R.mipmap.potato);
                break;
            case R.id.btn_pumpkin:
                pumpkin.start();
                txt.setText("PUMPKIN");
                img.setImageResource(R.mipmap.pumpkin);
                break;
        }
    }
}