package com.example.photoframesapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public int imgCounter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Previous image
    public void prevImg(View view) {
        ImageView[] arrayImages = {findViewById(R.id.imageView2),
                                   findViewById(R.id.imageView3),
                                   findViewById(R.id.imageView4),
                                   findViewById(R.id.imageView5),
                                   findViewById(R.id.imageView6),
                                   findViewById(R.id.imageView7)};

        if (imgCounter > 0 && imgCounter <= 5) {
            arrayImages[imgCounter].setVisibility(View.INVISIBLE);
            imgCounter--;
            arrayImages[imgCounter].setVisibility(View.VISIBLE);
        }
    }

    // Next image
    public void nextImg(View view) {
        ImageView[] arrayImages = {findViewById(R.id.imageView2),
                                   findViewById(R.id.imageView3),
                                   findViewById(R.id.imageView4),
                                   findViewById(R.id.imageView5),
                                   findViewById(R.id.imageView6),
                                   findViewById(R.id.imageView7)};

        if (imgCounter >= 0 && imgCounter < 5) {
            if (arrayImages[imgCounter].getVisibility() == View.VISIBLE) {
                arrayImages[imgCounter].setVisibility(View.INVISIBLE);
                imgCounter++;
                arrayImages[imgCounter].setVisibility(View.VISIBLE);
            }
            else {
                arrayImages[imgCounter].setVisibility(View.VISIBLE);
                imgCounter++;
            }
        }
    }
}