package com.joevno.exampleproject;

import com.google.inject.Guice;
import com.joevno.exampleproject.domain.Model;
import lombok.val;

/**
 * Main entry point.
 */
public class Main {
    public static void main(String[] args) {
        // We start by creating a base injector that binds the Application class
        // It also binds the StartupService class, which is what we wanted to have run
        val baseInjector = Guice.createInjector(new BaseModule());
        val app = baseInjector.getInstance(Application.class);
        app.run();

        // Now imagine that we need to build stuff that is aware of a Model
        val model = loadModelFromFile();

        // By creating a child, we inherit all the Module bindings from the parent,
        // and we have the opportunity to inject our runtime dependency (Model)
        val modelInjector = baseInjector.createChildInjector(new ModelModule(model));
        val service = modelInjector.getInstance(ModelService.class);
        service.performService();
    }

    private static Model loadModelFromFile() {
        return new Model();
    }

}
