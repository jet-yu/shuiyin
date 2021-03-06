package com.zone.shuiyin;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by xu.yu
 *
 * @date 2018/4/16.
 * @update
 * @function
 */

public class GifImageView extends ImageView {

    private static Bitmap gifbmp = null;
    private static Paint paint;

    static {
        gifbmp = BitmapFactory.decodeResource(MyApplication.getContext().getResources(), R.mipmap.ic_video_white);

        paint = new Paint();
        paint.setColor(Color.parseColor("#469de6"));
        paint.setStyle(Paint.Style.FILL);
    }

    public GifImageView(Context context) {
        super(context);
    }

    public GifImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GifImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public GifImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        canvas.drawRect(
                canvas.getWidth() - gifbmp.getWidth() - 18,
                canvas.getHeight() - gifbmp.getHeight(),
                canvas.getWidth(),
                canvas.getHeight(),
                paint);

        canvas.drawBitmap(
                gifbmp,
                canvas.getWidth() - gifbmp.getWidth() - 9,
                canvas.getHeight() - gifbmp.getHeight(),
                null);

    }
}
