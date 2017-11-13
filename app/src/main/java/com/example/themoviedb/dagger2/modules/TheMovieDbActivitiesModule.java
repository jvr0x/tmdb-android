package com.example.themoviedb.dagger2.modules;

import dagger.Module;
import dagger.android.AndroidInjectionModule;

@Module(includes = {
    AndroidInjectionModule.class,
    MovieListFeatureModule.class
})
public abstract class TheMovieDbActivitiesModule {
}