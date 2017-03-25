package org.sc.rest.provider.service;

import org.sc.rest.provider.model.OrderModel;

public interface ProviderService {

	public OrderModel findOrderByOrderId(Long orderId);
}
