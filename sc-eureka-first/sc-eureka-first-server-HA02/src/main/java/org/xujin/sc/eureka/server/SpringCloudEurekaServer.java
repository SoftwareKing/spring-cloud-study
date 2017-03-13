package org.xujin.sc.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server
 * @author xujin
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServer {
	
  public static void main(String[] args) {
	SpringApplication.run(SpringCloudEurekaServer.class,args);
	
  }
}
