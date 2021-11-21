package com.shahintraining.schedulerrestcall.quarts;

import com.shahintraining.schedulerrestcall.services.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author sh.khalajestanii
 * @project scheduler-rest-call
 * @since 11/21/2021
 */
@RequiredArgsConstructor
@Component
public class SimpleServiceExecutor {

    private final SampleService sampleService;

    public void execute(){
        sampleService.executeSampleJob();
    }
}
