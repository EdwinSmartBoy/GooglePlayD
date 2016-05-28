package com.example.edwin.googleplayd.base;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Process;

/**
 * 创建者      Created by Edwin
 * 创建时间    2016/05/05
 * 描述        一个程序的真正入口,进行全局变量的配置,全局可以访问
 * <p/>
 * 更新者      Edwin
 * 更新时间    ${TODO}
 * 更新描述    ${TODO}
 */
public class GooglePlayApplication extends Application {

    private static Context mContext;
    private static int mMainThreadId;
    private static Handler mMainHandler;

    @Override
    public void onCreate() {    //程序的入口方法
        super.onCreate();

        //获取整个应用的上下文
        mContext = getApplicationContext();

        //获取主线程的id
        mMainThreadId = Process.myTid();

        //获取主线程的一个Handler
        mMainHandler = new Handler();
    }

    /**
     * @return
     * @desc 返回全局的上下文
     */
    public static Context getContext() {
        return mContext;
    }

    /**
     * @return
     * @desc 返回当前主线程的id
     */
    public static int getMainThreadId() {
        return mMainThreadId;
    }

    /**
     * 返回当前主线程的Hanlder对象
     *
     * @return
     */
    public static Handler getMainHandler() {
        return mMainHandler;
    }
}
