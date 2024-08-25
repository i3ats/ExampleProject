package com.joevno.exampleproject;

import jakarta.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class MyService {
    private static final Logger LOGGER = LogManager.getLogger();
    private final SomeService someService;

    @Inject
    MyService(SomeService someService) {
        this.someService = someService;
    }

    void performService() {
        LOGGER.info("Performing Service");
        someService.performService();
    }
}
