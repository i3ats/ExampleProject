package com.joevno.exampleproject;

import com.google.inject.Inject;

public class MyApplication {
    private final MyStartupService service;

    @Inject
    public MyApplication(MyStartupService service) {
        this.service = service;
    }

    public void run() {
        service.performService();
    }
}