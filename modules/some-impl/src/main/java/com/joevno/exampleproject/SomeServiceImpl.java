package com.joevno.exampleproject;

import com.google.auto.service.AutoService;
import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Concrete implementation of the SomeService interface.
 */
@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class SomeServiceImpl implements SomeService {

    private static final Logger LOGGER = LogManager.getLogger();

    private final AnotherService anotherService;
    
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
