package com.example.androidbase;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.androidbase.ActivityLifecycle.DyzActivityLifecycleCallbacks;

public class MainActivity extends AppCompatActivity {

    private static final String TAGDYZ = "DYZ";
    private final String TAGDYZ1 = "Activity生命周期";

    private EditText eText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAGDYZ1,"----->>>>>1>>>>>>>onCreate()");
        // 打印
        Log.v(TAGDYZ,"v 打印 你好世界");
        Log.d(TAGDYZ,"d 打印 你好世界");
        Log.i(TAGDYZ,"i 打印 你好世界");
        Log.w(TAGDYZ,"w 打印 你好世界");
        Log.e(TAGDYZ,"e 打印 你好世界");

        // 开始
//        setContentView(R.layout.activity_main);
//        TextView tv_one = findViewById(R.id.tv_two);
//        tv_one.setText("你好世界！Hello World!123456789ABCDFG");

        // Button
        setContentView(R.layout.activity_button);
        Button btn = findViewById(R.id.btn1);
        // 点击事件
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAGDYZ, "onClick1");
            }
        });


        // EditText
//        setContentView(R.layout.activity_edittext);
//        Button btn = findViewById(R.id.btn);
//        EditText et = findViewById(R.id.et);
//        eText = et;
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String text = et.getText().toString();
//                Log.e("TD", text);
//            }
//        });
    }

    // 进入主界面
    public void dyzOnClick(View view) {
        Log.e(TAGDYZ, "onclick xml:");
        startActivity(new Intent(this, MainActivity2.class));
    }

    // Activity生命周期回调
    public void dyzOnClick1(View view) {
        Log.e(TAGDYZ, "Activity生命周期回调");
        DyzActivityLifecycleCallbacks dyzActivityLifecycleCallbacks = new DyzActivityLifecycleCallbacks();

        final Application app = (Application) this.getApplicationContext();
        app.registerActivityLifecycleCallbacks(dyzActivityLifecycleCallbacks);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(TAGDYZ1,"----->>>>>1>>>>>>>onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAGDYZ1,"----->>>>>1>>>>>>>onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAGDYZ1,"----->>>>>1>>>>>>>onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAGDYZ1,"----->>>>>1>>>>>>>onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAGDYZ1,"----->>>>>1>>>>>>>onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAGDYZ1,"----->>>>>1>>>>>>>onDestroy()");
    }


}