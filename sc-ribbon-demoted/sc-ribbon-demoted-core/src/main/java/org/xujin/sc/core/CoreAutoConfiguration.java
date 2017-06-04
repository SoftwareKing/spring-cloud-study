package org.xujin.sc.core;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 
 * @author xujin DefaultRibbonConfiguration 加载LWR规则
 */
@Configuration
@EnableWebMvc
@RibbonClients(defaultConfiguration = DefaultRibbonConfiguration.class)
public class CoreAutoConfiguration extends WebMvcConfigurerAdapter {

	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		// 把CoreHttpRequestInterceptor，加到restTemplate的拦截器栈里
		restTemplate.getInterceptors().add(new CoreHttpRequestInterceptor());
		return restTemplate;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 把CoreHeaderInterceptor加到拦截器栈里
		registry.addInterceptor(new CoreHeaderInterceptor());
	}
}
