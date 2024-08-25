package com.joevno.exampleproject;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class SomeInjector {
    private static Injector injector;

    private SomeInjector() {
        // Private constructor to prevent instantiation
    }

    public static synchronized Injector getInjector() {
        if (injector == null) {
            injector = Guice.createInjector(new SomeModule());
        }
        return injector;
    }

    public static <T> T getInstance(Class<T> tClass) {
        return getInjector().getInstance(tClass);
    }

}
