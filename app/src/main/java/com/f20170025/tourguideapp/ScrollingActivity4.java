package com.f20170025.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ScrollingActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling4);

    }

    public void map(View view) {
        String url;
        Intent intent;
        switch (view.getId()) {
            case R.id.button2:
url="https://www.google.co.in/maps/place/Ramoji+Film+City,+Telangana/@17.2756344,78.6454789,13z/data=!3m1!4b1!4m5!3m4!1s0x3bcb0a2271893ff5:0xf993da1fbc177b06!8m2!3d17.2558264!4d78.6824194?hl=en";                intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;

            case R.id.button3:
                url = "https://www.google.co.in/maps/place/Golconda+Fort,+Hyderabad,+Telangana/@17.3833939,78.3926703,15z/data=!3m1!4b1!4m5!3m4!1s0x3bcb968c5f1342f3:0xd752a9bdbdde84df!8m2!3d17.3853626!4d78.4041297?hl=en";
                intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;
            case R.id.button4:

                url = "https://www.google.co.in/maps/place/Charminar/@17.3615636,78.4724705,17z/data=!3m1!4b1!4m5!3m4!1s0x3bcb978a6e1a939b:0xcb5a69e4aaf113fb!8m2!3d17.3615636!4d78.4746645?hl=en";
                intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;

        }
    }
}
