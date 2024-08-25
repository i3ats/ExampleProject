package com.joevno.exampleproject;

import com.google.inject.AbstractModule;
import org.jetbrains.annotations.Nullable;

import java.util.ServiceLoader;

public class MyModule extends AbstractModule {
    @Override
    protected void configure() {
//        bind(OneService.class).toProvider(loadFirst(OneService.OneServiceProvider.class));
        bind(MyService.class);
    }

//    @Nullable
//    private static <T> T loadFirst(Class<T> tClass) {
//        return ServiceLoader.load(tClass).findFirst().orElse(null);
//    }
}
