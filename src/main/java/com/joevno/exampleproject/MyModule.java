package com.joevno.exampleproject;

import com.google.inject.AbstractModule;

import static com.joevno.exampleproject.MyUtil.loadFirst;

public class MyModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MyStartupService.class);
        bind(MyService.class);
        // This is a demo of how we discover a Service defined in a different Java Module
        bind(SomeService.class).toProvider(loadFirst(SomeService.SomeServiceProvider.class));
    }

}
