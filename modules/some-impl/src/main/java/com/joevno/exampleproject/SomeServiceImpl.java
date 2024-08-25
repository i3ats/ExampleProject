package com.joevno.exampleproject;

import com.google.auto.service.AutoService;
import jakarta.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Concrete implementation of the SomeService interface.
 */
public class SomeServiceImpl implements SomeService {

    private static final Logger LOGGER = LogManager.getLogger();

    private final AnotherService anotherService;

    @Inject
    SomeServiceImpl(AnotherService anotherService) {
        this.anotherService = anotherService;
    }

    @Override
    public void performService() {
        LOGGER.info("Performing Service");
        anotherService.performService();
    }

    /**
     * This class is a Guice Provider for the SomeService interface.
     */
    @AutoService(SomeServiceProvider.class)
    public static class SomeServiceProviderImpl implements SomeServiceProvider {

        @Override
        public SomeServiceImpl get() {
            return SomeInjector.getInstance(SomeServiceImpl.class);
        }
    }

}
