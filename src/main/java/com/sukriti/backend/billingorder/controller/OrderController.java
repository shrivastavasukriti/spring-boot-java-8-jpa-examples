package com.sukriti.backend.billingorder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@RequestMapping("/orderId")
	public Integer getOrderId() {
		return 100;
	}
}
