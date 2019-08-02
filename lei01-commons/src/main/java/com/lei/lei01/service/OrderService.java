package com.lei.lei01.service;

import com.lei.lei01.pojo.Order;

public interface OrderService {
	Order getOrder(String orderId);
	void addOrder(Order order);
}