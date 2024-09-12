package com.example.weekfivepresident;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FullScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        Intent prevPage = getIntent();
        String imageName = prevPage.getStringExtra("screen");

        ImageView imageView = findViewById(R.id.fullscreen_image);
        switch (imageName) {
            case "img1":
                imageView.setBackgroundResource(R.drawable.rp);
                break;
            case "img2":
                imageView.setBackgroundResource(R.drawable.radhakrishann);
                break;
            case "img3":
                imageView.setBackgroundResource(R.drawable.zakir);
                break;
            case "img4":
                imageView.setBackgroundResource(R.drawable.kalam);
                break;
        }

    }
}