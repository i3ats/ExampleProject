package com.joevno.exampleproject;

import jakarta.inject.Provider;

/**
 * This interface defines a Service that can be performed.
 */
public interface SomeService {
    void performService();

    /**
     * This interface defines a Provider for the SomeService interface. It is named so that ServiceLoader can find it.
     */
    interface SomeServiceProvider extends Provider<SomeService> {
    }
}
