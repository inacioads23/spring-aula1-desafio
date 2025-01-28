package com.devsoft.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsoft.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {		
		double discount = order.getBasic() * (order.getDiscount() / 100.0);
			
		return order.getBasic() + shippingService.shipment(order) - discount;		
	}
	
}
