package org.xujin.sc.eureka.first.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * server端加入服务发现Client支持，服务注册，也可以使用
 * @EnableEurekaClient代替 @EnableDiscoveryClient
 * @EnableDiscoveryClient是一个高度的抽象，来自于spring-cloud-commons， 由于Spring
 * Cloud选型是中立的因此抽象出该接口，当服务注册中心选型改变为Eureka，ZK，Consul等不需要代码中注解
 * @author xujin
 * @site http://xujin.org
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderProviderSpringBootAppliaction {

	public static void main(String[] args) {
		SpringApplication.run(OrderProviderSpringBootAppliaction.class, args);
	}

}
