package com.example.lb1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String msg = "Android";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg,"On create started");

    }

    public void startService(View view){
        startService(new Intent(getBaseContext(),Myservice.class));
    }
    public void stopService(View view){
        stopService(new Intent(getBaseContext(),Myservice.class));
    }
}