package com.joevno.exampleproject;

import com.google.inject.AbstractModule;
import com.joevno.exampleproject.domain.Model;

public class MyModelModule extends AbstractModule {

    private final Model model;

    public MyModelModule(Model model) {
        this.model = model;
    }

    @Override
    protected void configure() {
        bind(Model.class).toInstance(model);
        bind(MyOtherService.class);
    }

}
