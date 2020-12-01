package com.cts.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ms.entity.Order;
import com.cts.ms.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public Order saveOrder(Order order) {
		return orderRepository.save(order);
	}

}
