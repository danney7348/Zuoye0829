package com.bwie.test;

import android.app.Application;

import org.xutils.x;

/**
 * 作者： 张少丹
 * 时间：  2017/8/29.
 * 邮箱：1455456581@qq.com
 * 类的用途：
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initView();
        initData();

    }

    private void initData() {


    }

    private void initView() {
        x.Ext.init(this);
        x.Ext.setDebug(false);
    }
}
