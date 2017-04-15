package com.serverproject.facedetection.servicestest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Eslam on 4/15/2017.
 */

public class Myservices extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        
        String message = "success start service";
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();

        return START_STICKY;
    }



    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"Destroy start service",Toast.LENGTH_SHORT).show();

    }
}
