package com.wangtao.task.simple.job;

import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author wangtao
 * Created at 2023/6/23 14:47
 */
@Slf4j
@Component
public class SimpleJob {

    /**
     * 使用XxlJob注解标注一个具体任务的执行逻辑，注解里面的名称等会在配置任务时需要使用到
     */
    @XxlJob("helloXxlJob")
    public void helloXxlJob() {
        log.info("Hello XXL-JOB!");
    }
}
