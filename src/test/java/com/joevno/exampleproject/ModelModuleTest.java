package com.joevno.exampleproject;

import com.google.inject.Guice;
import com.joevno.exampleproject.domain.Model;
import lombok.val;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit tests.
 * @see ModelModule
 */
class ModelModuleTest {

    @Test
    void testWiring() {
        val injector = Guice.createInjector(new BaseModule(), new ModelModule(new Model()));
        val model = injector.getInstance(Model.class);
        Assertions.assertInstanceOf(Model.class, model);
    }
}
