package org.sc.eureka.ha.consumer.controller;

import org.sc.eureka.ha.consumer.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
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
	private RestTemplate restTemplate;

	@GetMapping("/consumer/{id}")
	public OrderModel getOrderInfo(@PathVariable Long id) {
		return this.restTemplate.getForObject("sc-eureka-ha-provider" + "/sc/order/" + id,
				OrderModel.class);

	}

}
