package com.devsoft.services;

import org.springframework.stereotype.Service;

import com.devsoft.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		double valor = order.getBasic();
		double shipping = 0;
		if(valor > 200.0){
			shipping = 0.0;
		}else if(valor >= 100.0){
			shipping = 12.00;
		}else if(valor < 100.0) {
			shipping = 20.0;
		}
		return shipping;		
	}

}
