package com.goyal.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

        ImageView rick = (ImageView) findViewById(R.id.rick);

        rick.animate().translationXBy(10000f).translationYBy(10000f).rotationBy(3600).setDuration(2000);
//        rick.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
//        rick.animate().rotation(1800f).setDuration(2000);

//        ImageView morty = (ImageView) findViewById(R.id.morty);
//
//        morty.animate().alpha(1.0f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView rick = (ImageView) findViewById(R.id.rick);

        rick.setTranslationX(-10000f);
        rick.setTranslationY(-10000f);

    }
}
