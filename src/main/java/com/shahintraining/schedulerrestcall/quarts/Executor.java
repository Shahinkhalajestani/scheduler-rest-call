package com.shahintraining.schedulerrestcall.quarts;

import org.springframework.stereotype.Component;

/**
 * @author sh.khalajestanii
 * @project scheduler-rest-call
 * @since 11/21/2021
 */
@Component
public class Executor {
    public static SimpleServiceExecutor simpleServiceExecutor;

    public Executor(SimpleServiceExecutor simpleServiceExecutor) {
        Executor.simpleServiceExecutor = simpleServiceExecutor;
    }

    public static void execute(){
        simpleServiceExecutor.execute();
    }
}
