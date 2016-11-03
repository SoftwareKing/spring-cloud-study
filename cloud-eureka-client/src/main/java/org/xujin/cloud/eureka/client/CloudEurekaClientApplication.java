package org.xujin.cloud.eureka.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * 
 * @author xujin
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudEurekaClientApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(CloudEurekaClientApplication.class).web(true).run(args);
	}

}