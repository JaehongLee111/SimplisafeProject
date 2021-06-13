package com.example.gui;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void onNotifClick(View view) {
        Intent ten = new Intent(this, NotifSettingsActivity.class);
        startActivity(ten);
    }

    public void onEmerClick(View view) {
        startActivity(new Intent(this, EmerSettingsActivity.class));
    }

    public void onContactClick(View view) {
        startActivity(new Intent(this, ContactActivity.class));
    }

    public void onTOSClick(View view) {
        startActivity(new Intent (this, TOSActivity.class));
    }

}