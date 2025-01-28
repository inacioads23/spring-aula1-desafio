package com.devsoft.aula1Desafio;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsoft.entities.Order;
import com.devsoft.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.devsoft"})
public class Aula1DesafioApplication implements CommandLineRunner{
	
	@Autowired
	private OrderService orderService;	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		SpringApplication.run(Aula1DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309, 95.90, 0.0);		
		System.out.printf("%nPedido código %d", order.getCode());
		System.out.printf("%nValor Total: R$ %.2f%n%n", orderService.total(order));
	}

}
