package org.xujin.sc.feign.user.controller;

import java.util.Date;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.xujin.sc.feign.user.model.OrderModel;
import org.xujin.sc.feign.user.service.UserFeignService;

import com.google.common.collect.Maps;

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

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String hello(@RequestParam("name") String name, @RequestParam("age") int age) {
		return userFeignService.hello(name, age);
	}

	@PostMapping("/test/post")
	public OrderModel testPost(@RequestBody OrderModel orderModel) {
		return userFeignService.post(orderModel);
	}

	@GetMapping("/test/get")
	public String testGet() {
		HashMap<String, Object> map = Maps.newHashMap();
		map.put("orderNo", "1");
		map.put("createTime", new Date());
		map.put("payTime", new Date());
		return userFeignService.testGet(map);
	}
}
