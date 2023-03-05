package com.example.androidbase.thread;

import android.util.Log;

public class DyzThread implements Runnable{
    @Override
    public void run() {
        Log.v("DyzThread","新线程DyzThread");
    }
}
