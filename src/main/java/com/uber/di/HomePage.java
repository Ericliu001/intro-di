package com.uber.di;

public class HomePage {

    private HomeScope scope = new HomeScopeImpl();
    private Profile profile;

    public void login(String name, String email) {
        profile = new Profile(name, email);
    }

    public void signOut() {
        profile = null;
    }

    public void onAttach() {
        if (profile != null) {
            DrawerController drawerController = scope.drawerScope(profile).drawerController();
        }
    }
}
