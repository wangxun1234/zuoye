package com.example.zuoye.apps;

import android.app.Application;

public class MyApp extends Application {

    public static Application app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }
}
