package com.shahintraining.schedulerrestcall.quarts;

import lombok.RequiredArgsConstructor;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

import static org.quartz.SimpleScheduleBuilder.simpleSchedule;

/**
 * @author sh.khalajestanii
 * @project scheduler-rest-call
 * @since 11/21/2021
 */
@Component
@RequiredArgsConstructor
public class Utilities {

//    @Autowired
//    private Trigger trigger;
//    @Autowired
//    private JobDetail jobDetail;


    private final Trigger trigger;
    private final JobDetail jobDetail;

    public void executeJobs() throws SchedulerException {
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(jobDetail,trigger);
    }

}
