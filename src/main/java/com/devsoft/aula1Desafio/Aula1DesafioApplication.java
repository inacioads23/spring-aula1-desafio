package com.devsoft.aula1Desafio;

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
		SpringApplication.run(Aula1DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
