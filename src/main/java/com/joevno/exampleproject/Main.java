package com.joevno.exampleproject;

import com.google.inject.Guice;
import com.joevno.exampleproject.domain.Model;
import lombok.val;

/**
 * Main entry point.
 */
public class Main {
    public static void main(String[] args) {
        val injector = Guice.createInjector(new MyModule());
        val app = injector.getInstance(MyApplication.class);
        app.run();

        // Now imagine that we need to build stuff that is aware of a Model
        val model = loadModelFromFile();
        // By creating a child, we inherit all the Module bindings from the parent
        val modelInjector = injector.createChildInjector(new MyModelModule(model));
        val service = modelInjector.getInstance(MyModelService.class);
        service.performService();
    }

    private static Model loadModelFromFile() {
        return new Model();
    }

}
