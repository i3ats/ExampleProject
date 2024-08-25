package com.joevno.exampleproject;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * This class is a singleton that provides access to the Guice Injector.
 */
public class SomeInjector {

    private SomeInjector() {
        // Private constructor to prevent instantiation
    }

    private static class LazyHolder {
        static final Injector INSTANCE = Guice.createInjector(new SomeModule());
    }

    static Injector getInjector() {
        return LazyHolder.INSTANCE;
    }

    public static <T> T getInstance(Class<T> tClass) {
        return getInjector().getInstance(tClass);
    }

}
