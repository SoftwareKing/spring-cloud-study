package org.sc.eureka.ha.consumer.controller;

import java.util.List;

import org.sc.eureka.ha.consumer.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author xujin
 *
 */
@RestController
@RequestMapping("/sc")
public class ConsumerController {

	@Autowired
	private DiscoveryClient discoveryClient;

	@Autowired
	private RestTemplate restTemplate;

	public String serviceUrl() {
		List<ServiceInstance> list = discoveryClient
				.getInstances("sc-eureka-ha-provider");
		if (list != null && list.size() > 0) {
			return String.valueOf(list.get(0).getUri());
		}
		return null;
	}

	@GetMapping("/consumer/{id}")
	public OrderModel getOrderInfo(@PathVariable Long id) {
		String providerServiceUrl = serviceUrl();
		return this.restTemplate.getForObject(providerServiceUrl + "order/" + id,
				OrderModel.class);

	}

}
