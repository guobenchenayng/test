package com.example.administrator.mycanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CircleCanvas extends View {
    public CircleCanvas(Context context) {
        super(context);
    }

    public CircleCanvas(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleCanvas(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.STROKE);
        canvas.translate(canvas.getWidth()/2,canvas.getHeight()/2);
        canvas.drawCircle(0,0,200,paint);

        int num = 60;
        for (int i = 0; i < 60 ; i ++){
            if (i%5 == 0){
                canvas.drawLine(0,175,0,200,paint);
                canvas.drawText(String.valueOf(i*4),-4,165,paint);
            }else {
                canvas.drawLine(0,190,0,200,paint);
            }
            canvas.rotate(360/num,0,0);
        }
    }
}
