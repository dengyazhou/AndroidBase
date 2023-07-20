package com.example.androidbase;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;


public class MainActivity2 extends AppCompatActivity {

    private static final String TAGDYZ = "DYZ";
    private final String TAGDYZ1 = "Activity生命周期";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAGDYZ1,"----->>>>>2>>>>>>>onCreate()");
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(TAGDYZ1,"----->>>>>2>>>>>>>onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAGDYZ1,"----->>>>>2>>>>>>>onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAGDYZ1,"----->>>>>2>>>>>>>onResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAGDYZ1,"----->>>>>2>>>>>>>onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAGDYZ1,"----->>>>>2>>>>>>>onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAGDYZ1,"----->>>>>2>>>>>>>onDestroy()");
    }

    public void dyzOnClick1(View view) {
        Log.e(TAGDYZ, "onclick1 xml:");

//        TODO 0、按钮点击
//        startActivity(new Intent(this, ButtonActivity0.class));
//        startActivity(new Intent(this, ButtonActivity1.class));

//        TODO 1、SharedPreferences 本地存储
//        startActivity(new Intent(this, MainActivity3.class));//在data/data/包名/shared_prefs目录下

//        TODO 2、File，文件是否存在
//        Context context = this.getApplicationContext();
//        File file = context.getDatabasePath("abc"); //在data/data/包名/databases目录下abc文件
//        String fileName = file.getName();
//        boolean exists = file.exists();
//        Log.v(TAGDYZ,"fileName: " + fileName);
//        Log.v(TAGDYZ,"exists: " + exists);

        //1、adb -d shell 直接连接真机
        //2、/storage/emulated/0/Download/ta_log_controller 为 步骤1 链接真机后直接ls可看到。
        //3、/storage/emulated/0/Download/ 为系统文件夹，属于系统，每个App都可以使用。
//        boolean exists_ta_log_controller = new File("/storage/emulated/0/Download/ta_log_controller").exists();
//        Log.v(TAGDYZ,"exists_ta_log_controller: " + exists_ta_log_controller);

//        TODO 3、Future
//        startActivity(new Intent(this, FutureActivity.class));

//        TODO 4、获取包名、获取app版本。在build.gradle中可以修改包名、app版本等
//        Context context = this.getApplicationContext();
//        try {
//            final PackageManager manager = context.getPackageManager();
//            Log.e(TAGDYZ, context.getPackageName());
//            PackageInfo packageInfo = manager.getPackageInfo(context.getPackageName(),0);
//            String vName = packageInfo.versionName;
//            long firstInstallTime = packageInfo.firstInstallTime;
//            long lastUpdateTime = packageInfo.lastUpdateTime;
//            Log.e(TAGDYZ, vName);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        TODO 4、Resources，Resources只能读取放在res的values中的内容
//        Context context = this.getApplicationContext();
//        Resources resources = context.getResources();
//        String[] array = resources.getStringArray(resources.getIdentifier("DYZDisPresetProperties", "array", context.getPackageName()));
//        Log.v(TAGDYZ, "array: " + array);
//        for (int i = 0; i < array.length; i++) {
//            Log.v(TAGDYZ, "array: [" + i  + "] "+ array[i]);
//        }
//        String str = resources.getString(resources.getIdentifier("DYZName1", "string", context.getPackageName()));
//        Integer integer = resources.getInteger(resources.getIdentifier("DYZRetentionDays", "integer", context.getPackageName()));
//        Log.v(TAGDYZ,"string: >>" + str + "<<<");
//        Log.v(TAGDYZ, "integer: " + integer);

        // 5、ActivityManager, 获取当前进程名字
//        int pid = android.os.Process.myPid();
//        Context context = this.getApplicationContext();
//        String str = "";
//        try {
//            ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
//            List<ActivityManager.RunningAppProcessInfo> runningAppProcessInfoList = activityManager.getRunningAppProcesses();
//            for (ActivityManager.RunningAppProcessInfo appProcess : runningAppProcessInfoList) {
//                if (appProcess != null) {
//                    if (appProcess.pid == pid) {
//                        str = appProcess.processName;
//                    }
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        Log.v(TAGDYZ,"processName:" + str);

        // 6、ApplicationInfo，获取主进程名字
//        Context context = this.getApplicationContext();
//        ApplicationInfo applicationInfo = context.getApplicationInfo();
//        String str = applicationInfo.processName;
//        Log.v(TAGDYZ,"processName:" + str);

        // 7、Build
//        String os_version = Build.VERSION.RELEASE;
//        String manufacturer = Build.MANUFACTURER;
//        String device_model = Build.MODEL;
//        Log.v(TAGDYZ,"os_version:" + os_version);
//        Log.v(TAGDYZ,"manufacturer:" + manufacturer);
//        Log.v(TAGDYZ,"device_model:" + device_model);
//        int SDK_INT = Build.VERSION.SDK_INT;//操作系统的版本号
////        常用来判断sdk版本如下
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//
//        }

        // 通过Application新的API获取进程名，无需反射，无需IPC，效率最高。
//        String processName = "";
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
//            processName = Application.getProcessName();
//        }
//        Log.v("ABCDEFG", processName);


        // 8、WindowManager，获取屏幕宽、高
//        int screenWidth;
//        int screenHeight;
//        Context context = this.getApplicationContext();
//        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
//        Display display = windowManager.getDefaultDisplay();
//        Point point = new Point();
//        display.getRealSize(point);
//        screenWidth = point.x;
//        screenHeight = point.y;
//
////        Point point1 = new Point();
////        display.getSize(point1);
////        screenWidth = point1.x;
////        screenHeight = point1.y;
//
////        screenWidth = display.getWidth();
////        screenHeight = display.getHeight();
//        Log.v("======>>>>>>>>w:", String.valueOf(screenWidth));
//        Log.v("======>>>>>>>>h:", String.valueOf(screenHeight));

        // 9、Map
//        Map<String,String> map = Map.of("google","google.com","runoob","runoob.com");
//        Log.v("key1",map.get("google"));

        // 9、HashMap
//        HashMap<String,String> hashMap = new HashMap<String,String>();
//        hashMap.put("100","Google");
//        hashMap.put("200","Runoob");
//        Log.v("key1",hashMap.get("100"));
//
//        Map map = new HashMap();
//        map.put("duration", 12);
//        map.put("duration1", "12");
//        Log.v("===>>>","结束");

        // 9、TelephonyManager，获取运营商
//        final Map<String, String> carrierMap = new HashMap<String, String>() {
//            {
//                put("46000", "中国移动");
//                put("46002", "中国移动");
//                put("46007", "中国移动");
//                put("46008", "中国移动");
//
//                put("46001", "中国联通");
//                put("46006", "中国联通");
//                put("46009", "中国联通");
//
//                put("46003", "中国电信");
//                put("46005", "中国电信");
//                put("46011", "中国电信");
//
//                put("46004", "中国卫通");
//
//                put("46020", "中国铁通");
//
//            }
//        };
//        Context context = this.getApplicationContext();
//        TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
//        String simOperator = tm.getSimOperator();
//        String simOperatorName = tm.getSimOperatorName();
//        Log.v(TAGDYZ,"simOperator:" + simOperator);
//        Log.v(TAGDYZ,"simOperatorName:" + simOperatorName);

        // 10、获取安卓id
//        Context context = this.getApplicationContext();
//        String android_id = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
//        Log.v(TAGDYZ,"android_id:" + android_id);

        // 随机数
//        double random = Math.random();
//        Log.v(TAGDYZ,"random:" + random);//例如 0.753129868788929、0.6530360285628827

//        StringBuilder str = new StringBuilder();
//        for (int i = 0; i < 16; i++) {
//            char temp = 0;
//            int key = (int) (Math.random() * 2);
//            switch (key) {
//                case 0:
//                    temp = (char) (Math.random() * 10 + 48); //产生随机数字
//                    break;
//                case 1:
//                    temp = (char) (Math.random() * 6 + 'a'); //产生a-f
//                    break;
//                default:
//                    break;
//            }
//            str.append(temp);
//        }
//        String random = str.toString();
//        Log.v(TAGDYZ,"random:" + random);



//        String uuid = UUID.randomUUID().toString();
//        Log.v(TAGDYZ,"UUID:" + uuid);// 5e699de1-28f1-43ba-ac6c-788467e4f767


        // 11、Locale 获取本地语言、国家
//        Locale locale;
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//            locale = LocaleList.getDefault().get(0);
//        } else  {
//            locale = Locale.getDefault();
//        }
//        String language = locale.getLanguage();
//        String country = locale.getCountry();
//        Log.v(TAGDYZ,"language:" + language);
//        Log.v(TAGDYZ,"country:" + country);

        // 12、类似iOS的runtime
        // 类方法
//        try {
//            Class<?> aClass = Class.forName("com.example.androidbase.runtime.TARunTime");
//            Method method = aClass.getMethod("testClassRunTime", String.class, Integer.class);
//            Object[] params = new Object[2];
//            params[0] = "晋级赛";
//            params[1] = 100;
//            String retStr = (String) method.invoke(aClass, params);//第一个参数 需要传一个对象，由于这是一个静态方法，所以这里传任意值效果是一样的。 aClass、null和"12"传任意值，效果一样
////            String retStr = (String) method.invoke(null, params);
////            String retStr = (String) method.invoke("12", params);
//            Log.v(TAGDYZ,"方法返回值：" + retStr);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        try {
//            Class<?> aClass = Class.forName("com.example.androidbase.runtime.TARunTime");
//            Method method = aClass.getMethod("testClassRunTimeNoParameter");
//            String retStr = (String) method.invoke(null);//第一个参数 需要传一个对象，由于这是一个静态方法，所以这里传任意值效果是一样的。 aClass、null和"12"传任意值，效果一样
//            Log.v(TAGDYZ,"方法返回值：" + retStr);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // 对象方法
//        try {
//            Class<?> aClass = Class.forName("com.example.androidbase.runtime.TARunTime");
//            Constructor<?> constructor = aClass.getDeclaredConstructor();
//            Object obj = constructor.newInstance();
//            Method method = aClass.getMethod("testObjectRunTime", String.class, Integer.class);
//            Object[] params = new Object[2];
//            params[0] = "晋级赛";
//            params[1] = 300;
//            String retStr = (String) method.invoke(obj, params);//第一个参数 需要传一个对象，由于这是一个对象方法，所以这里必须传对象
//            Log.v(TAGDYZ,"方法返回值：" + retStr);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // 12、是否为模拟器
//        ro.kernel.qemu：该值在模拟器中为1，通常在正常手机中没有该属性。
//        ro.product.cpu.abi 属性 : 该属性用于配置 CPU 架构类型 ; 一般的正常的手机都是输出 arm64-v8a , 模拟器输出都是 x86;
        // 真机
        // adb -d shell
        // getprop ro.kernel.qemu
        // getprop ro.product.cpu.abi

        // 模拟器
        // adb -e shell
        // getprop ro.kernel.qemu
        // getprop ro.product.cpu.abi


        // 13、Hander、HandlerThread
        Intent activity = new Intent(this, HandlerActivity.class);
        startActivity(activity);

        // 15、打开app
//        Log.v(TAGDYZ,"来了 打开app");
//        Intent intent = new Intent();
//        intent.setAction("android.intent.action.VIEW");
////        ComponentName name = new ComponentName("cn.thinkingdata.sensordemo", "cn.thinkingdata.sensordemo.MainActivity");
//        intent.putExtra("key1", "value1");
//        intent.setData(Uri.parse("schemeAAA://hostBBB"));// 打开"TATest_Android"app
////        intent.setComponent(name);
////        intent.setClass(MainActivity.this, SecondActivity.class);
//        startActivity(intent);

        // 16、广播
//        https://blog.csdn.net/delete_you/article/details/125495061

        // 17、Choreographer
        // https://www.apiref.com/android-zh/android/view/Choreographer.FrameCallback.html
//        final Choreographer.FrameCallback callback = new Choreographer.FrameCallback() {
//            @Override
//            public void doFrame(long l) {
//                Log.v("Choreographer",String.valueOf(l));
//            }
//        };
//        Choreographer.getInstance().postFrameCallback(callback);//post之后不会立刻执行doFrame，只会"在渲染新的显示框时调用"调用一次


        // 18、StringBuffer
//        StringBuffer sbf = new StringBuffer();
//        String str = sbf.toString();
//        Log.v("===>>>",str);

        // 19、Thread.UncaughtExceptionHandler 捕获异常
//        DyzJavaExceptionHandler dyzJavaExceptionHandler = new DyzJavaExceptionHandler();

        // 20、MemoryInfo 数数 #ram
//        Context context = this.getApplicationContext();
//        ActivityManager activityManager = (ActivityManager) context.getSystemService(ACTIVITY_SERVICE);
//        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
//        activityManager.getMemoryInfo(memoryInfo);
//        long totalSize = memoryInfo.totalMem;
//        long availableSize = memoryInfo.availMem;
//        double total = totalSize / 1024.0 / 1024.0 / 1024.0;
//        double available = availableSize / 1024.0 / 1024.0 / 1024.0;
//        int v = Log.v("===>>>>", available + "/" + total);


        // 21、数数 #deviceType
//        Context context = this.getApplicationContext();
//        int aaa = context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK;
//        Log.v("===>>>","aaa:" + aaa);
//        String deviceType = (context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK)
//                < Configuration.SCREENLAYOUT_SIZE_LARGE ? "Phone" : "Tablet";
//        Log.v("===>>>", deviceType);

        // 22、zone_offset
//        TimeZone timeZone = TimeZone.getDefault();
//        Date date = new Date();
//        Log.v("===>>>>", date.toString());
//        long impl = date.getTime();//时间戳
//        double offset = timeZone.getOffset(impl) / (1000.0 * 60 * 60);
//        Log.v("===>>>>", "impl:" + impl);
//        Log.v("===>>>>", "offset:" + offset);

        // 23、SimpleDateFormat  Date转字符串
//        TimeZone timeZone = TimeZone.getDefault();
////        TimeZone timeZone = TimeZone.getTimeZone("GMT+08:00");
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS",Locale.CHINA);
//        dateFormat.setTimeZone(timeZone);
//        Date date = new Date();
//        String ret = dateFormat.format(date);
//        Log.v("===>>>>","ret:" + ret);

        // 24、TimerTask、Timer
//        TimerTask task = new TimerTask() {
//            @Override
//            public void run() {
//                // 一个新线程
//                Log.v("===>>>>","TimerTask run 执行了");
//                Log.v("===>>>> 当前线程 run", Thread.currentThread().getName());
//            }
//        };
//        Timer timer = new Timer();
//        timer.schedule(task,3000);
//        Log.v("===>>>> 当前线程 000", Thread.currentThread().getName());



//        Log.v("aaaa","bb");



    }

    public void dyzOnClick2(View view) {
        Log.e(TAGDYZ, "onclick2 xml:");
        List<String> list = new ArrayList<>();
        list.add("abc");
        String str = list.get(2);
    }
}
