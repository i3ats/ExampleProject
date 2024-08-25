package com.joevno.exampleproject;

//import javax.inject.Provider;

import com.google.inject.Provider;

public interface SomeService {
    void performService();
    interface SomeServiceProvider extends Provider<SomeService> {}
}
