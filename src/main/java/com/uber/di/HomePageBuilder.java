package com.uber.di;

public class HomePageBuilder {

    private volatile ProfileController profileController;
    private RewardsController rewardsController;
    private DrawerController drawerController;

    public ProfileController profileController(Profile profile) {
        if (profileController == null) {
            profileController = new ProfileController(profile);
        }
        return profileController;
    }

    public RewardsController rewardsController(Profile profile) {
        if (rewardsController == null) {
            rewardsController = new RewardsController(profile);
        }
        return rewardsController;
    }

    public DrawerController drawerController(Profile profile) {


        if (drawerController == null) {
            drawerController = new DrawerController(profileController(profile),
                    rewardsController);
        }

        return drawerController;
    }
}
