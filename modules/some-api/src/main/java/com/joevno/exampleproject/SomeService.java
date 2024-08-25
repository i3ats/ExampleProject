package com.joevno.exampleproject;

import jakarta.inject.Provider;

public interface SomeService {
    void performService();
    interface SomeServiceProvider extends Provider<SomeService> {}
}
