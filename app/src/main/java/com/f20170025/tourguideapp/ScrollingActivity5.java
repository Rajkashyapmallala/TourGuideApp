package com.f20170025.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ScrollingActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling5);
    }
    public void map(View view) {
        String url;
        Intent intent;
        switch (view.getId()) {
            case R.id.button2:
                url="https://www.google.co.in/maps/place/Birla+Mandir/@17.4062367,78.4668661,17z/data=!3m1!4b1!4m5!3m4!1s0x3bcb975dd124c005:0x59439ffad6e0298e!8m2!3d17.4062367!4d78.4690601?hl=en";
                intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;

            case R.id.button3:
url="https://www.google.co.in/maps/place/Shri+Jagannath+Temple,+Hyderabad/@17.4151559,78.4240126,17z/data=!3m1!4b1!4m5!3m4!1s0x3bcb96d70ff8b6f3:0xde370030b7d7d2fe!8m2!3d17.4151559!4d78.4262066?hl=en";                intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;
            case R.id.button4:

url="https://www.google.co.in/maps/search/Chilkur+Balaji+Temple,+Telangana/@17.357764,78.2970825,17z/data=!3m1!4b1?hl=en";                intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;

        }
    }
}
