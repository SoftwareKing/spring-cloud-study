package org.xujin.sc.eureka.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.xujin.sc.eureka.user.model.Order;

@RestController
public class UserController {

	@Autowired
	private RestTemplate restTemplate;

	// 从属性文件中读取服务提供的URL
	@Value("order.orderServiceUrl")
	private String oderServiceUrl;

	@GetMapping("/user/{id}")
	public Order findById(@PathVariable Long id) {
		// this.restTemplate.getForObject("http://localhost:8000/sc/order/" +
		// id,Order.class)在代码中写死需要调用的URL
		return this.restTemplate.getForObject(oderServiceUrl + "sc/order/" + id,
				Order.class);
	}
}
