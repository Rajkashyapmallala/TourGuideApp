package com.f20170025.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ScrollingActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling7);
        }
    public void map(View view) {
        String url;
        Intent intent;
        switch (view.getId()) {
            case R.id.button2:
                url="https://www.google.co.in/maps/place/Marina+Beach/@13.0463432,80.2634401,14.25z/data=!4m5!3m4!1s0x3a52689bb60132bb:0x549cf8edf62b60a!8m2!3d13.0499526!4d80.2824026?hl=en";
                intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;

            case R.id.button3:
                url="https://www.google.co.in/maps/place/Government+Museum+Chennai/@13.0716298,80.2546014,17z/data=!3m1!4b1!4m5!3m4!1s0x3a52660ef39b8afb:0x9507fa7b131c1c36!8m2!3d13.0716298!4d80.2567955?hl=en";
                intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;
            case R.id.button4:
                url="https://www.google.co.in/maps/place/Ripon+Building,+Sydenhams+Rd,+Kannappar+Thidal,+Poongavanapuram,+Chennai,+Tamil+Nadu+600003/@13.081958,80.2693567,17z/data=!3m1!4b1!4m5!3m4!1s0x3a526600a940d6fd:0xfb6071466f885a56!8m2!3d13.081958!4d80.2715508?hl=en";
                intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;

        }
    }
}
