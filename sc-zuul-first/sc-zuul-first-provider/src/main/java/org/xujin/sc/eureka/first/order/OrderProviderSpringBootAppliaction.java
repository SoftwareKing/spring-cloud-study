package org.xujin.sc.eureka.first.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供者端，加上@EnableDiscoveryClient注解，完成服务注册。
 * @author xujin
 * @site http://xujin.org
 */
@SpringBootApplication
@EnableDiscoveryClient
// @EnableEurekaClient
public class OrderProviderSpringBootAppliaction {

	public static void main(String[] args) {
		SpringApplication.run(OrderProviderSpringBootAppliaction.class, args);
	}

}
