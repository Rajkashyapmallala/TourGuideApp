package com.f20170025.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ScrollingActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling9);
    }
    public void map(View view) {
        String url;
        Intent intent;
        switch (view.getId()) {
            case R.id.button2:
url="https://www.google.co.in/maps/place/Radisson+Blu+Hotel+Chennai+City+Centre/@13.0670598,80.2534407,17z/data=!3m1!4b1!4m7!3m6!1s0x3a526614093abc83:0xc2b19e69906b782d!5m1!1s2018-06-29!8m2!3d13.0670598!4d80.2556348?hl=en";
                intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;

            case R.id.button3:
url="https://www.google.co.in/maps/place/Trident+Hotel+Chennai/@12.9937755,80.1840262,17z/data=!3m1!4b1!4m7!3m6!1s0x3a525e17f908c5a5:0xeef04ea3bd8ff245!5m1!1s2018-07-06!8m2!3d12.9937755!4d80.1862203?hl=en";
                intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;
            case R.id.button4:
url="https://www.google.co.in/maps/place/Taj+Club+House/@13.0614009,80.2616975,17z/data=!3m1!4b1!4m7!3m6!1s0x3a526617bb561347:0x2db5fe89a2fdc300!5m1!1s2018-06-30!8m2!3d13.0614009!4d80.2638916?hl=en";
                intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;

        }
    }
}
