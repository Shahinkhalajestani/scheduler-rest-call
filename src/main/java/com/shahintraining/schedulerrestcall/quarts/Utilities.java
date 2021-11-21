package com.shahintraining.schedulerrestcall.quarts;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sh.khalajestanii
 * @project scheduler-rest-call
 * @since 11/21/2021
 */
@Component
public class Utilities {

    @Autowired
    private Trigger trigger;
    @Autowired
    private JobDetail jobDetail;

    public void executeJobs() throws SchedulerException {
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(jobDetail,trigger);
    }

}
