package org.xujin.sc.feign.user.service;

import java.util.Date;

import org.xujin.sc.feign.user.model.OrderModel;

import com.alibaba.fastjson.JSON;

public class Test {

	public static void main(String[] args) {

		OrderModel order = new OrderModel();
		order.setCreateTime(new Date());
		order.setOrderNo(33333l);
		order.setPayTime(new Date());
		System.out.println(JSON.toJSONString(order));
	}

}
