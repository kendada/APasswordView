package com.koudai.library;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * @auther jsk
 * @date 2018/5/21
 */
public class LinePasswordView extends BasePasswordView{

    public LinePasswordView(Context context) {
        this(context, null);
    }

    public LinePasswordView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LinePasswordView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        setLine("-", Color.parseColor("#3C4549"));
    }

    protected void setLine(String text, int color){
        for (TextView textView : mViewArr){
            textView.setHint(text);
            textView.setHintTextColor(color);
        }
    }

}
