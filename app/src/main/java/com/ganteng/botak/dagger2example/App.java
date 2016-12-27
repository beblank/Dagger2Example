package com.ganteng.botak.dagger2example;

import android.app.Application;

/**
 * Created by adityahadiwijaya on 12/27/16.
 */

public class App extends Application {

    private  ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }
}
