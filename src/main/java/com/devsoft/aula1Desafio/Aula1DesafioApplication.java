package com.devsoft.aula1Desafio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsoft"})
public class Aula1DesafioApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Aula1DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
