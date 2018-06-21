package com.f20170025.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ScrollingActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling6);

    }
    public void map(View view) {
        String url;
        Intent intent;
        switch (view.getId()) {
            case R.id.button2:
        url="https://www.google.co.in/maps/place/Novotel+Hyderabad+Airport/@17.2424915,78.4524911,17z/data=!3m1!4b1!4m7!3m6!1s0x3bcbbca050e8b6ff:0xb45f0b32ce0cd063!5m1!1s2018-07-10!8m2!3d17.2424915!4d78.4546851?hl=en";               intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;

            case R.id.button3:
url="https://www.google.co.in/maps/place/Taj+Banjara/@17.409748,78.446559,17z/data=!3m1!4b1!4m7!3m6!1s0x3bcba1e907c04ec7:0x175dc086cd3b3df1!5m1!1s2018-07-01!8m2!3d17.409748!4d78.448753?hl=en";                intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;
            case R.id.button4:

url="https://www.google.co.in/maps/place/Vivanta+by+Taj+Begumpet,+Hyderabad/@17.4432666,78.4585635,17z/data=!3m1!4b1!4m7!3m6!1s0x3bcb90bb9b3efd6b:0x7f21cd71089798ef!5m1!1s2018-07-01!8m2!3d17.4432666!4d78.4607575?hl=en";                intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;

        }
    }
}
