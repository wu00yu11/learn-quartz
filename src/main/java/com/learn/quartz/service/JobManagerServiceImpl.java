package com.learn.quartz.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JobManagerServiceImpl implements JobManagerService {

    @Override
    public void hello() {
        log.info("hello");
    }
}
