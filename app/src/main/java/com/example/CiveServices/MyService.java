package com.example.CiveServices;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

public class MyService extends Service {
    MediaPlayer myPlayer;
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

        @Override
        public void onCreate(){
            super.onCreate();
        }

        @Override
        public int onStartCommand(Intent intent, int flags, int startId) {
           myPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
           myPlayer.setLooping(true);
           myPlayer.start();
           return START_STICKY;
        }

        @Override
        public void onDestroy()
        {
            super.onDestroy();
            myPlayer.stop();
        }

    }

