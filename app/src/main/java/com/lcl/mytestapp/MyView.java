package com.lcl.mytestapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author laichunling
 * @Package com.lcl.mytestapp
 * @Description: ${TODO}(用一句话描述该文件做什么)
 * @date 2015/11/11 14:49
 */
public class MyView extends View {
    private Paint paint;
    private int degress=0;

    public MyView(Context context) {
        super(context);
        initPaint();
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint(){
        paint=new Paint();
        paint.setColor(Color.RED);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.translate(200,200);
        canvas.rotate(degress,50,50);
        canvas.drawRect(0, 0, 100, 100,paint);
        degress++;
        canvas.restore();
        invalidate();
    }
}
