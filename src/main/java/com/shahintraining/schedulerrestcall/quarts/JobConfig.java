package com.shahintraining.schedulerrestcall.quarts;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.quartz.SimpleScheduleBuilder.simpleSchedule;

/**
 * @author sh.khalajestanii
 * @project scheduler-rest-call
 * @since 11/21/2021
 */
@Configuration
public class JobConfig {

    @Bean
    public JobDetail jobDetail() {
        return JobBuilder.newJob(SampleJob.class)
                .withIdentity("Qrtz_Job_Detail")
                .withDescription("Invoke Sample Job Service")
                .build();
    }


    @Bean
    public Trigger trigger(JobDetail jobDetail) {

        return TriggerBuilder.newTrigger().forJob(jobDetail)
                .startNow()
                .withIdentity("Qrtz_Trigger")
                .withDescription("Simple trigger")
                .withSchedule(CronScheduleBuilder.cronSchedule("0 0/1 * 1/1 * ? *"))
                .build();
    }
}
