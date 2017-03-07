package com.example.overtatech_4.mylibraryapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mylibrary.LibActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view){
        // Show toast from lib
        LibActivity.showToast(this,"Hello from Lib");

    }
}
