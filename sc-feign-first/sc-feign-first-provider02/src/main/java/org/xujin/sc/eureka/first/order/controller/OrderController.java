package org.xujin.sc.eureka.first.order.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.xujin.sc.eureka.first.order.model.OrderModel;
import org.xujin.sc.eureka.first.order.service.OrderService;

/**
 * OrderController
 * @author xujin
 *
 */
@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/sc/order/{id}")
	public OrderModel findOrderById(@PathVariable Long id) {
		OrderModel orderModel = orderService.findOrderByOrderId(id);
		return orderModel;
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(@RequestParam("name") String name, @RequestParam("age") int age) {
		return name + age;
	}

	@PostMapping("/test/post")
	public OrderModel testPost(@RequestBody OrderModel orderModel) {
		orderModel.setOrderNo(2222222L);
		return orderModel;
	}

	@RequestMapping(value = "/test/get", method = RequestMethod.GET)
	public String testGet(@RequestParam Map<String, Object> map) {
		return String.valueOf(map);
	}

}
