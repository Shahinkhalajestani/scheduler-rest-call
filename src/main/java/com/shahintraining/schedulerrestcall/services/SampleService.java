package com.shahintraining.schedulerrestcall.services;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author sh.khalajestanii
 * @project scheduler-rest-call
 * @since 11/21/2021
 */
@Service
@Log4j2
public class SampleService {

    public void executeSampleJob(){
        log.info("executing simple job ");
        System.out.println("Executing Scheduled Job in "+new Date(System.currentTimeMillis()));
    }

}
