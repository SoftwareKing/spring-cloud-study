package org.sc.rest.consumer.controller;

import org.sc.rest.consumer.controller.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author xujin
 *
 */
@Controller
@RequestMapping("/sc")
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;

	// 从属性文件中读取服务提供的URL
	@Value("order.orderServiceUrl")
	private String oderServiceUrl;

	@GetMapping("/order/{id}")
	public OrderModel getOrderInfo(@PathVariable Long id) {
		return this.restTemplate.getForObject(oderServiceUrl + "", OrderModel.class);

	}

}
