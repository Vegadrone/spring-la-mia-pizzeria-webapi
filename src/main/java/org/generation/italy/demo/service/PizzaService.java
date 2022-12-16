package org.generation.italy.demo.service;

import java.util.List;
import java.util.Optional;

import org.generation.italy.demo.Repo.PizzaRepo;
import org.generation.italy.demo.pojo.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {
	@Autowired
	PizzaRepo pR;
	
	public void save(Pizza pizza) {
		pR.save(pizza);
	}
	
	public void delete(Pizza pizza) {
		pR.delete(pizza);
	}
	
	public List <Pizza> findAll(){
		return pR.findAll();
	}
	
	public Optional<Pizza> findPizzaById(int id) {
		
		return pR.findById(id);
	}
}
