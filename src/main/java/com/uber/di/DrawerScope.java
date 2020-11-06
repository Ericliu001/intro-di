package com.uber.di;

import javax.inject.Named;

@motif.Scope
public interface DrawerScope {

    // Access method.
    DrawerController drawerController();

    @motif.Objects
    abstract class Objects {

        abstract ProfileController profileController();

        abstract RewardsController rewardsController();

        abstract DrawerController drawerController();
    }
}
