package com.info.service;

public abstract class Taco {
	
	String tacoName ="Unknown Cake";

	public String getTacoDescription() {
		return tacoName;
	}
	
	public abstract double tacoCost();

}
