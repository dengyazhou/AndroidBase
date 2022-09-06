package com.example.androidbase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ApplicationDYZ extends Application {
    private final String TAGDYZ1 = "Activity";

    @Override
    public void onCreate() {
        super.onCreate();
        // 在程序创建时创建。
        Log.w(TAGDYZ1,"----->>>>>Application>>>>>>>onCreate()");

        Context context = this.getApplicationContext();
        Context context1 = context.getApplicationContext();
        Context context2 = context1.getApplicationContext();
        Log.v("context", "getApplicationContext");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        // 当终止程序时调用 但是不能保证一定调用
        Log.w(TAGDYZ1,"----->>>>>Application>>>>>>>onTerminate()");
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // 在配置被改变时触发
        Log.w(TAGDYZ1,"----->>>>>Application>>>>>>>onConfigurationChanged()");
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        // 内存不够时触发。
        Log.w(TAGDYZ1,"----->>>>>Application>>>>>>>onLowMemory()");
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        // 在内存清理时触发
        Log.w(TAGDYZ1,"----->>>>>Application>>>>>>>onTrimMemory()");
    }


    @Override
    public void registerComponentCallbacks(ComponentCallbacks callback) {
        super.registerComponentCallbacks(callback);
        Log.w(TAGDYZ1,"----->>>>>Application>>>>>>>registerComponentCallbacks()");
    }

    @Override
    public void unregisterComponentCallbacks(ComponentCallbacks callback) {
        super.unregisterComponentCallbacks(callback);
        Log.w(TAGDYZ1,"----->>>>>Application>>>>>>>unregisterComponentCallbacks()");
    }

    @Override
    public void registerActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) {
        super.registerActivityLifecycleCallbacks(callback);
        Log.w(TAGDYZ1,"----->>>>>Application>>>>>>>registerActivityLifecycleCallbacks()");
    }

    @Override
    public void unregisterActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) {
        super.unregisterActivityLifecycleCallbacks(callback);
        Log.w(TAGDYZ1,"----->>>>>Application>>>>>>>unregisterActivityLifecycleCallbacks()");
    }

    @Override
    public void registerOnProvideAssistDataListener(OnProvideAssistDataListener callback) {
        super.registerOnProvideAssistDataListener(callback);
        Log.w(TAGDYZ1,"----->>>>>Application>>>>>>>registerOnProvideAssistDataListener()");
    }

    @Override
    public void unregisterOnProvideAssistDataListener(OnProvideAssistDataListener callback) {
        super.unregisterOnProvideAssistDataListener(callback);
        Log.w(TAGDYZ1,"----->>>>>Application>>>>>>>unregisterOnProvideAssistDataListener()");
    }
}
