package com.learn.quartz.job;

import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public interface BaseJob extends Job{
	Logger _logger = LoggerFactory.getLogger(BaseJob.class);
	public void execute(JobExecutionContext context) throws JobExecutionException;
}

