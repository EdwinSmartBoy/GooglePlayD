package com.example.edwin.googleplayd.utils;

import android.content.Context;
import android.content.res.Resources;

import com.example.edwin.googleplayd.base.GooglePlayApplication;

/**
 * 创建者      Created by Edwin
 * 创建时间    2016/05/05
 * 描述        与UI界面相关的一些方法
 * <p/>
 * 更新者      Edwin
 * 更新时间    ${TODO}
 * 更新描述    ${TODO}
 */
public class UIUtils {

    /**
     * @return
     * @desc 获取到上下文
     */
    public static Context getContext() {
        return GooglePlayApplication.getContext();
    }

    /**
     * @return
     * @desc 获取Resources资源文件
     */
    public static Resources getResources() {
        return GooglePlayApplication.getContext().getResources();
    }

    /**
     * @param resId
     * @return
     * @desc 获取到xml中的String数据
     */
    public static String getString(int resId) {
        return getResources().getString(resId);
    }

    /**
     * @param resId
     * @return
     * @desc 获取到xml中的String数组数据
     */
    public static String[] getStrings(int resId) {
        return getResources().getStringArray(resId);
    }

    /**
     * @param resId
     * @return
     * @desc 获取xml中的color的数据
     */
    public static int getColor(int resId) {
        return getResources().getColor(resId);
    }

    /**
     * @return
     * @desc 获取程序的包名
     */
    public static String getPackageName() {
        return getContext().getPackageName();
    }
}
