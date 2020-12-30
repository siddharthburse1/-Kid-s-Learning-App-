package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class vid_ryms_sasa extends AppCompatActivity {
    VideoView myvideo;
    MediaController mediaController;
    Button btnplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vid_ryms_sasa);

        btnplay= findViewById(R.id.vid_play);
        myvideo= findViewById(R.id.videoPlayer);

        mediaController= new MediaController(this);
        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://com.android.developer.arsl.videoplayer/"+R.raw.ss;
                Uri uri = Uri.parse(videoPath);
                myvideo.setVideoURI(uri);
                myvideo.setMediaController(mediaController);
                mediaController.setAnchorView(myvideo);
                myvideo.start();

            }
        });
    }
}