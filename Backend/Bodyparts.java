package com.example.kidslearningapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Bodyparts extends AppCompatActivity implements View.OnClickListener {

    Button face, ear, mouth, hand, knee, eye, nose, arm, leg, toe, btn_next;
    MediaPlayer facen,earn, mouthn, handn,kneen, eyen, nosen, armn, legn, toen, Btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyparts_page);
        //Audio Declaration
        facen = MediaPlayer.create(Bodyparts.this, R.raw.face);
        earn = MediaPlayer.create(Bodyparts.this, R.raw.ear);
        mouthn = MediaPlayer.create(Bodyparts.this, R.raw.mouth);
        handn = MediaPlayer.create(Bodyparts.this, R.raw.hand);
        kneen = MediaPlayer.create(Bodyparts.this, R.raw.knee);
        eyen = MediaPlayer.create(Bodyparts.this, R.raw.eye);
        nosen = MediaPlayer.create(Bodyparts.this, R.raw.nose);
        armn = MediaPlayer.create(Bodyparts.this, R.raw.arm);
        legn = MediaPlayer.create(Bodyparts.this, R.raw.legs);
        toen = MediaPlayer.create(Bodyparts.this, R.raw.toe);
        Btn_next = MediaPlayer.create(Bodyparts.this, R.raw.part_of_body);


        face = findViewById(R.id.btn_face);
        ear = findViewById(R.id.btn_ear);
        mouth = findViewById(R.id.btn_mouth);
        hand = findViewById(R.id.btn_hand);
        knee = findViewById(R.id.btn_knee);
        eye = findViewById(R.id.btn_eye);
        nose = findViewById(R.id.btn_nose);
        arm = findViewById(R.id.btn_arm);
        leg = findViewById(R.id.btn_leg);
        toe = findViewById(R.id.btn_toe);
        btn_next = findViewById(R.id.btn_next);


        face.setOnClickListener(this);
        ear.setOnClickListener(this);
        mouth.setOnClickListener(this);
        hand.setOnClickListener(this);
        knee.setOnClickListener(this);
        eye.setOnClickListener(this);
        nose.setOnClickListener(this);
        arm.setOnClickListener(this);
        leg.setOnClickListener(this);
        toe.setOnClickListener(this);
        btn_next.setOnClickListener(this);
        //VideoView videoView = findViewById(R.id.videoView);
        //String videopath = "android.resource://"  + getPackageName() +"/" + R.raw.bodyparts;
        //Uri uri = Uri.parse(videopath);
        // VideoView.setVideoURI(uri);
        //MediaController mediaController = new MediaController(this);
        // VideoView.setMediaController(MediaController);
        //mediaController.setAnchorView(videoView);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.btn_face:
                facen.start();
                break;
            case R.id.btn_ear:
                earn.start();
                break;
            case R.id.btn_mouth:
                mouthn.start();
                break;
            case R.id.btn_hand:
                handn.start();
                break;
            case R.id.btn_knee:
                kneen.start();
                break;
            case R.id.btn_eye:
                eyen.start();
                break;
            case R.id.btn_nose:
                nosen.start();
                break;
            case R.id.btn_arm:
                armn.start();
                break;
            case R.id.btn_leg:
                legn.start();
                break;
            case R.id.btn_toe:
                toen.start();
                break;
            case R.id.btn_next:
                i = new Intent(this, Bodyparts_pageSecond.class);
                startActivity(i);
                break;


        }

    }
}