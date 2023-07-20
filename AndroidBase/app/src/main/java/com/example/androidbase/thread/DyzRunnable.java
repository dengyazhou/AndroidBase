package com.example.androidbase.thread;

import android.util.Log;

public class DyzRunnable implements Runnable{
    @Override
    public void run() {

        Log.v("DyzRunnable","新任务DyzRunnable");
        Log.v("DyzRunnable 线程名",Thread.currentThread().getName());
    }
}
