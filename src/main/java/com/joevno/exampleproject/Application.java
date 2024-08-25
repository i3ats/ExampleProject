package com.joevno.exampleproject;

import com.google.inject.Inject;

public class Application {
    private final StartupService service;

    @Inject
    public Application(StartupService service) {
        this.service = service;
    }

    public void run() {
        service.performService();
    }
}