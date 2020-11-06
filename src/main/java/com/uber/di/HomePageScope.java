package com.uber.di;

@motif.Scope
public interface HomePageScope {
    // Access method
    ProfileController profileController();
    RewardsController rewardsController();
    DrawerController drawerController();


    @motif.Objects
    abstract class Objects {

        RewardsController rewardsController(Profile profile) {
            return new RewardsController(profile);
        }

        ProfileController profileController(Profile profile) {
            return new ProfileController(profile);
        }

        DrawerController drawerController(ProfileController profileController,
                RewardsController rewardsController) {
            return new DrawerController(profileController, rewardsController);
        }
    }
}
