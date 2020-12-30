package com.example.kidslearningapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Wild_animal_secondPage extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    TextView txt;
    MediaPlayer hippopotamus_n, kangaroo_n, leopard_n, lion_n, rhinoceros_n, tiger_n, zebra_n;
    MediaPlayer hippopotamus_v, kangaroo_v, leopard_v, lion_v, rhinoceros_v, tiger_v, zebra_v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wild_animal_second_page);

        //Audio of Wild animal name Declaration
        hippopotamus_n = MediaPlayer.create(Wild_animal_secondPage.this, R.raw.hippopotamusn);
        kangaroo_n = MediaPlayer.create(Wild_animal_secondPage.this, R.raw.kangaroon);
        leopard_n = MediaPlayer.create(Wild_animal_secondPage.this, R.raw.leopardn);
        lion_n = MediaPlayer.create(Wild_animal_secondPage.this, R.raw.lionn);
        rhinoceros_n = MediaPlayer.create(Wild_animal_secondPage.this, R.raw.rhinocerosn);
        tiger_n = MediaPlayer.create(Wild_animal_secondPage.this, R.raw.tigern);
        zebra_n = MediaPlayer.create(Wild_animal_secondPage.this, R.raw.zebran);

        // sound/voice of Wild animal name Declaration
        hippopotamus_v = MediaPlayer.create(Wild_animal_secondPage.this, R.raw.hippopotamusv);
        kangaroo_v = MediaPlayer.create(Wild_animal_secondPage.this, R.raw.kangaroov);
        leopard_v = MediaPlayer.create(Wild_animal_secondPage.this, R.raw.leopardv);
        lion_v = MediaPlayer.create(Wild_animal_secondPage.this, R.raw.lionv);
        rhinoceros_v = MediaPlayer.create(Wild_animal_secondPage.this, R.raw.rhinocerosv);
        tiger_v = MediaPlayer.create(Wild_animal_secondPage.this, R.raw.tigerv);
        zebra_v = MediaPlayer.create(Wild_animal_secondPage.this, R.raw.zebrav);


        img = findViewById(R.id.img_wild_animalo);
        txt = findViewById(R.id.txt_wild_animalo);

        //Declaration of  Button
        Button Hippopotamus = findViewById(R.id.btn_hippopotamus);
        Button Kangaroo = findViewById(R.id.btn_kangaroo);
        Button Leopard = findViewById(R.id.btn_leopard);
        Button Lion = findViewById(R.id.btn_lion);
        Button Rhinoceros = findViewById(R.id.btn_rhinoceros);
        Button Tiger = findViewById(R.id.btn_tiger);
        Button Zebra = findViewById(R.id.btn_zebra);
        Button Back_wildanimal = findViewById(R.id.btn_back_wildanimal);

        Hippopotamus.setOnClickListener(this);
        Kangaroo.setOnClickListener(this);
        Leopard.setOnClickListener(this);
        Lion.setOnClickListener(this);
        Rhinoceros.setOnClickListener(this);
        Tiger.setOnClickListener(this);
        Zebra.setOnClickListener(this);
        Back_wildanimal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent s;
        switch (v.getId()) {
            case R.id.btn_hippopotamus:
                hippopotamus_n.start();
                hippopotamus_n.setNextMediaPlayer(hippopotamus_v);
                txt.setText("HIPPOPOTAMUS");
                img.setImageResource(R.mipmap.hippopotamus);
                break;
            case R.id.btn_kangaroo:
                kangaroo_n.start();
                kangaroo_n.setNextMediaPlayer(kangaroo_v);
                txt.setText("KANGAROO");
                img.setImageResource(R.mipmap.kangaroo);
                break;
            case R.id.btn_leopard:
                leopard_n.start();
                leopard_n.setNextMediaPlayer(leopard_v);
                txt.setText("LEOPARD");
                img.setImageResource(R.mipmap.leopard);
                break;
            case R.id.btn_lion:
                lion_n.start();
                lion_n.setNextMediaPlayer(lion_v);
                txt.setText("LION");
                img.setImageResource(R.mipmap.lion);
                break;
            case R.id.btn_rhinoceros:
                rhinoceros_n.start();
                rhinoceros_n.setNextMediaPlayer(rhinoceros_v);
                txt.setText("RHINOCEROS(RHINO)");
                img.setImageResource(R.mipmap.rhinoceros);
                break;
            case R.id.btn_tiger:
                tiger_n.start();
                tiger_n.setNextMediaPlayer(tiger_v);
                txt.setText("TIGER");
                img.setImageResource(R.mipmap.tiger);
                break;
            case R.id.btn_zebra:
                zebra_n.start();
                zebra_n.setNextMediaPlayer(zebra_v);
                txt.setText("ZEBRA");
                img.setImageResource(R.mipmap.zebra);
                break;
            case R.id.btn_back_wildanimal:
                s = new Intent(this, Wild_animal.class);
                startActivity(s);
                break;
        }
    }
}