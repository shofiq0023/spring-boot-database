package com.postgres.practice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.postgres.practice.model.FoodModel;
import com.postgres.practice.service.FoodService;

@RestController
public class FoodController { 
	
	@Autowired
	private FoodService foodService;
	
	// Create food item
	@RequestMapping(value = "/food/add", method = RequestMethod.POST)
	public void addFood(@RequestBody FoodModel food) {
		foodService.addFood(food);
	}
	
	// Read all food item
	@RequestMapping("/food/get/all")
	public List<FoodModel> getAll() {
		return foodService.getAll();
	}
	
	// Read single food item
	@RequestMapping("/food/get/{id}")
	public Optional<FoodModel> getFood(@PathVariable Long id) {
		return foodService.getFood(id);
	}
	
	// Update food item
	@RequestMapping(value = "/food/update/{id}", method = RequestMethod.PUT)
	public void updateFood(@PathVariable Long id, @RequestBody FoodModel food) {
		foodService.updateFood(id, food);
	}
	
	// Delete food item
	@RequestMapping(value = "/food/delete/{id}", method = RequestMethod.DELETE)
	public void deleteFood(@PathVariable Long id) {
		foodService.deleteFood(id);
	}
}
