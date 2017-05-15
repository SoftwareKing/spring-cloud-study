package org.xujin.sc.feign.first.order.service;

import org.xujin.sc.feign.first.order.model.OrderModel;

/**
 * 
 * @author xujin
 *
 */
public interface OrderService {
	public OrderModel findOrderByOrderId(Long orderId);
}
