package com.example.administrator.canvascircle;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
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

        //path
//        Path path = new Path();
//        path.lineTo(300,300);
//        path.lineTo(400,600);
//        path.close();
//        // 画出路径
//        canvas.drawPath(path, paint);

        //画矩形
//        Rect rect = new Rect(100,100,200,200);
//        canvas.drawRect(rect,paint);

//        RectF rectF = new RectF(100,100,800,400);
//        canvas.drawOval(rectF,paint);

//        paint.setStyle(Paint.Style.STROKE);
//        Path path = new Path();
//        path.quadTo(150,170,180,400);
//        canvas.drawPath(path,paint);


//        Matrix matrix = new Matrix();
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.small);
//        canvas.drawBitmap(bitmap,matrix,paint);
    }
}
