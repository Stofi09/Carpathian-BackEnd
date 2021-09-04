package com.carpathian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.carpathian.domain.Food;
import com.carpathian.service.FoodService;
import java.util.List;

@RestController
public class APIController {

	@Autowired
	FoodService foodService;
	
	@RequestMapping("/")
	public List<Food> indexAPI() {
		return foodService.getAllFood();
	}
	
	
}
