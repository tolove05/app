package com.example.growingio;

import android.app.Application;

import com.growingio.android.sdk.collection.Configuration;
import com.growingio.android.sdk.collection.GrowingIO;

/**
 * author WangYing
 * time   2018/03/2018/3/13:下午12:52
 * email  wangying@growingio.com
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        GrowingIO.startWithConfiguration(this, new Configuration()
                .useID()
                .trackAllFragments()
                .setTestMode(true) // 打开测试模式，数据即时发送
                .setDebugMode(true) // 打印发送数据日志，应用上线一定要关闭
                .setChannel("XXX应用商店"));
    }
}
