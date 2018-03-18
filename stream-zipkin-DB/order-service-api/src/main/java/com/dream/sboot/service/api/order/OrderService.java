package com.dream.sboot.service.api.order;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * todo
 *
 * @author shenxiaoping-549
 * @date 2018/3/3 11:48
 * @see
 */
@FeignClient("Order-service")
public interface OrderService {

	@RequestMapping("/get")
	public Order getOrder(@RequestParam("id") Integer id);


	@RequestMapping("/all")
	public List<Order> getOrders(@RequestParam("userId") Integer userId);

	@RequestMapping("/update")
	public Order updateOrder(@RequestParam("order") Order order);

}
