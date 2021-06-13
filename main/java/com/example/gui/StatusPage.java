package com.example.gui;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class StatusPage extends AppCompatActivity {
    private TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        status = findViewById(R.id.status);

    }

    public void onMenuClick(View view){
        Intent tent = new Intent(this, NavigationMenuActivity.class);
        startActivity(tent);
    }

    public void onRadioButtonClicked(View view){
        boolean check = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_off:
                if (check){
                    status.setText("Off");
                    status.setTextColor(Color.LTGRAY);
                } break;
            case R.id.radio_away:
                if (check){
                    status.setText("Away");
                    status.setTextColor(0xEB6D49);
                } break;
            case R.id.radio_home:
                if (check){
                    status.setText("Home");
                    status.setTextColor(0x62A247);
                } break;
        }
    }
}