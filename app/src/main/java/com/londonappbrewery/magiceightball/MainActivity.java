package com.londonappbrewery.magiceightball;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView ballImage;
    private TextView helloText;
    private Button askButton;
    private int[] ballReferencesArray = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };
    private String[] helloString = {
            "Know your future",
            "Узнай свое будущее"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        askButton = findViewById(R.id.askButton);
        helloText = findViewById(R.id.textHello);
        ballImage = findViewById(R.id.imageView);
        final Random random = new Random();
        helloText.setText(helloString[random.nextInt(helloString.length)]);
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ballImage.setImageResource(ballReferencesArray[random.nextInt(ballReferencesArray.length)]);
            }
        });
    }
}
