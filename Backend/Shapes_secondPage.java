package com.example.kidslearningapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Shapes_secondPage extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    TextView txt;
    MediaPlayer oval,pentagon,rectangle,square,star,triangle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes_second_page);
//Audio   Declaration
        oval = MediaPlayer.create(Shapes_secondPage.this, R.raw.oval);
        pentagon = MediaPlayer.create(Shapes_secondPage.this, R.raw.pentagon);
        rectangle = MediaPlayer.create(Shapes_secondPage.this, R.raw.rectangle);
        square = MediaPlayer.create(Shapes_secondPage.this, R.raw.square);
        star = MediaPlayer.create(Shapes_secondPage.this, R.raw.star);
        triangle = MediaPlayer.create(Shapes_secondPage.this, R.raw.triangle);

        img = findViewById(R.id.img_shapeso);
        txt = findViewById(R.id.txt_shapeso);

        //Declaration of  Button
        Button Oval = findViewById(R.id.btn_oval);
        Button Pentagon = findViewById(R.id.btn_pentagon);
        Button Rectangle = findViewById(R.id.btn_rectangle);
        Button Square = findViewById(R.id.btn_square);
        Button Star = findViewById(R.id.btn_star);
        Button Triangle = findViewById(R.id.btn_triangle);
        Button Back_shapes = findViewById(R.id.btn_back_shapes);

        Oval.setOnClickListener(this);
        Pentagon.setOnClickListener(this);
        Rectangle.setOnClickListener(this);
        Square.setOnClickListener(this);
        Star.setOnClickListener(this);
        Triangle.setOnClickListener(this);
        Back_shapes.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.btn_oval:
                oval.start();
                txt.setText("OVAL");
                img.setImageResource(R.mipmap.oval);
                break;
            case R.id.btn_pentagon:
                pentagon.start();
                txt.setText("PENTAGON");
                img.setImageResource(R.mipmap.pentagon);
                break;
            case R.id.btn_rectangle:
                rectangle.start();
                txt.setText("RECTANGLE");
                img.setImageResource(R.mipmap.rectangle);
                break;
            case R.id.btn_square:
                square.start();
                txt.setText("SQUARE ");
                img.setImageResource(R.mipmap.square);
                break;
            case R.id.btn_star:
                star.start();
                txt.setText("STAR");
                img.setImageResource(R.mipmap.star);
                break;
            case R.id.btn_triangle:
                triangle.start();
                txt.setText("TRIANGLE");
                img.setImageResource(R.mipmap.triangle);
                break;

            case R.id.btn_back_shapes:
                i = new Intent(this, Shapes.class);
                startActivity(i);
                break;

        }
    }
}