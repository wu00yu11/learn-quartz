package com.learn.quartz.dao;

import com.learn.quartz.model.JobAndTrigger;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

public interface JobAndTriggerMapper extends BaseMapper<JobAndTrigger> {
	public List<JobAndTrigger> getJobAndTriggerDetails();
}
