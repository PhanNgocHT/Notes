package com.example.admin.notes.view;

import android.app.Application;

/**
 * Created by admin on 3/11/2018.
 */

public class App extends Application{
    private static App instance;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
    }
}
