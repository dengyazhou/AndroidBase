package com.example.androidbase;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity2 extends AppCompatActivity {

    private static final String TAGDYZ = "DYZ";
    private final String TAGDYZ1 = "Activity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAGDYZ1,"----->>>>>2>>>>>>>onCreate()");
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(TAGDYZ1,"----->>>>>2>>>>>>>onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAGDYZ1,"----->>>>>2>>>>>>>onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAGDYZ1,"----->>>>>2>>>>>>>onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAGDYZ1,"----->>>>>2>>>>>>>onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAGDYZ1,"----->>>>>2>>>>>>>onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAGDYZ1,"----->>>>>2>>>>>>>onDestroy()");
    }

    public void dyzOnCliok2(View view) {
        Log.e(TAGDYZ, "onclick2 xml:");

//        startActivity(new Intent(this, MainActivity2.class));
    }
}
