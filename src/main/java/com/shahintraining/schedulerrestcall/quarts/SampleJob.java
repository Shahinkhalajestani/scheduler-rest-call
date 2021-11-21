package com.shahintraining.schedulerrestcall.quarts;

import com.shahintraining.schedulerrestcall.services.SampleService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sh.khalajestanii
 * @project scheduler-rest-call
 * @since 11/21/2021
 */
@Component
public class SampleJob implements Job {

    @Autowired
    private SampleService sampleService = new SampleService();

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        sampleService.executeSampleJob();
    }
}
