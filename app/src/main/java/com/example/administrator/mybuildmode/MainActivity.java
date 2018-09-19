package com.example.administrator.mybuildmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //客户端类
        Builder builder = new FatBuild()
                .buildBody()
                .buildFooter()
                .buildHands()
                .buildHeader();
        builder.result();
    }
}
