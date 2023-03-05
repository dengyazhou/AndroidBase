package com.example.androidbase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ButtonActivity1 extends AppCompatActivity implements View.OnClickListener {

    private static final String TAGDYZBTN = "DYZ======btn";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1);

//        TODO 按钮点击回调 3
        Button btn1 = findViewById(R.id.btndyz3);
        btn1.setOnClickListener(this);

        Button btn2 = findViewById(R.id.btndyz4);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btndyz3:
                Log.v(TAGDYZBTN,"View.OnClickListener id 为 btndyz3 点击");
                break;
            case R.id.btndyz4:
                Log.v(TAGDYZBTN,"View.OnClickListener id 为 btndyz4 点击");
                break;
            default:
                break;
        }
    }
}