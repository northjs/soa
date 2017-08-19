package com.hto56.order.dto;

import java.io.Serializable;

import com.hto56.order.entity.OrderEntity;

public class OrderDTO implements Serializable{

	private OrderEntity order;

	public OrderEntity getOrder() {
		return order;
	}

	public void setOrder(OrderEntity order) {
		this.order = order;
	}

}
