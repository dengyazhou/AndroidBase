package com.example.androidbase.future;

public class BumThread extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(1000*3);
            System.out.println("包子准备完毕");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
