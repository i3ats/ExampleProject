package com.joevno.exampleproject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AnotherService {
    private static final Logger LOGGER = LogManager.getLogger();
    void performService() {LOGGER.info("Performing Service");}
}
