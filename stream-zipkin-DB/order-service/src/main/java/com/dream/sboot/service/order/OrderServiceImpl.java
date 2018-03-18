/*
 * @Project Name: TODO
 * @File Name: OrderServiceImpl
 * @Package Name: com.dream.sboot.service.order
 * @Date: 2018/3/3 11:59
 * @Creator: shenxiaoping-549
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.dream.sboot.service.order;

import com.dream.sboot.service.api.Student;
import com.dream.sboot.service.api.StudentService;
import com.dream.sboot.service.api.order.Order;
import com.dream.sboot.service.api.order.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * todo
 *
 * @author shenxiaoping-549
 * @date 2018/3/3 11:59
 * @see
 */
@RequestMapping("/order")
@RestController
public class OrderServiceImpl implements OrderService{

	private static final Logger LOG = LoggerFactory.getLogger(OrderService.class);

	@Autowired
	private StudentService studentService;


	@Override
	public Order getOrder(Integer id) {
		Integer id2 = 1;
		Student student = studentService.getStu(id2);
		LOG.info("form order: sutdent==="+student.getID()+","+student.getName());
		Order order = new Order();
		order.setID(110L);
		order.setOrderId("12457896321478");
		LOG.info("===get order==");
		return order;
	}

	@Override
	public List<Order> getOrders(Integer id) {
		Student student = studentService.getStu(100);
		LOG.info("from orders>>>>>>sutdent==="+student.getID()+","+student.getName());
		Order order = new Order();
		order.setID(110L);
		order.setOrderId("12457896321478");
		List<Order> orders = new ArrayList<>();
		orders.add(order);
		return orders;
	}

	@Override
	public Order updateOrder(Order order) {
		Student student = studentService.getStu(100);
		Student stu = studentService.update(student);
		LOG.info("====New Stu===="+ stu.toString());
		return null;
	}
}
