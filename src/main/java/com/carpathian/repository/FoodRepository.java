package com.carpathian.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.carpathian.domain.Food;

public interface FoodRepository extends CrudRepository<Food, Long> {

	List<Food> findAll();
}
