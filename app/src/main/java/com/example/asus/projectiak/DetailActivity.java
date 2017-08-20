package com.example.asus.projectiak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import java.util.logging.LoggingMXBean;

public class DetailActivity extends AppCompatActivity {

    Toolbar xToolbar;
    ImageView xImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        xToolbar = (Toolbar) findViewById(R.id.toolbar2);
        xImageView = (ImageView) findViewById(R.id.imageView2);

        Bundle xBundle = getIntent().getExtras();
        if (xBundle != null){
            xToolbar.setTitle(xBundle.getString("BakeryNames"));
            xImageView.setImageResource(xBundle.getInt("BakeryPhoto"));
        }
    }
}
