package org.xujin.sc.zuul.first.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 
 * @author xujin
 * @EnableZuulProxy 声明一个Zuul 代理，该代理使用Ribbon软负载均衡，还整合Hystrix实现熔断
 */
@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulApplication.class, args);
    }
}
