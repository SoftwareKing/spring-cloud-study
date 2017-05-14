package org.xujin.sc.feign.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.xujin.sc.feign.user.model.OrderModel;
import org.xujin.sc.feign.user.service.UserFeignService;

/**
 * UserController
 * @author xujin
 */
@RestController
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	// 注入服务提供者,远程的Http服务
	@Autowired
	private UserFeignService userFeignService;

	// 服务消费者对位提供的服务
	@GetMapping("/sc/user/{id}")
	public OrderModel findByIdByEurekaServer(@PathVariable Long id) {
		return userFeignService.findOrderById(id);

	}
}
