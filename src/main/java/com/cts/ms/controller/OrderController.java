package com.cts.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ms.entity.Order;
import com.cts.ms.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/bookOrder")
	public Order bookOrder(@RequestBody Order order) {

		return orderService.saveOrder(order);
	}

}
