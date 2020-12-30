package com.example.kidslearningapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MediaPlayer happysong;

    private CardView Alphabet_Card, Number_Card, Color_Card, Bodyparts_Card,Animal_section_Card, Flower_Card, Fruit_Card, Bird_Card,Vegetables_Card,Shapes_Card;//Video_sasa_Card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       happysong = MediaPlayer.create(MainActivity.this, R.raw.happysong);


        Alphabet_Card = (CardView) findViewById(R.id.Alphabet_Card); //type to define when variable not declared. . .
        Number_Card = findViewById(R.id.Number_Card);
        Color_Card = findViewById(R.id.Color_Card);
        Bodyparts_Card = findViewById(R.id.Bodyparts_Card);
        Animal_section_Card = findViewById(R.id.Animal_section_Card);

        Flower_Card = findViewById(R.id.Flower_Card);
        Fruit_Card = findViewById(R.id.Fruit_Card);
        Bird_Card = findViewById(R.id.Bird_Card);
        Vegetables_Card = findViewById(R.id.Vegetables_Card);
        Shapes_Card = findViewById(R.id.Shapes_Card);
        //  Video_sasa_Card = (CardView) findViewById(R.id.videosasa_Card);


        Alphabet_Card.setOnClickListener(this);
        Number_Card.setOnClickListener(this);
        Color_Card.setOnClickListener(this);
        Bodyparts_Card.setOnClickListener(this);
        Animal_section_Card.setOnClickListener(this);

        Flower_Card.setOnClickListener(this);
        Fruit_Card.setOnClickListener(this);
        Bird_Card.setOnClickListener(this);
        Vegetables_Card.setOnClickListener(this);
        Shapes_Card.setOnClickListener(this);
        //  Video_sasa_Card.setOnClickListener(this);

    }
    //EXIT Message POP-UP when back Button get pressed . . .
    public void onBackPressed(){
        AlertDialog.Builder alertDialogBuilder= new AlertDialog.Builder(this);

        alertDialogBuilder.setTitle("Confirm Exit..!!");
        alertDialogBuilder.setIcon(R.drawable.ic_exit);
        alertDialogBuilder.setMessage("Are you sure You want to exit ?");
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                happysong.stop();
                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You clicked on cancel",Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();

    }

    //onClickListeners of Cards
    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {

            case R.id.Alphabet_Card:
                i = new Intent(this, Alphabet_page.class);
                startActivity(i);
                happysong.start();
                break;

            case R.id.Number_Card:
                i = new Intent(this, Number_page.class);
                startActivity(i);
               // happysong.start();
                break;

            case R.id.Color_Card:
                i = new Intent(this, Color_page.class);
                startActivity(i);
                break;

            case R.id.Bodyparts_Card:
                i = new Intent(this, Bodyparts.class);
                startActivity(i);
                break;
            case R.id.Animal_section_Card:
                i = new Intent(this, Animal_section.class);
                startActivity(i);
                break;

            case R.id.Flower_Card:
                i = new Intent(this, Flower.class);
                startActivity(i);
                break;

            case R.id.Fruit_Card:
                i = new Intent(this, Fruit.class);
                startActivity(i);
                break;

            case R.id.Bird_Card:
                i = new Intent(this, Bird.class);
                startActivity(i);
                break;

            case R.id.Vegetables_Card:
                i = new Intent(this, Vegetables.class);
                startActivity(i);
                break;
            case R.id.Shapes_Card:
                i = new Intent(this, Shapes.class);
                startActivity(i);
                break;

           /*   case R.id.videosasa_Card:
              i = new Intent(this, vid_ryms_sasa.class);
                startActivity(i);
                break;

              */
        }

    }
}