package com.joevno.exampleproject;

import com.google.inject.AbstractModule;

import static com.joevno.exampleproject.Util.loadFirst;

/**
 * This class is a Guice Module that binds the StartupService and MyService
 * interfaces to their implementations.
 */
public class BaseModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(StartupService.class);
        bind(MyService.class);
        // Bind a Service defined in a different Java Module
        bind(SomeService.class).toProvider(loadFirst(SomeService.SomeServiceProvider.class));
    }

}
