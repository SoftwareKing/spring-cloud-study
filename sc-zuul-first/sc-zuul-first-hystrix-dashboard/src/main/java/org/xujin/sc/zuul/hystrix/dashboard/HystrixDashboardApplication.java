package org.xujin.sc.zuul.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author xujin
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(HystrixDashboardApplication.class, args);
    }
}
