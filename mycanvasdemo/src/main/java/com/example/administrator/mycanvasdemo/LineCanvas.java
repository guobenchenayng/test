package com.example.administrator.mycanvasdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class LineCanvas extends View {
    public LineCanvas(Context context) {
        super(context);
    }

    public LineCanvas(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LineCanvas(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
       Paint paint = new Paint();
       paint.setColor(Color.RED);
       paint.setStrokeWidth(1);
       canvas.translate(canvas.getWidth()/2,canvas.getHeight()/2);
       canvas.drawLine(0,0,0,130,paint);
}
}
