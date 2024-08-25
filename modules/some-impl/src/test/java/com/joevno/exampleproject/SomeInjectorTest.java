package com.joevno.exampleproject;

import lombok.val;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit tests.
 * @see SomeInjector
 */
class SomeInjectorTest {

    @Test
    void testWiring() {
        val service = SomeInjector.getInjector().getInstance(SomeService.class);
        Assertions.assertInstanceOf(SomeService.class, service);
    }

}
