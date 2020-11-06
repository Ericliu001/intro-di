package com.uber.di;

@motif.Scope
public interface RootScope {

    // Child method
    HomePageScope homePageScope(Profile profile);
}
