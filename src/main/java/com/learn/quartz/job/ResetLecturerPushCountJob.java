package com.learn.quartz.job;

import com.learn.quartz.dao.TlecturersMapper;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import javax.annotation.Resource;

/**
 * 重置讲师上首页数据；重置讲师上push次数,每天凌晨0点10分
 * Created by liuzhen on 2018/9/7
 */
public class ResetLecturerPushCountJob implements BaseJob{

    @Resource
    TlecturersMapper tlecturersMapper;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        _logger.info("=============开始执行ResetLecturerPushCountJob============");
        tlecturersMapper.resetLecturerConfig();
        _logger.info("=============结束执行ResetLecturerPushCountJob============");
    }
}
