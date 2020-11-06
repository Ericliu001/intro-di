package com.uber.di;

public class HomePage {

    private Profile profile;
    private RootScope rootScope;

    public void login(String name, String email) {
        profile = new Profile(name, email);
    }

    public void signOut() {
        throw new UnsupportedOperationException();
    }

    public void onAttach() {
        rootScope = new RootScopeImpl();
    }

    public void openDrawer() {
        DrawerController drawerController = rootScope.homePageScope(profile).drawerController();
    }
}
