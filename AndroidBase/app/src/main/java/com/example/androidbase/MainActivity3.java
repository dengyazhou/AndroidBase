package com.example.androidbase;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    private final String TAGDYZ1 = "Activity生命周期";
    private final static String PREFERENCES_NAME = "Testabc";

    private SharedPreferences sp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAGDYZ1,"----->>>>>3>>>>>>>onCreate()");
        setContentView(R.layout.activity_main3);

        Context context = this.getApplicationContext();
        sp = context.getSharedPreferences(PREFERENCES_NAME,Context.MODE_PRIVATE);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(TAGDYZ1,"----->>>>>3>>>>>>>onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAGDYZ1,"----->>>>>3>>>>>>>onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAGDYZ1,"----->>>>>3>>>>>>>onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAGDYZ1,"----->>>>>3>>>>>>>onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAGDYZ1,"----->>>>>3>>>>>>>onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAGDYZ1,"----->>>>>3>>>>>>>onDestroy()");
    }

    public void onClickDYZ1(View view) {
        Log.v("ABC","第三个界面第一个按钮点击 存储");

//        https://www.jianshu.com/p/e6d8f4913f12
        // 其中的原理是通过Android系统生成一个xml文件保到：/data/data/包名/shared_prefs目录下，类似键值对的方式来存储数据。
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("uid2", "hehehe2");
        editor.commit();
    }

    public void onClickDYZ2(View view) {
        Log.v("ABC", "第三个界面第二个按钮点击 取值");

        String str = sp.getString("uid2","12345");//如果取不到值，则返回默认值12345
        Log.v("HHHH", str);
    }
}
