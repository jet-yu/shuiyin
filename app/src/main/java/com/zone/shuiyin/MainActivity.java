package com.zone.shuiyin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mSourImage;
    private ImageView mWartermarkImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mSourImage = findViewById(R.id.sour_pic);
        mWartermarkImage = findViewById(R.id.wartermark_pic);
        Bitmap sourBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ico_1440);
        mSourImage.setImageBitmap(sourBitmap);

        Bitmap waterBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.icon);

//        Bitmap watermarkBitmap = ImageUtil.createWaterMaskRightBottom(this, sourBitmap, waterBitmap, 0, 0);
//        Bitmap textBitmap = ImageUtil.drawTextToRightBottom(this, watermarkBitmap, "右下角", 16, Color.RED, 0, 0);

        Bitmap hunheBitmap = ImageUtil.createWaterTextRightBottom(this, sourBitmap, waterBitmap, "@ABCABC", 0, 3, 0, 0);

//        Bitmap watermarkBitmap = ImageUtil.createWaterMaskCenter(sourBitmap, waterBitmap);
//        watermarkBitmap = ImageUtil.createWaterMaskLeftBottom(this, watermarkBitmap, waterBitmap, 0, 0);
//        watermarkBitmap = ImageUtil.createWaterMaskLeftTop(this, watermarkBitmap, waterBitmap, 0, 0);
//        watermarkBitmap = ImageUtil.createWaterMaskRightTop(this, watermarkBitmap, waterBitmap, 0, 0);


//        Bitmap textBitmap = ImageUtil.drawTextToLeftTop(this, watermarkBitmap, "左上角", 16, Color.RED, 0, 0);

//        textBitmap = ImageUtil.drawTextToRightTop(this, textBitmap, "右上角", 16, Color.RED, 0, 0);
//        textBitmap = ImageUtil.drawTextToLeftBottom(this, textBitmap, "左下角", 16, Color.RED, 0, 0);
//        textBitmap = ImageUtil.drawTextToCenter(this, textBitmap, "中间", 16, Color.RED);

        mWartermarkImage.setImageBitmap(hunheBitmap);
    }
}


