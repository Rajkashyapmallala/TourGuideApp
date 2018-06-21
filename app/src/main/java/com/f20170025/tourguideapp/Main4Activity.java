package com.f20170025.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void ta(View view){
        Intent i=new Intent(this,ScrollingActivity7.class);
        startActivity(i);
    }
    public void temp(View view){
        Intent i=new Intent(this,ScrollingActivity8.class);
        startActivity(i);
    }
    public void hote(View view){
        Intent i=new Intent(this,ScrollingActivity9.class);
        startActivity(i);
    }
}
