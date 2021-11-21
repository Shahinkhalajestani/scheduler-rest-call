package com.shahintraining.schedulerrestcall;

import com.shahintraining.schedulerrestcall.quarts.SampleJob;
import com.shahintraining.schedulerrestcall.quarts.Utilities;
import lombok.SneakyThrows;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

import static org.quartz.SimpleScheduleBuilder.simpleSchedule;

@SpringBootApplication
public class SchedulerRestCallApplication implements CommandLineRunner {

	@Autowired
	public Utilities utilities;

	public static void main(String[] args) {
		SpringApplication.run(SchedulerRestCallApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		utilities.executeJobs();
	}
}
