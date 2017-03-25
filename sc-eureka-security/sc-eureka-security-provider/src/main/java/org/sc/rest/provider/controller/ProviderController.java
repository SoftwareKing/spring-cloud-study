package org.sc.rest.provider.controller;

import org.sc.rest.provider.model.OrderModel;
import org.sc.rest.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sc")
public class ProviderController {

	@Autowired
	private ProviderService providerService;

	@GetMapping("/order/{id}")
	public OrderModel findOrderById(@PathVariable Long id) {
		OrderModel orderModel = providerService.findOrderByOrderId(id);
		return orderModel;
	}

}
