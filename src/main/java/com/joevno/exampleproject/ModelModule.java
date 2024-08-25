package com.joevno.exampleproject;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.joevno.exampleproject.domain.Model;

/**
 * This Module is aware of a Model.
 */
public class ModelModule extends AbstractModule {

    private final Model model;

    public ModelModule(Model model) {
        this.model = model;
    }

    @Override
    protected void configure() {
        bind(Model.class).toInstance(model);
        bind(ModelService.class).in(Singleton.class);
    }

}
