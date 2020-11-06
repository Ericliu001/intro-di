package com.uber.di;

public class HomePageScope {

    private Profile profile;
    private ProfileController profileController;
    private RewardsController rewardController;
    private DrawerController drawerController;

    public DrawerController drawerController() {
        if (drawerController == null) {
            drawerController = new DrawerController(profileController(), rewardsController());
        }
        return drawerController;
    }

    public RewardsController rewardsController() {
        if (rewardController == null) {
            rewardController = new RewardsController(profile());
        }
        return rewardController;
    }

    public Profile profile() {
        if (profile == null) {
            profile = new Profile("eric", "eric.liu@uber.com");
        }
        return profile;
    }

    public ProfileController profileController() {
        if (profileController == null) {
            profileController = new ProfileController(profile());
        }

        return profileController;
    }
}
