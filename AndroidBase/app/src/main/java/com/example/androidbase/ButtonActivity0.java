package com.example.androidbase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class ButtonActivity0 extends AppCompatActivity {

    private static final String TAGDYZBTN = "DYZ======btn";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button0);


//        TODO 按钮点击回调 1
        Button btn = findViewById(R.id.btndyz1);
        // 点击事件
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v(TAGDYZBTN,"onClick id");
            }
        });

//        // 长按事件
//        btn.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View view) {
//                Log.e(TAGDYZBTN, "onLong");
//                return false;
//            }
//        });
//
//        // 触摸事件
//        btn.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                Log.e(TAGDYZBTN, "onTouch: " + motionEvent.getAction());
//                return false;
//            }
//        });
    }

//    TODO 按钮点击回调 2
    public void buttonClickDYZ(View view) {
        Log.v(TAGDYZBTN,"onClick 方法名");
    }
}