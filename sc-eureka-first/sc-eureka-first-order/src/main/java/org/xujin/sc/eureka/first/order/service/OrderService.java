package org.xujin.sc.eureka.first.order.service;

import org.springframework.stereotype.Service;
import org.xujin.sc.eureka.first.order.model.OrderModel;

/**
 * 
 * @author xujin
 *
 */
@Service
public interface OrderService {
	public OrderModel findOrderByOrderId(Long orderId);
}
