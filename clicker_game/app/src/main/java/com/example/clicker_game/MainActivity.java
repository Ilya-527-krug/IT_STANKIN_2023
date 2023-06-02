package com.example.clicker_game;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.ref.PhantomReference;

public class MainActivity extends AppCompatActivity {
    private TextView textViewCount;
    private ImageView imageViewLVL;
    private Button buttonClick;
    private int count;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textViewCount = findViewById(R.id.text_view_count);
        imageViewLVL = findViewById(R.id.image_view_lvl);
        buttonClick = findViewById(R.id.button_click);
        count = 0;

        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                textViewCount.setText(count + " ");

                switch (count) {
                    case 10:
                        imageViewLVL.setImageResource(R.drawable.photo);
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.sverchki);
                        mediaPlayer.start();
                        break;

                    case 20:
                        imageViewLVL.setImageResource(R.drawable.photo2);
                        break;
                }

            }
        });
    }
    @Override
    protected void onPause(){
        super.onPause();
        mediaPlayer.pause();

    }
    @Override
    protected  void onResume() {
        super.onResume();
    }

}