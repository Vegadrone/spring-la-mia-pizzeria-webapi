package org.generation.italy.demo;

import org.generation.italy.demo.pojo.Pizza;
import org.generation.italy.demo.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApiTestApplication implements CommandLineRunner {
	
	@Autowired
	PizzaService pS;

	public static void main(String[] args) {
		SpringApplication.run(SpringApiTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Pizza p1 = new Pizza ("Margherita");
		Pizza p2 = new Pizza ("Capricciosa");
		Pizza p3 = new Pizza ("Bufalina");
		Pizza p4 = new Pizza ("Diavola");
		
		pS.save(p1);
		pS.save(p2); 
		pS.save(p3); 
		pS.save(p4);
		
	}

}
