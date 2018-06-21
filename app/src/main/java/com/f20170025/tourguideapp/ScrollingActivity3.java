package com.f20170025.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ScrollingActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling3);

    }
    public void map(View view){
        String url;
        Intent intent;
        switch (view.getId()) {
            case R.id.button2:
                url = "https://www.google.com/maps/place/Red+Fort/@28.6561592,77.2388316,17z/data=!3m1!4b1!4m5!3m4!1s0x390cfce26ec085ef:0x441e32f4fa5002fb!8m2!3d28.6561592!4d77.2410203";
                intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;

            case R.id.button3:
                url = "https://www.google.com/maps/place/Jama+Masjid/@28.6506792,77.2312481,17z/data=!3m1!4b1!4m5!3m4!1s0x390cfd18df89b215:0xdd57369e29bf9d96!8m2!3d28.6506792!4d77.2334421";
                intent = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
                startActivity(intent);
                break;
            case R.id.button4:

                url = "https://www.google.com/maps/place/Humayun's+Tomb,+Nizamuddin,+Nizamuddin+East,+New+Delhi,+Delhi+110013/@28.5929646,77.2488283,17z/data=!3m1!4b1!4m5!3m4!1s0x390ce31abf23b4d5:0xb20a251215dad3f0!8m2!3d28.5929646!4d77.2510223";
                intent = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
                startActivity(intent);
                break;

        }

    }
    }

