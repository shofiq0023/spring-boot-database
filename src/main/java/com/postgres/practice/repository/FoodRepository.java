package com.postgres.practice.repository;

import org.springframework.data.repository.CrudRepository;

import com.postgres.practice.model.FoodModel;

public interface FoodRepository extends CrudRepository<FoodModel, Long>{

}
