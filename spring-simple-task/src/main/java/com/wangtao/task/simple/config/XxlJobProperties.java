package com.wangtao.task.simple.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * @author wangtao
 * Created at 2023/6/23 14:30
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "xxl.job")
public class XxlJobProperties {

    private String adminAddresses;

    private String accessToken;

    @NestedConfigurationProperty
    private ExecutorInfo executor;

    @Setter
    @Getter
    static class ExecutorInfo {

        private String appname;

        private String address;

        private String ip;

        private int port;

        private String logPath;

        private int logRetentionDays;
    }
}
