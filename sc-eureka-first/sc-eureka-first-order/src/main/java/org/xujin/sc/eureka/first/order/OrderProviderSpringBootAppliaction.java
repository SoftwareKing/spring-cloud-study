package org.xujin.sc.eureka.first.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xujin
 */
@SpringBootApplication
// server端加入服务发现Client支持，服务注册
@EnableDiscoveryClient
public class OrderProviderSpringBootAppliaction {

	public static void main(String[] args) {
		SpringApplication.run(OrderProviderSpringBootAppliaction.class, args);
	}

}
