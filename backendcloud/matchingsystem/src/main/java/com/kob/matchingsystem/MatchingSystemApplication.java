package com.kob.matchingsystem;

import com.kob.matchingsystem.service.impl.MatchingServiceImpl;
import com.kob.matchingsystem.service.impl.utils.MatchingPool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author tzy
 */
@SpringBootApplication
public class MatchingSystemApplication {
    public static void main(String[] args) {
        // 启动匹配线程
        MatchingServiceImpl.MATCHING_POOL.start();
        SpringApplication.run(MatchingSystemApplication.class, args);
    }
}
