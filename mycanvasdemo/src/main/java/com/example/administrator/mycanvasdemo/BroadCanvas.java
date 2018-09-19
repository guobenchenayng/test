package com.example.administrator.mycanvasdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class BroadCanvas extends View {
    public BroadCanvas(Context context) {
        super(context);
    }

    public BroadCanvas(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BroadCanvas(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setColor(int color){}

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.STROKE);
        canvas.translate(canvas.getWidth()/2,canvas.getHeight()/2);
        canvas.drawCircle(0,0,200,paint);

        Paint textPaint = new Paint();
        textPaint.setColor(Color.RED);
        textPaint.setTextSize(24);
        int num = 60;
        for (int i = 0 ; i < num ; i++){
            if (i%5 == 0){
                canvas.drawLine(0,170,0,200,paint);
                canvas.drawText(String.valueOf(i*4),-5,160,textPaint);
            }else {
                canvas.drawLine(0,185,0,200,paint);
            }
            canvas.rotate(360/num,0,0);
        }
    }

    @Override
    public void invalidate() {
        super.invalidate();
    }
}
