package org.sc.eureka.ha.provider.controller;

import java.util.Date;

import org.sc.eureka.ha.provider.model.OrderModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

	@GetMapping("/order/{id}")
	public OrderModel findOrderById(@PathVariable Long id) {
		OrderModel orderModel = new OrderModel();
		orderModel.setOrderNo(id);
		orderModel.setCreateTime(new Date());
		orderModel.setPayTime(new Date());
		return orderModel;
	}

}
