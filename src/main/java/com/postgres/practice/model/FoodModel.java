package com.postgres.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "food")
public class FoodModel {

	@Id
	@Column(name = "foodId")
	private Long id;
	
	@Column(name = "foodName")
	private String name;
	
	@Column(name = "foodPrice")
	private Integer price;

	public FoodModel(Long id, String name, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public FoodModel(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}

	public FoodModel() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
