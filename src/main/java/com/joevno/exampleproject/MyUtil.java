package com.joevno.exampleproject;

import org.jetbrains.annotations.Nullable;

import java.util.ServiceLoader;

final class MyUtil {
    private MyUtil() {
        // functions
    }

    @Nullable
    static <T> T loadFirst(Class<T> tClass) {
        return ServiceLoader.load(tClass).findFirst().orElse(null);
    }
}
