package com.example.androidbase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "shushu";

    private EditText eText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 开始
//        setContentView(R.layout.activity_main);
//        TextView tv_one = findViewById(R.id.tv_two);
//        tv_one.setText("你好世界！Hello World!123456789ABCDFG");


        // Button
//        setContentView(R.layout.activity_button);
//        Button btn = findViewById(R.id.btn);
//        // 点击事件
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.e(TAG, "onClick");
//            }
//        });
//        // 长按事件
//        btn.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View view) {
//                Log.e(TAG, "onLong");
//                return false;
//            }
//        });
//        // 触摸事件
//        btn.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                Log.e(TAG, "onTouch: " + motionEvent.getAction());
//                return false;
//            }
//        });

        // EditText
        setContentView(R.layout.activity_edittext);
        Button btn = findViewById(R.id.btn);
        EditText et = findViewById(R.id.et);
        eText = et;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = et.getText().toString();
                Log.e("TD", text);
            }
        });
    }

    public void dyzOnCliok(View view) {
        Log.e("TD", "onclick:");
    }
}