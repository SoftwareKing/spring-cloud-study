package org.xujin.sc.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server
 * @author xujin
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServer {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringCloudEurekaServer.class).web(true).run(args);

	}
}
