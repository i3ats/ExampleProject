package com.joevno.exampleproject;

import com.google.inject.Guice;
import lombok.val;

public class Main {
    public static void main(String[] args) {
        val injector = Guice.createInjector(new MyModule());
        val app = injector.getInstance(MyApplication.class);
        app.run();
    }

}
