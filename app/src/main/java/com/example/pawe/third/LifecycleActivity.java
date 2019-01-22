package com.example.pawe.third;

import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Date;

public class LifecycleActivity extends AppCompatActivity {
    private static int notificationId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        makeNotificationOnClick("onCreate");
    }

    @Override
    protected void onStart() {
        makeNotificationOnClick("onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        makeNotificationOnClick("onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        makeNotificationOnClick("onPause");
        super.onPause();
    }
    public void makeNotificationOnClick(String text) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "1")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle(text)
                .setContentText(String.valueOf(new Date()))
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true);
        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(notificationId,builder.build());
        notificationId++;
    }
}
