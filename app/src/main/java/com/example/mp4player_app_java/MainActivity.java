package com.example.mp4player_app_java;

import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button playButton, stopButton;
    VideoView videoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton = findViewById(R.id.button);
        stopButton = findViewById(R.id.button3);
        videoView = findViewById(R.id.videoView2);
        mediaController = new MediaController(this);

        playButton.setOnClickListener(v -> {
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.thunder);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);
            videoView.start();
        });

        stopButton.setOnClickListener(v -> videoView.stopPlayback());
    }
}