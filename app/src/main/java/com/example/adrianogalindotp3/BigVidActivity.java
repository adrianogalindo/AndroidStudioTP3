package com.example.adrianogalindotp3;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class BigVidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_vid);

        VideoView mVideoOView = findViewById(R.id.mVideoViewBig);
        String uriPath = "android.resource://com.example.adrianogalindotp3/" + R.raw.bigvideo;

        Uri uri = Uri.parse(uriPath);
        mVideoOView.setVideoURI(uri);
        mVideoOView.requestFocus();

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(mVideoOView);
        mVideoOView.setMediaController(mediaController);
        mVideoOView.start();
    }
}
