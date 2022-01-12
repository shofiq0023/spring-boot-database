package com.postgres.practice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgres.practice.model.FoodModel;
import com.postgres.practice.repository.FoodRepository;

@Service
public class FoodService {
	
	@Autowired
	private FoodRepository foodRepo;
	
	// create operation
	public void addFood(FoodModel food) {
		foodRepo.save(food);
	}
	
	// read operation
	public List<FoodModel> getAll() {
		List<FoodModel> foods = new ArrayList<>();
		foodRepo.findAll().forEach(foods::add);
		return foods;
	}
	
	// read single operation
	public Optional<FoodModel> getFood(Long id) {
		return foodRepo.findById(id);
	}
	
	// update operation
	public void updateFood(Long id, FoodModel food) {
		foodRepo.save(food);
	}
	
	// delete operation
	public void deleteFood(Long id) {
		foodRepo.deleteById(id);
	}
}
