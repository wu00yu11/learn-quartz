package com.learn.quartz.config.quartzs;

import com.learn.quartz.config.MyBatisConfig;
import lombok.extern.slf4j.Slf4j;
import org.quartz.utils.ConnectionProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component
@AutoConfigureAfter(MyBatisConfig.class)
@Slf4j
public class SpringConnectionProvider  implements ConnectionProvider {
    @Resource
    private DataSource dataSource;
    @Value("${quartz.jobStore.dataSource}")
    private String dataSourceName = "dataSource";
    @Override
    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    @Override
    public void shutdown() throws SQLException {
        log.debug("==========do shutdown===========");
        dataSource = null;
    }

    @Override
    public void initialize() throws SQLException {
        log.debug("==========do initialize===========");
    }

    /**
     * @param dataSourceName the dataSourceName to set
     */
    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    /**
     * @return the dataSourceName
     */
    public String getDataSourceName() {
        return dataSourceName;
    }
}
