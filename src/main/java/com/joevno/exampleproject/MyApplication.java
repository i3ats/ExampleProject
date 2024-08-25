package com.joevno.exampleproject;

import com.google.inject.Inject;

public class MyApplication {
    private final MyService myService;

    @Inject
    public MyApplication(MyService myService) {
        this.myService = myService;
    }

    public void run() {
        myService.performService();
    }
}