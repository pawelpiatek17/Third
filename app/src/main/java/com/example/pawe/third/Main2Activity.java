package com.example.pawe.third;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends LifecycleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void startNextActivityOnClick(View view) {
        Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);
    }
}
