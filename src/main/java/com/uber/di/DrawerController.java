package com.uber.di;

class DrawerController {

    private ProfileController profileConroller;

    public DrawerController(
            final ProfileController profileConroller,
            final RewardsController rewardController) {this.profileConroller = profileConroller;}
}
