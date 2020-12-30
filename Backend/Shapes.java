package com.example.kidslearningapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Shapes extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    TextView txt;
    MediaPlayer circle,cube,diamond,hexagon,octagon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);
//Audio  Declaration
        circle = MediaPlayer.create(Shapes.this, R.raw.circle);
        cube = MediaPlayer.create(Shapes.this, R.raw.cube);
        diamond = MediaPlayer.create(Shapes.this, R.raw.diamond);
        hexagon = MediaPlayer.create(Shapes.this, R.raw.hexagon);
        octagon = MediaPlayer.create(Shapes.this, R.raw.octagon);

        img = findViewById(R.id.img_shapes);
        txt = findViewById(R.id.txt_shapes);

        //Declaration of  Button
        Button Circle = findViewById(R.id.btn_circle);
        Button Cube = findViewById(R.id.btn_cube);
        Button Diamond = findViewById(R.id.btn_diamond);
        Button Hexagon = findViewById(R.id.btn_hexagon);
        Button Octagon = findViewById(R.id.btn_octagon);
        Button Next_shapes = findViewById(R.id.btn_next_shapes);

        Circle.setOnClickListener(this);
        Cube.setOnClickListener(this);
        Diamond.setOnClickListener(this);
        Hexagon.setOnClickListener(this);
        Octagon.setOnClickListener(this);
        Next_shapes.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.btn_circle:
                circle.start();
                txt.setText("CIRCLE");
                img.setImageResource(R.mipmap.circle);
                break;
            case R.id.btn_cube:
                cube.start();
                txt.setText("CUBE");
                img.setImageResource(R.mipmap.cube);
                break;
            case R.id.btn_diamond:
                diamond.start();
                txt.setText("DIAMOND");
                img.setImageResource(R.mipmap.diamond);
                break;

            case R.id.btn_hexagon:
                hexagon.start();
                txt.setText("HEXAGON");
                img.setImageResource(R.mipmap.hexagon);
                break;
            case R.id.btn_octagon:
                octagon.start();
                txt.setText("OCTAGON");
                img.setImageResource(R.mipmap.octagon);
                break;

            case R.id.btn_next_shapes:
                i = new Intent(this, Shapes_secondPage.class);
                startActivity(i);
                break;

        }
    }
}