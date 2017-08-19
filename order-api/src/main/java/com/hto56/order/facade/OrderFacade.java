package com.hto56.order.facade;


import com.hto56.order.dto.OrderDTO;

public interface OrderFacade {

	OrderDTO queryOrderByNo(String orderSn);
	
}
