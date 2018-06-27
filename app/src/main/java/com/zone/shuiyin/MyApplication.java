package com.zone.shuiyin;

import android.app.Application;
import android.content.Context;

/**
 * Created by xu.yu
 *
 * @date 2018/4/16.
 * @update
 * @function
 */

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
