package com.f20170025.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void delhi(View view){
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
    }
    public void hyd(View view){
        Intent i=new Intent(this,Main3Activity.class);
        startActivity(i);
    }
    public void chenn(View view){
        Intent i=new Intent(this,Main4Activity.class);
        startActivity(i);
    }
}
