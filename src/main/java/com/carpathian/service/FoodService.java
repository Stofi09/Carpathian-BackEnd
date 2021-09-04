package com.carpathian.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.carpathian.repository.FoodRepository;
import com.carpathian.domain.Food;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class FoodService  {

	@Autowired
	FoodRepository foodDepository;
	
	public List<Food> getAllFood(){
		return foodDepository.findAll();
	}
}
