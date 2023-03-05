package com.example.androidbase;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;

import com.example.androidbase.handler.DyzHandler;
import com.example.androidbase.thread.DyzThread;




public class HandlerActivity extends AppCompatActivity {
    private final String TAG = "HandlerActivity";
    private final String TAG_Handler = "Handler";

    private final Handler mHandler = new DyzHandler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
    }

    public void onClickThread(View view) {
        Log.v(TAG,"onClickThread 点击了");
//        Log.v("当前线程",Thread.currentThread().getName());
        // Thread基本用法

        // 方式一
        // Thread类实现了Runnable接口，必须重写run()方法；
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Log.v(TAG,"开启了一条新线程");
//                Log.v("开启了一条新线程",Thread.currentThread().getName());
//            }
//        });
//        //启动一个线程，用start()方法；
//        thread.start();

        // 方式二
//        DyzThread dyzThread = new DyzThread();
//        Thread thread = new Thread(dyzThread);
////        Thread thread = new Thread(dyzThread,"线程2");
//        thread.start();


    }

    public void onClickHander(View view) {
        Log.v(TAG,"onClickHander 点击了");
//        https://www.cnblogs.com/nullering/p/7898512.html

        //相当于一个500毫秒执行一次的定时器
//        final Handler handler = new Handler();
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                Log.v("==>>ThreadName:",Thread.currentThread().getName());
////                handler.postDelayed(this, 500);
//                Log.v(TAG,"runnable 来了");
//            }
//        };
//        handler.postDelayed(runnable, 500);



//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Log.v("开启了一条新线程",Thread.currentThread().getName());
//
//                // 子线程中发送一个msg
//                final Message msg = Message.obtain();
//                msg.what = 1992;
//                msg.obj = "abc";
//                if (null != mHandler) {
//                    Log.v(TAG_Handler,"新线程中发送msg");
//                    mHandler.sendMessage(msg);
//                }
//
//            }
//        });
//        thread.start();

    }

    public void onClickHanderThread(View view) {
        Log.v(TAG,"onClickHanderThread 点击了");
        // HandlerThread基本用法
//        HandlerThread handlerThread = new HandlerThread("test1");
    }
}