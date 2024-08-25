package com.joevno.exampleproject;

import com.google.inject.Guice;
import lombok.val;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit tests.
 * @see BaseModule
 */
class BaseModuleTest {

    @Test
    void testWiring() {
        val injector = Guice.createInjector(new BaseModule());
        val app = injector.getInstance(Application.class);
        Assertions.assertInstanceOf(Application.class, app);
    }
}
