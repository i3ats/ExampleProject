package com.joevno.exampleproject;

import jakarta.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Imagine this does things like connect to a DB and get the app started.
 */
public class StartupService {
    private static final Logger LOGGER = LogManager.getLogger();

    @Inject
    StartupService() {
    }

    void performService() {
        LOGGER.info("Starting up!");
    }

}
