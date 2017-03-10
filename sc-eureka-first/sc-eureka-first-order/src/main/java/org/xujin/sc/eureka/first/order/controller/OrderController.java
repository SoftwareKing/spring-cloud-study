package org.xujin.sc.eureka.first.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

}
