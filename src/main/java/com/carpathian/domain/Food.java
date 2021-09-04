package com.carpathian.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private int price;
	private String name;
	private String description;
	private int amount;
	// later on it will need enums for a type such as : menu, drink, burger
	
	
	public Food(int price, String name, String description, int amount) {
		super();
		this.price = price;
		this.name = name;
		this.description = description;
		this.amount = amount;
	}
	
	public long getId() {
		return id;
	}

	
	public void setId(long id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	

}
