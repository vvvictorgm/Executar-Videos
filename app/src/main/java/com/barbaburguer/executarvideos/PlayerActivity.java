package com.barbaburguer.executarvideos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        videoView = findViewById(R.id.videoView);
        //esconder a barra de nevegação e status bar ( deixa full screen)
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        //escondendo a ActionBar
        getSupportActionBar().hide();

    //executar video
        //definir controladores
        videoView.setMediaController(new MediaController(this));
        //define o caminho do video
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video);
        //começa o video
        videoView.start();
    }

}
