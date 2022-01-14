package com.info.service;

public class WithExtraCheese extends TacoDecorator {

	Taco taco;
	
	
	
	public WithExtraCheese(Taco taco) {
		super();
		this.taco = taco;
	}

	@Override
	public String getTacoDescription() {
		// TODO Auto-generated method stub
		return taco.getTacoDescription()+", with Extra cheese ";
	}

	@Override
	public double tacoCost() {
		// TODO Auto-generated method stub
		return taco.tacoCost()+2;
	}

}
