package com.f20170025.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void ta(View view){
        Intent i=new Intent(this,ScrollingActivity4.class);
        startActivity(i);
    }
    public void temp(View view){
        Intent i=new Intent(this,ScrollingActivity5.class);
        startActivity(i);
    }
    public void hote(View view){
        Intent i=new Intent(this,ScrollingActivity6.class);
        startActivity(i);
    }
}
