package com.serverproject.facedetection.servicestest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URISyntaxException;

public class MainActivity extends AppCompatActivity {

    Button btnstartservices;
    Button btnstopservices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnstartservices=(Button)findViewById(R.id.btnstartservices);
        btnstartservices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                   startService(new Intent(MainActivity.this,Myservices.class));





            }
        });
        btnstopservices=(Button)findViewById(R.id.btnstopservices);
        btnstopservices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stopService(new Intent(MainActivity.this,Myservices.class));

            }
        });
    }
}
