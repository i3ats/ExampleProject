package com.joevno.exampleproject;

import org.jetbrains.annotations.Nullable;

import java.util.ServiceLoader;

/**
 * This class is a utility class.
 */
final class Util {
    private Util() {
        // functions
    }

    @Nullable
    static <T> T loadFirst(Class<T> tClass) {
        return ServiceLoader.load(tClass).findFirst().orElse(null);
    }
}
