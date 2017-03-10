package org.xujin.sc.eureka.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.xujin.sc.eureka.user.model.Order;

@RestController
public class UserController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/user/{id}")
	public Order findById(@PathVariable Long id) {
		return this.restTemplate.getForObject("http://localhost:8000/sc/order/" + id,
				Order.class);
	}
}
