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
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutureActivity extends AppCompatActivity {
    private final static String TAG = "Future";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future);
    }

    public void onClickThread(View view) {
        Log.v(TAG, "Thread");
        String nameold = Thread.currentThread().getName();
        new Thread(new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println("新线程开始执行>>" + name);
                try {
                    Thread.sleep(3000);
                    System.out.println("新线程执行完毕>>" + name);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        System.out.println("开始Thread>>" + nameold);
//        try {
//            Thread.sleep(4000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        System.out.println("原来线程执行结束>>" + nameold);
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
                String name = Thread.currentThread().getName();
                System.out.println("凉菜 新线程开始执行>>" + name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("凉菜 新线程执行完毕>>" + name);
                return "凉菜准备完毕";
            }
        };
        FutureTask<String> ft1 = new FutureTask<String>(ca1);
        new Thread(ft1).start();

        // 等包子
        Callable ca2 = new Callable() {
            @Override
            public String call() throws Exception {
                String name = Thread.currentThread().getName();
                System.out.println("包子 新线程开始执行>>" + name);
                try {
                    Thread.sleep(1000*3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("包子 新线程执行完毕>>" + name);
                return "包子准备完毕";
            }
        };
        FutureTask<String> ft2 = new FutureTask<String>(ca2);
        new Thread(ft2).start();

        //1、调用get返回call方法的返回值
        //2、不管有没有调用get，call方法都会执行，只是必须 等待call方法执行完毕 才能拿到返回值
        //3、如果call方法没有执行完毕，必须等待，执行完毕后才能执行get之后的代码
//        ft1.get();
//        System.out.println("准备完毕时间:AAA");
//        ft2.get();
//        System.out.println(ft1.get());
//        System.out.println(ft2.get());

        long end = System.currentTimeMillis();
        System.out.println("准备完毕时间：" + (end-start));
    }

    public void onClickFutureExecutor(View view) {
        Log.v(TAG, "Future1 点击拉");

        Executor executor = Executors.newSingleThreadExecutor();

        Callable ca1 = new Callable() {
            @Override
            public String call() throws Exception {
                String name = Thread.currentThread().getName();
                System.out.println("凉菜 新线程开始执行>>" + name);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("凉菜 新线程执行完毕>>" + name);
                return "凉菜准备完毕1";
            }
        };
        FutureTask<String> ft1 = new FutureTask<String>(ca1);
//        new Thread(ft1).start();
        Log.v(TAG, "execute 前");
        executor.execute(ft1);
        Log.v(TAG, "execute 后");

        try {
            Log.v(TAG, "get 前");
            System.out.println(ft1.get());
            Log.v(TAG, "get 后");
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

