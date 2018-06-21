package com.f20170025.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.Locale;


public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
    }
    public void map(View view){
        String url;
        Intent intent;
        switch (view.getId()) {
            case R.id.button2:
url="https://www.google.co.in/maps/place/Andaz+Delhi-a+concept+by+Hyatt/@28.5547513,77.1194677,17z/data=!3m1!4b1!4m7!3m6!1s0x390d1c68e56ccff3:0x377c64cf8683b859!5m1!1s2018-07-13!8m2!3d28.5547513!4d77.1216617?hl=en";
                 intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;

            case R.id.button3:
url="https://www.google.co.in/maps/place/The+Lodhi/@28.591814,77.23602,17z/data=!3m1!4b1!4m7!3m6!1s0x390ce2ee34aba50d:0xf9f9d1d297d678c!5m1!1s2018-06-26!8m2!3d28.591814!4d77.238214?hl=en";
                 intent = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
                startActivity(intent);
                break;
            case R.id.button4:
url="https://www.google.co.in/maps/place/Roseate+House/@28.5508919,77.1183765,17z/data=!3m1!4b1!4m7!3m6!1s0x390d1c6be31e1a2b:0x3ff0df3b27803bda!5m1!1s2018-06-26!8m2!3d28.5508919!4d77.1205705?hl=en";
                 intent = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
                startActivity(intent);
                break;

                }

    }
}
