package com.joevno.exampleproject;

import jakarta.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class MyService {
    private static final Logger LOGGER = LogManager.getLogger();
//    private final OneService oneService;

    @Inject
    MyService(/*OneService oneService*/) {
//        this.oneService = oneService;
    }

    void performService() {
//        oneService.performService();
        LOGGER.info("Performing service");
    }
}
