package com.spring.coud.task.utils;

import org.springframework.cloud.task.configuration.TaskConfigurer;
import org.springframework.cloud.task.repository.TaskExplorer;
import org.springframework.cloud.task.repository.TaskRepository;
import org.springframework.transaction.PlatformTransactionManager;

public class CustomTaskConfigurer implements TaskConfigurer{

	@Override
	public TaskExplorer getTaskExplorer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskRepository getTaskRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlatformTransactionManager getTransactionManager() {
		// TODO Auto-generated method stub
		return null;
	}

}
