package com.f20170025.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ScrollingActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling2);
    }
    public void map(View view){
        String url;
        Intent intent;
        switch (view.getId()) {
            case R.id.button2:
url="https://www.google.co.in/maps/search/iskcon+delhi/@28.6426357,77.0748859,12z/data=!3m1!4b1?hl=en";                intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;

            case R.id.button3:
url="https://www.google.co.in/maps/place/Lotus+Temple/@28.553492,77.2566324,17z/data=!3m1!4b1!4m5!3m4!1s0x390ce3c16e028cd1:0x653beb1ee85ec67a!8m2!3d28.553492!4d77.2588264?hl=en" ;
intent = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
                startActivity(intent);
                break;
            case R.id.button4:

url="https://www.google.co.in/maps/place/Akshardham+Temple/@28.617621,77.277942,17z/data=!3m1!4b1!4m5!3m4!1s0x390ce35a0646aa93:0xa5563912cee5c9b!8m2!3d28.617621!4d77.280136?hl=en" ;
intent = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
                startActivity(intent);
                break;

        }

    }
}
