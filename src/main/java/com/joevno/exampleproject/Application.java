package com.joevno.exampleproject;

import jakarta.inject.Inject;

/**
 * This class is the entry point for the application.
 */
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