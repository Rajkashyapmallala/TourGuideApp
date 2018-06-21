package com.f20170025.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ScrollingActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling8);
    }
    public void map(View view) {
        String url;
        Intent intent;
        switch (view.getId()) {
            case R.id.button2:
url="https://www.google.co.in/maps/place/Sri+Parthasarathy+Temple/@13.0540108,80.2743021,17z/data=!3m1!4b1!4m5!3m4!1s0x3a52689dfe1e93a1:0xaa50bb6e69dbeb20!8m2!3d13.0540108!4d80.2764962?hl=en";
intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;

            case R.id.button3:
url="https://www.google.co.in/maps/place/Kapaleeswarar+Temple/@13.2547986,79.9013115,17z/data=!3m1!4b1!4m5!3m4!1s0x3a529ca6b936a009:0x31956af938751ad!8m2!3d13.2547986!4d79.9035056?hl=en";
intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;
            case R.id.button4:
url="https://www.google.co.in/maps/place/Mahabalipuram,+Tamil+Nadu+603104/@12.6223265,80.1735897,14z/data=!3m1!4b1!4m5!3m4!1s0x3a5254aa30074dc5:0x9d00999d9ca8933f!8m2!3d12.626927!4d80.1927109?hl=en";
                intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;

        }
    }

}
