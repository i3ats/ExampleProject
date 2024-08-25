package com.joevno.exampleproject;

import com.joevno.exampleproject.domain.Model;
import jakarta.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This Service depends on a Model.
 * So it needs to be built after its Model has been created if we are going to use constructor-based DI.
 */
public class MyModelService {

    private static final Logger LOGGER = LogManager.getLogger();
    private final MyService myService;
    private final Model model;

    @Inject
    MyModelService(Model model, MyService myService) {
        this.model = model;
        this.myService = myService;
    }

    void performService() {
        LOGGER.info("Performing Service on {}", model);
        myService.performService();
    }

}
