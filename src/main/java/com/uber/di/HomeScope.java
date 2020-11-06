package com.uber.di;

@motif.Scope
public interface HomeScope {

    DrawerScope drawerScope(Profile profile);
}
