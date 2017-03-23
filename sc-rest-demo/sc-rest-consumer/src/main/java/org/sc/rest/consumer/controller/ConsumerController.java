package org.sc.rest.consumer.controller;

import org.sc.rest.consumer.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xujin
 */
@RestController
@RequestMapping("/sc")
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;

	// 从属性文件中读取服务提供的URL
	@Value("${order.orderServiceUrl}")
	private String orderServiceUrl;

	@GetMapping("/consumer/{id}")
	public OrderModel getOrderInfo(@PathVariable Long id) {
		// this.restTemplate.getForObject("http://localhost:8000/sc/order/" +
		// id,OrderModel.class);
		return this.restTemplate.getForObject(this.orderServiceUrl + "/sc/order/" + id,
				OrderModel.class);

	}

}
