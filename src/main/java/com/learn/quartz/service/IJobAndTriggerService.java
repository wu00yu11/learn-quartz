package com.learn.quartz.service;
import com.github.pagehelper.PageInfo;
import com.learn.quartz.model.JobAndTrigger;

public interface IJobAndTriggerService {
	PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize);
}
