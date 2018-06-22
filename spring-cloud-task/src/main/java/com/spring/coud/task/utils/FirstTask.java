package com.spring.coud.task.utils;

import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.task.listener.annotation.AfterTask;
import org.springframework.cloud.task.listener.annotation.BeforeTask;
import org.springframework.cloud.task.listener.annotation.FailedTask;
import org.springframework.cloud.task.repository.TaskExecution;

public class FirstTask implements CommandLineRunner {

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("Message : Hello");
	}

	@AfterTask
	public void onTaskEnd(TaskExecution arg0) {
		System.out.println("Task Completed Sucessfully");
	}

	@FailedTask
	public void onTaskFailed(TaskExecution arg0, Throwable arg1) {
		System.out.println("Task Failed");
	}

	@BeforeTask
	public void onTaskStartup(TaskExecution arg0) {
		System.out.println("Task started");
	}

}
