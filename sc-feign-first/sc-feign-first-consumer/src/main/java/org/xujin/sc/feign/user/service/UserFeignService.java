package org.xujin.sc.feign.user.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.xujin.sc.feign.user.model.OrderModel;

@FeignClient(name = "sc-feign-first-provider")
public interface UserFeignService {

	@RequestMapping(value = "/sc/order/{id}", method = RequestMethod.GET)
	public OrderModel findOrderById(@PathVariable("id") Long id);

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(@RequestParam("name") String name, @RequestParam("age") int age);

}
