package org.xujin.sc.zuul.consumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.xujin.sc.zuul.consumer.model.OrderModel;

/**
 * 
 * @author xujin
 *
 */
@RestController
@RequestMapping("/sc")
public class ConsumerController {

    private static final Logger logger = LoggerFactory.getLogger(ConsumerController.class);

	@Autowired
	private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;


    /**
     * 演示普通路由
     * 
     * @param id
     * @return
     */
	@GetMapping("/consumer/{id}")
	public OrderModel getOrderInfo(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://sc-zuul-first-provider/" + "/sc/order/" + id, OrderModel.class);

	}

    @GetMapping("/log-user-instance")
    public void logUserInstance() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("sc-zuul-first-consumer");
        // 打印当前选择的是哪个节点
        logger.info("{}:{}:{}", serviceInstance.getServiceId(), serviceInstance.getHost(),
                serviceInstance.getPort());
    }

}
