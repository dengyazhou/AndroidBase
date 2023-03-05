package com.example.androidbase;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HandlerThreadActivity extends AppCompatActivity {
    private final String TAG = "HandlerThreadActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handerthread);
        Log.v(TAG,"HandlerThreadActivity 来了");
    }

    public void onClickHanderThread(View view) {
        Log.v(TAG,"点击了");
    }
}
