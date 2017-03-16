package org.xujin.sc.eureka.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.xujin.sc.eureka.user.model.Order;

@RestController
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private DiscoveryClient discoveryClient;

	@Autowired
	private LoadBalancerClient loadBalancerClient;

	// 从属性文件中读取服务提供的URL
	@Value("order.orderServiceUrl")
	private String oderServiceUrl;

	@GetMapping("/log-instance")
	public void logUserInstance() {
		ServiceInstance serviceInstance = this.loadBalancerClient
				.choose("sc-eureka-first-provider");
		String url = String.valueOf(serviceInstance.getHost());

		logger.info("{},{},{}", serviceInstance.getServiceId(), serviceInstance.getHost(),
				serviceInstance.getPort());

	}

	@GetMapping("/ribbon/user/{id}")
	public Order findByIdByRibbon(@PathVariable Long id) {
		return this.restTemplate.getForObject(
				"sc-eureka-first-provider" + "/sc/order/" + id, Order.class);
	}

	public String serviceUrl() {
		List<ServiceInstance> list = discoveryClient
				.getInstances("sc-eureka-first-provider");
		if (list != null && list.size() > 0) {
			return String.valueOf(list.get(0).getUri());
		}
		return null;
	}

	@GetMapping("/user/{id}")
	public Order findById(@PathVariable Long id) {
		return this.restTemplate.getForObject("http://localhost:8000/sc/order/" + id,
				Order.class);
	}

	@GetMapping("/sc/user/{id}")
	public Order findByIdByEurekaServer(@PathVariable Long id) {
		String providerServiceUrl = serviceUrl();
		return this.restTemplate.getForObject(providerServiceUrl + "sc/order/" + id,
				Order.class);
	}
}
