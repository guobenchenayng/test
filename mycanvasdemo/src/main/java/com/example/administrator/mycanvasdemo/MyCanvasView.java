package com.example.administrator.mycanvasdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class MyCanvasView extends View {
    private Canvas mCanvas;
    private Paint linePaint;

    public MyCanvasView(Context context) {
        super(context);
    }

    public MyCanvasView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyCanvasView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);// 设置红色
        paint.setAntiAlias(true);//设置画笔的锯齿效果。 true是去除
        paint.setStyle(Paint.Style.STROKE);
        canvas.translate(canvas.getWidth()/2, canvas.getHeight()/2); //将位置移动画纸的坐标点:居中,150
        canvas.drawCircle(0, 0, 100, paint); //画圆圈
        //使用path绘制路径文字
        canvas.save();//save只是save了当前这个canvas的状态，和已经画出来的图形无关
//        canvas.translate(-75, -75);//----------------------
//        Path path = new Path();//Path主要用于绘制复杂的图形轮廓，比如折线，圆弧以及各种复杂图案

        //addArc绘制圆弧
//        path.addArc(new RectF(150,150,300,300), -180, 180);
//        Paint citePaint = new Paint(paint);
//        citePaint.setTextSize(14);
//        citePaint.setStrokeWidth(1);//字体宽度
//        canvas.drawTextOnPath("This is canvas", path, 28, 0, citePaint);
//        canvas.restore();//restore就是取出最近一次save的canvas的状态，仍然不影响图形。
        Paint tmpPaint = new Paint(paint); //小刻度画笔对象
        tmpPaint.setStrokeWidth(1);
        float y=100;
        int count = 60; //总刻度数
        for(int i=0 ; i <count ; i++){
            if(i%5 == 0){
                canvas.drawLine(0f, y, 0, y+12f, paint);
                canvas.drawText(String.valueOf(i*4), -4f, y+25f, tmpPaint);
            }else{
                canvas.drawLine(0f, y, 0f, y +5f, tmpPaint);
            }
            canvas.rotate(360/count,0f,0f); //旋转画纸
        }
        //绘制指针
        tmpPaint.setColor(Color.RED);
        tmpPaint.setStrokeWidth(4);
        canvas.drawCircle(0, 0, 7, tmpPaint);
        tmpPaint.setStyle(Paint.Style.FILL);
        tmpPaint.setColor(Color.YELLOW);
        canvas.drawCircle(0, 0, 5, tmpPaint);
        linePaint = new Paint();
        linePaint.setColor(Color.RED);

//        canvas.drawLine(0, 0, 0, 65, paint);

        invalidate();
    }

    @Override
    public void invalidate() {
        super.invalidate();
    }
}
