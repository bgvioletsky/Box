package com.github.tvbox.bgcode.bean;

import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;

import com.github.tvbox.bgcode.base.App;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
 * @Author: bgcode
 * @Date: 2025-03-09 16:00:22
 * @LastEditTime: 2025-03-09 16:05:13
 * @LastEditors: bgcode
 * @Description: 描述
 * @FilePath: /Box/app/src/main/java/com/github/tvbox/bgcode/bean/AppInfo.java
 * 本项目采用GPL 许可证，欢迎任何人使用、修改和分发。
 */


public class AppInfo {

    public String name;
    public Drawable icon;
    public String pack;

    public AppInfo(String name, String pack, Drawable icon) {
        this.name = name;
        this.pack = pack;
        this.icon = icon;
    }

    public static AppInfo get(ApplicationInfo info) {
        Drawable icon = info.loadIcon(App.getInstance().getPackageManager());
        String name = info.loadLabel(App.getInstance().getPackageManager()).toString();
        String pack = info.packageName;
        return new AppInfo(name, pack, icon);
    }

    public String getName() {
        return name;
    }

    public String getPack() {
        return pack;
    }

    public Drawable getIcon() {
        return icon;
    }

    public static class Sorter implements Comparator<AppInfo> {

        public static void sort(List<AppInfo> items) {
            Collections.sort(items, new Sorter());
        }

        @Override
        public int compare(AppInfo info1, AppInfo info12) {
            return info1.getName().compareToIgnoreCase(info12.getName());
        }
    }
}