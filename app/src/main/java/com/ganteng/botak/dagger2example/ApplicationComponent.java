package com.ganteng.botak.dagger2example;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by adityahadiwijaya on 12/27/16.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject (MainActivity target);

}
