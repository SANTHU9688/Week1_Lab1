package com.info.service;

public class WithExtraSourCream extends TacoDecorator {
	
	Taco taco;


	public WithExtraSourCream(Taco taco) {
		super();
		this.taco = taco;
	}

	@Override
	public String getTacoDescription() {
		// TODO Auto-generated method stub
		return taco.getTacoDescription()+", With Extra SourCream";
	}

	@Override
	public double tacoCost() {
		// TODO Auto-generated method stub
		return taco.tacoCost()+3;
	}

}
