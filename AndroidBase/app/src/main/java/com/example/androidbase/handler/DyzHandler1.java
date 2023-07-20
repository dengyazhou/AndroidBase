package com.example.androidbase.handler;


import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import androidx.annotation.NonNull;

public class DyzHandler1 extends Handler {
    private final String TAG_Handler = "Handler1";

    public DyzHandler1(Looper looper) {
        super(looper);
    }

    @Override
    public void handleMessage(@NonNull Message msg) {
        super.handleMessage(msg);

        Log.v(TAG_Handler,"Handler的handleMessage来了");
        Log.v("handleMessage所在线程",Thread.currentThread().getName());//HandlerThread的looper 是在那个线程就是 这里的回调就是那个线程。

//        Bundle b = msg.getData();
        Object obj = msg.obj;
        Object what = msg.what;
        Log.v(TAG_Handler,obj.toString());
        Log.v(TAG_Handler,what.toString());
    }
}
