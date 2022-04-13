package com.training.spring.bean;

public class Dog extends Animal{
	private String type;
	private int weight;

	public Dog(String name, int age, String color,String type, int weight) {
		super(name, age, color);
		this.type = type;
		this.weight = weight;
	}

	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String getAnimalInfo() {
		return this.getName()+" is "+this.getAge()+" years old "+this.getColor()+" color "+type+" breed and having "+weight+" pounds weight";
	}

}
