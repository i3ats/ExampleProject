package com.joevno.exampleproject;

import com.google.inject.AbstractModule;
import jakarta.inject.Singleton;

/**
 * This class is a Guice Module that binds the SomeService and AnotherService
 * interfaces to their implementations.
 */
public class SomeModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SomeService.class).toProvider(SomeServiceImpl.SomeServiceProviderImpl.class).in(Singleton.class);
        bind(AnotherService.class).in(Singleton.class);
    }
}
