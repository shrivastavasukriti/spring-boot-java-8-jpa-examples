package com.sukriti.backend.billingorder.controller;

import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sukriti.backend.billingorder.entity.Order;
import com.sukriti.backend.billingorder.repository.OrderRpository;

@RestController
public class OrderController {
	private static final Logger log = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired 
	private OrderRpository orderRepository;
	
	@Transactional
	@RequestMapping("/orderId/{id}")
	@ResponseBody
	public Order getOrderId(@PathVariable("id") Integer id) {
		log.info(" !! Order Requested !! ");
		Order order = Optional.ofNullable(orderRepository.getOne(id)).orElse(null);
		log.debug("Order " +order.toString());
		if(Objects.nonNull(order))
		{
			return order;
		}
		return null;
	}
}
