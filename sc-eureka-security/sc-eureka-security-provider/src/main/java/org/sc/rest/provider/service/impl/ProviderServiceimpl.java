package org.sc.rest.provider.service.impl;

import java.util.Date;

import org.sc.rest.provider.model.OrderModel;
import org.sc.rest.provider.service.ProviderService;
import org.springframework.stereotype.Service;

@Service
public class ProviderServiceimpl implements ProviderService {

	public OrderModel findOrderByOrderId(Long orderId) {
		OrderModel orderModel = new OrderModel();
		if (orderId.equals(2L)) {
			orderModel.setCreateTime(new Date());
			orderModel.setOrderNo(2L);
		}
		return orderModel;
	}

}
