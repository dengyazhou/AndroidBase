package com.example.androidbase.crash;

import android.util.Log;

import androidx.annotation.NonNull;

public class DyzJavaExceptionHandler implements Thread.UncaughtExceptionHandler { //DyzJavaExceptionHandler类实现Thread.UncaughtExceptionHandler接口，

    private final Thread.UncaughtExceptionHandler mDefaultExceptionHandler;//作用继续把异常往下抛

    public DyzJavaExceptionHandler() {
        Log.v("===>>>Crash","构造函数");
        mDefaultExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    // 捕获到异常之后，会来到这里
    @Override
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable throwable) {
        Log.v("===>>>Crash","崩溃来了");

        mDefaultExceptionHandler.uncaughtException(thread,throwable);// 继续把异常往下抛

    }
}
