package com.example.appmultiuso;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    Button btPlayVideo;
    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        video = (VideoView)findViewById(R.id.videoView);
        btPlayVideo = findViewById(R.id.btVideo);
    }

    public void playVideo(View v){
        Uri link = Uri.parse("android.resource://com.example.appmultiuso/"+R.raw.draglogoup);
        video.setVideoURI(link);
        video.start();
    }
}
