package com.joevno.exampleproject;

import com.joevno.exampleproject.domain.Model;
import jakarta.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyOtherService {

    private static final Logger LOGGER = LogManager.getLogger();
    private final MyService myService;
    private final Model model;

    @Inject
    MyOtherService(Model model, MyService myService) {
        this.model = model;
        this.myService = myService;
    }

    void performService() {
        LOGGER.info("Performing Service on {}", model);
        myService.performService();
    }

}
