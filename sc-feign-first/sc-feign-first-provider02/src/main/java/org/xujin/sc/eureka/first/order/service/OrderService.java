package org.xujin.sc.eureka.first.order.service;

import org.xujin.sc.eureka.first.order.model.OrderModel;

/**
 * 
 * @author xujin
 *
 */
public interface OrderService {
	public OrderModel findOrderByOrderId(Long orderId);
}
