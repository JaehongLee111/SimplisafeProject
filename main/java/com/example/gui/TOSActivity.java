package com.example.gui;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.gui.ui.slideshow.SlideshowFragment;

public class TOSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tos);
    }

    public void onBackClick(View view) {
        startActivity(new Intent (this, SlideshowFragment.class));
    }
}