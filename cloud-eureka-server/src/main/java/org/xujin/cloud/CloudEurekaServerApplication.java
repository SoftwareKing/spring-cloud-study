package org.xujin.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(CloudEurekaServerApplication.class).web(true).run(args);
	}
}
