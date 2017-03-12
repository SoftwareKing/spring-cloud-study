package org.sc.rest.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author xujin
 */
@SpringBootApplication
public class ScRestConsumerApplication {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();

	}

	public static void main(String[] args) {
		SpringApplication.run(ScRestConsumerApplication.class, args);
	}
}
