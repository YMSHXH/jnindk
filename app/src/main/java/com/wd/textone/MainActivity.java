package com.wd.textone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 步骤1:加载生成的so库文件
    // 注意要跟.so库文件名相同
    static {

        System.loadLibrary("hi_jni");
    }

    private TextView onclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onclick = findViewById(R.id.onclick);

        onclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onclick.setText(fun());
            }
        });


    }

    //jni
    public native String fun();
}
