package com.example.kidslearningapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Color_page extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    TextView txtColor;
    MediaPlayer Red, Pink, White, Orange, Navy_blue, Purple, Green, Yellow, Black, Brown, Blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_page);
        img = findViewById(R.id.mainColor_img);
        txtColor=findViewById(R.id.txt_color);

        //Audio or Sound Declaration
        Red = MediaPlayer.create(Color_page.this, R.raw.red);
        Pink = MediaPlayer.create(Color_page.this, R.raw.pink);
        White = MediaPlayer.create(Color_page.this, R.raw.white);
        Orange = MediaPlayer.create(Color_page.this, R.raw.orange);
        Navy_blue = MediaPlayer.create(Color_page.this, R.raw.navyblue);
        Purple = MediaPlayer.create(Color_page.this, R.raw.purple);
        Green = MediaPlayer.create(Color_page.this, R.raw.green);
        Yellow = MediaPlayer.create(Color_page.this, R.raw.yellow);
        Black = MediaPlayer.create(Color_page.this, R.raw.black);
        Brown = MediaPlayer.create(Color_page.this, R.raw.brown);
        Blue = MediaPlayer.create(Color_page.this, R.raw.blue);

        Button red = findViewById(R.id.red);
        Button pink = findViewById(R.id.pink);
        Button white = findViewById(R.id.white);
        Button purple = findViewById(R.id.purple);
        Button orange = findViewById(R.id.orange);
        Button green = findViewById(R.id.green);
        Button black = findViewById(R.id.black);
        Button yellow = findViewById(R.id.yellow);
        Button blue = findViewById(R.id.blue);
        Button brown = findViewById(R.id.brown);
        Button navyblue= findViewById(R.id.navyblue);

        red.setOnClickListener(this);
        pink.setOnClickListener(this);
        white.setOnClickListener(this);
        purple.setOnClickListener(this);
        orange.setOnClickListener(this);
        green.setOnClickListener(this);
        black.setOnClickListener(this);
        yellow.setOnClickListener(this);
        blue.setOnClickListener(this);
        brown.setOnClickListener(this);
        navyblue.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.red:
                Red.start();
                img.setImageResource(R.mipmap.red);
                txtColor.setText("RED");
                break;
            case R.id.pink:
                Pink.start();
                img.setImageResource(R.mipmap.pink);
                txtColor.setText("PINK");
                break;
            case R.id.white:
                White.start();
                img.setImageResource(R.mipmap.white);
                txtColor.setText("WHITE");
                break;
            case R.id.purple:
                Purple.start();
                img.setImageResource(R.mipmap.purple);
                txtColor.setText("PURPLE");
                break;
            case R.id.orange:
                Orange.start();
                img.setImageResource(R.mipmap.orange);
                txtColor.setText("ORANGE");
                break;
            case R.id.green:
                Green.start();
                img.setImageResource(R.mipmap.green);
                txtColor.setText("GREEN");
                break;
            case R.id.black:
                Black.start();
                img.setImageResource(R.mipmap.black);
                txtColor.setText("BLACK");
                break;
            case R.id.yellow:
                Yellow.start();
                img.setImageResource(R.mipmap.yellow);
                txtColor.setText("YELLOW");
                break;
            case R.id.blue:
                Blue.start();
                img.setImageResource(R.mipmap.blue);
                txtColor.setText("BLUE");
                break;
            case R.id.brown:
                Brown.start();
                img.setImageResource(R.mipmap.brown);
                txtColor.setText("BROWN");
                break;
            case R.id.navyblue:
                Navy_blue.start();
                img.setImageResource(R.mipmap.navyblue);
                txtColor.setText("NAVY BLUE");
                break;

        }
    }
}