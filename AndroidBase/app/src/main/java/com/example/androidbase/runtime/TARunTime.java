package com.example.androidbase.runtime;

import android.util.Log;

public class TARunTime {

    public String testObjectRunTime(String parameter, Integer parameter1) {
        Log.v("ABCD","参数1为：" + parameter + "、参数2为：" + parameter1);
        return "runtime 对象方法 < " + parameter + "、" + parameter1 + " >";
    }

    public static String testClassRunTime(String parameter, Integer parameter1) {
        Log.v("ABCD","参数1为：" + parameter + "、参数2为：" + parameter1);
        return "runtime 类方法 < " + parameter + "、" + parameter1 + " >";
    }

    public static String testClassRunTimeNoParameter() {
        Log.v("ABCD","没有参数");
        return "runtime 类方法 < " + "没有参数" +" >";
    }
}
