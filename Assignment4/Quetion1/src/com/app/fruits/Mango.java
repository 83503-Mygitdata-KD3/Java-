package com.app.fruits;

public class Mango extends Fruit{

	public Mango(String color, double weight, String name) {
		super(color, weight, name);
		
	}
	
	public Mango() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public String taste() {
		return "sweet";
	}
}