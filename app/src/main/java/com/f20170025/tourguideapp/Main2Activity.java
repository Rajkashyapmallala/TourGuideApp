package com.f20170025.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void ta(View view){
        Intent i=new Intent(this,ScrollingActivity3.class);
        startActivity(i);
    }
    public void temp(View view){
        Intent i=new Intent(this,ScrollingActivity2.class);
        startActivity(i);
    }
    public void hote(View view){
        Intent i=new Intent(this,ScrollingActivity.class);
        startActivity(i);
    }
}
