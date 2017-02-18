package org.xujin.sc.eureka.first.order.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.xujin.sc.eureka.first.order.entity.Order;
import org.xujin.sc.eureka.first.order.model.OrderModel;
import org.xujin.sc.eureka.first.order.repository.OrderRepository;
import org.xujin.sc.eureka.first.order.service.OrderService;

public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepo;

	public OrderModel findOrderByOrderId(Long orderId) {
		Order order = orderRepo.findOne(orderId);
		OrderModel orderModel = new OrderModel();
		BeanUtils.copyProperties(order, orderModel);
		return orderModel;
	}

}
