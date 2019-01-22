package com.example.pawe.third;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class Main3Activity extends LifecycleActivity {
    private int counter = 0;
    private static final String EXTRA = "com.example.pawe.third.saved_counter";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt(EXTRA);
        }
        ((TextView)findViewById(R.id.textView_counter)).setText(String.valueOf(counter));
    }

    @Override
    protected void onResume() {
        ((TextView)findViewById(R.id.textView_counter)).setText(String.valueOf(counter));
        super.onResume();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        counter++;
        outState.putInt(EXTRA,counter);
        super.onSaveInstanceState(outState);
    }

    @Override
    public Object onRetainCustomNonConfigurationInstance() {
        Toast.makeText(this,String.valueOf(new Date()),Toast.LENGTH_SHORT).show();
        return super.onRetainCustomNonConfigurationInstance();
    }

    @Nullable
    @Override
    public Object getLastNonConfigurationInstance() {
        Toast.makeText(this,String.valueOf(new Date()),Toast.LENGTH_SHORT).show();
        return super.getLastNonConfigurationInstance();
    }
}
