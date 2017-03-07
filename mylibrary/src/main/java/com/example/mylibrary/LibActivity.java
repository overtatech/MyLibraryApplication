package com.example.mylibrary;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class LibActivity {

    public static void showToast(Context context,String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
