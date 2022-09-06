package com.example.androidbase;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.androidbase.future.BumThread;
import com.example.androidbase.future.ColdDishThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureActivity extends AppCompatActivity {
    private final static String TAG = "Future";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future);
    }

    public void onClickDYZ(View view) {
        Log.v(TAG, "正常 点击啦");

//        https://blog.csdn.net/bobozai86/article/details/123978048
        
        long start = System.currentTimeMillis();
        //等凉菜 -- 必须等待返回的结果，所以要调用join方法
        Thread t1 = new ColdDishThread();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 等包子 -- 必须等待返回的结果，所以要调用join方法
        Thread t2 = new BumThread();
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("准备完毕时间：" + (end - start));
    }

    public void onClickFutureDYZ(View view) throws ExecutionException, InterruptedException {
        Log.v(TAG, "Future 点击拉");

        long start = System.currentTimeMillis();
        // 等凉菜
        Callable ca1 = new Callable() {
            @Override
            public String call() throws Exception {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "凉菜准备完毕";
            }
        };
        FutureTask<String> ft1 = new FutureTask<String>(ca1);
        new Thread(ft1).start();

        // 等包子
        Callable ca2 = new Callable() {
            @Override
            public String call() throws Exception {
                try {
                    Thread.sleep(1000*3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "包子准备完毕";
            }
        };
        FutureTask<String> ft2 = new FutureTask<String>(ca2);
        new Thread(ft2).start();

        System.out.println(ft1.get());
        System.out.println(ft2.get());

        long end = System.currentTimeMillis();
        System.out.println("准备完毕时间：" + (end-start));
    }
}

