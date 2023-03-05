package com.example.androidbase.handler;


import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import androidx.annotation.NonNull;

import java.util.Objects;


public class DyzHandler extends Handler {
    private final String TAG_Handler = "Handler";
//    public DyzHandler() {
//        super();
//    }

    @Override
    public void handleMessage(@NonNull Message msg) {
        super.handleMessage(msg);
        Log.v(TAG_Handler,"Handler的handleMessage来了");
        Log.v("handleMessage所在线程",Thread.currentThread().getName());//这里是主线程，是不是和初始化的实例所在线程有关？

//        Bundle b = msg.getData();
        Object obj = msg.obj;
        Log.v(TAG_Handler,obj.toString());

    }
}
