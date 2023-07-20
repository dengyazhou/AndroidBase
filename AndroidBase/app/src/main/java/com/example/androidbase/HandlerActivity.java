package com.example.androidbase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;

import com.example.androidbase.handler.DyzHandler;
import com.example.androidbase.handler.DyzHandler1;
import com.example.androidbase.thread.DyzRunnable;




public class HandlerActivity extends AppCompatActivity {
    private final String TAG = "HandlerActivity";
    private final String TAG_Handler = "Handler";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
    }

    public void onClickThread(View view) {
        Log.v(TAG,"onClickThread 点击了");
        Log.v("当前线程",Thread.currentThread().getName());
        // Thread基本用法

        // 方式一
        // Thread类实现了Runnable接口，必须重写run()方法；
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Log.v(TAG,"开启了一条新线程");
                Log.v("开启了一条新线程",Thread.currentThread().getName());
            }
        });
//        启动一个线程，用start()方法；
        thread.start();

        // 方式二
//        DyzRunnable dyzRunnable = new DyzRunnable();
////        Thread thread = new Thread(dyzRunnable);
//        Thread thread = new Thread(dyzRunnable,"线程2");
//        thread.start();


    }

    public void onClickHander(View view) {
        Log.v(TAG,"onClickHander 点击了");
//        https://www.cnblogs.com/nullering/p/7898512.html

        //相当于一个500毫秒执行一次的定时器
        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Log.v("==>>ThreadName3:",Thread.currentThread().getName());
//                handler.postDelayed(this, 5000);
                Log.v(TAG,"runnable 来了");
            }
        };
//        handler.postDelayed(runnable, 3000);
        handler.post(runnable);
        Log.v("==>>ThreadName1:",Thread.currentThread().getName());
//        try {
//            Thread.sleep(10000);
//        } catch (Exception e) {
//
//        }
        Log.v("==>>ThreadName2:",Thread.currentThread().getName());




//        Handler mHandler = new DyzHandler();
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

    public void onClickLooper(View view) {
        Log.v(TAG,"onClickLooper 点击了");

//        this.getMainLooper();
//        Looper.myLooper(); // 获取当前线程的 Looper
//        Looper.getMainLooper();
//        Looper.prepare(); // 创建一个新的 Looper

        Log.v(TAG,"Looper ====>>>> 开始");
//        Looper.prepare(); // 创建一个新的 Looper
        Looper looper = Looper.myLooper(); // 获取当前线程的 Looper
        Handler handler = new Handler(looper);// 创建一个 Handler，关联指定的 Looper
        handler.post(new Runnable() {
            @Override
            public void run() {
                // 执行任务
                Log.v("执行任务dyz 所在线程",Thread.currentThread().getName());
            }
        });
        Log.v(TAG,"Looper ====>>>> 结束");

    }

    public void onClickHanderThread(View view) {
        Log.v(TAG,"onClickHanderThread 点击了");
        // HandlerThread基本用法
        HandlerThread handlerThread = new HandlerThread("Thead_dya_001");
        handlerThread.start();
        DyzHandler1 handler1 = new DyzHandler1(handlerThread.getLooper());

        final Message msg = Message.obtain();
        msg.what = 1993;
        msg.obj = "abcd";
        if (null != handler1) {
            Log.v(TAG_Handler,"发送msg");
            handler1.sendMessage(msg);
        }
    }
}