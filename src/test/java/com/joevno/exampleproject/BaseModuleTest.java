package com.joevno.exampleproject;

import com.google.inject.Guice;
import com.google.inject.Key;
import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests.
 *
 * @see BaseModule
 */
class BaseModuleTest {

    @Test
    void testWiring() {
        val injector = Guice.createInjector(new BaseModule());
        val app = injector.getInstance(Application.class);
        assertInstanceOf(Application.class, app);
    }

    @Test
    void testSomeServiceIsSingleton() {
        val injector = Guice.createInjector(new BaseModule());
        val service1 = injector.getInstance(SomeService.class);
        val service2 = injector.getInstance(SomeService.class);
        assertSame(service1, service2);
    }

    @Test
    void testExistingBinding() {
        val injector = Guice.createInjector(new BaseModule());
        val binding = injector.getExistingBinding(Key.get(MyService.class));
        assertNotNull(binding);
    }

    /**
     * This test demonstrates that there is no existing binding for a type that is not bound in the module.
     * <p>
     * Note that we can use this approach to test that a binding is not present in the module and therefore
     * fallback to a legacy mechanism
     */
    @Test
    void testNoExistingBinding() {
        val injector = Guice.createInjector(new BaseModule());
        val binding = injector.getExistingBinding(Key.get(Double.class));
        assertNull(binding);
    }
}
