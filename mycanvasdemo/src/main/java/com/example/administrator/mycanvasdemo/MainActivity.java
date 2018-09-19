package com.example.administrator.mycanvasdemo;

import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout contentRelativeLayout = (RelativeLayout) findViewById(R.id.rl_content);
//        BroadCanvas myCanvasView = new BroadCanvas(this);
//        contentRelativeLayout.addView(myCanvasView);

        final DrawView drawView = new DrawView(this);
        contentRelativeLayout.addView(drawView);

        LineCanvas lineCanvas = new LineCanvas(this);
        contentRelativeLayout.addView(lineCanvas);

//        Animation anim =new RotateAnimation(0f, 180f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//        anim.setFillAfter(true); // 设置保持动画最后的状态
//        anim.setDuration(10000); // 设置动画时间
////        anim.setInterpolator(new AccelerateInterpolator()); // 设置插入器
//        lineCanvas.startAnimation(anim);

    }
}
