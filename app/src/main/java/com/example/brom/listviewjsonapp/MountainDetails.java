package com.example.brom.listviewjsonapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MountainDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();

        String name = extras.getString("EXTRA_NAME");
        String location = extras.getString("EXTRA_LOCATION");
        String height = extras.getString("EXTRA_HEIGHT");
        String url = extras.getString("EXTRA_URL");

        TextView nameText = (TextView) findViewById(R.id.mountainNameText);
        TextView heightText = (TextView) findViewById(R.id.mountainHeightText);
        TextView locationText = (TextView) findViewById(R.id.mountainLocationText);

        ImageView image = (ImageView)findViewById(R.id.mountainImage);

        nameText.setText(name);
        heightText.setText(height);
        locationText.setText(location);
    }

}
