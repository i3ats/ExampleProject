package com.joevno.exampleproject;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

import static com.joevno.exampleproject.Util.loadFirst;

/**
 * This class is a Guice Module that binds the StartupService and MyService.
 */
public class BaseModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(StartupService.class).in(Singleton.class);
        bind(MyService.class).in(Singleton.class);
        // Bind a Service defined in a different Java Module. Note that we still need to specify it is a Singleton here.
        bind(SomeService.class)
                .toProvider(loadFirst(SomeService.SomeServiceProvider.class))
                .in(Singleton.class);
    }

}
