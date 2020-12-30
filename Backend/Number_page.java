package com.example.kidslearningapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Number_page extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    TextView txtNumber;
    MediaPlayer Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_page);

        img = findViewById(R.id.Mainimg_number);
        txtNumber=findViewById(R.id.txt_number);

        //Audio or Sound Declaration
        Zero = MediaPlayer.create(Number_page.this, R.raw.zeroa);
        One = MediaPlayer.create(Number_page.this, R.raw.onea);
        Two = MediaPlayer.create(Number_page.this, R.raw.twoa);
        Three = MediaPlayer.create(Number_page.this, R.raw.threea);
        Four = MediaPlayer.create(Number_page.this, R.raw.fouea);
        Five = MediaPlayer.create(Number_page.this, R.raw.fivea);
        Six = MediaPlayer.create(Number_page.this, R.raw.sixa);
        Seven = MediaPlayer.create(Number_page.this, R.raw.sevena);
        Eight = MediaPlayer.create(Number_page.this, R.raw.eighta);
        Nine = MediaPlayer.create(Number_page.this, R.raw.ninea);
        Ten = MediaPlayer.create(Number_page.this, R.raw.tena);



        Button zero = findViewById(R.id.zero);
        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);
        Button four = findViewById(R.id.four);
        Button five = findViewById(R.id.five);
        Button six = findViewById(R.id.six);
        Button seven = findViewById(R.id.seven);
        Button eight = findViewById(R.id.eight);
        Button nine = findViewById(R.id.nine);
        Button ten = findViewById(R.id.ten);

        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        ten.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.zero:
                Zero.start();
                img.setImageResource(R.mipmap.zero);

                txtNumber.setText("Zero");
                break;
            case R.id.one:
                One.start();
                img.setImageResource(R.mipmap.one);
                txtNumber.setText("One");
              break;
            case R.id.two:
                Two.start();
                img.setImageResource(R.mipmap.two);
                txtNumber.setText("Two");
                break;
            case R.id.three:
                Three.start();
                img.setImageResource(R.mipmap.three);
                txtNumber.setText("Three");
                break;
            case R.id.four:
                Four.start();
                img.setImageResource(R.mipmap.four);
                txtNumber.setText("Four");
                break;
            case R.id.five:
                Five.start();
                img.setImageResource(R.mipmap.five);
                txtNumber.setText("Five");
                break;
            case R.id.six:
                Six.start();
                img.setImageResource(R.mipmap.six);
                txtNumber.setText("Six");
                break;
            case R.id.seven:
                Seven.start();
                img.setImageResource(R.mipmap.seven);
                txtNumber.setText("Seven");
                break;
            case R.id.eight:
                Eight.start();
                img.setImageResource(R.mipmap.eight);
                txtNumber.setText("Eight");
                break;
            case R.id.nine:
                Nine.start();
                img.setImageResource(R.mipmap.nine);
                txtNumber.setText("Nine");
                break;
            case R.id.ten:
                Ten.start();
                img.setImageResource(R.mipmap.ten);
                txtNumber.setText("Ten");
                break;
        }

    }
}