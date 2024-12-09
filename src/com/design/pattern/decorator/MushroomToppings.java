package com.design.pattern.decorator;

public class MushroomToppings extends Toppings {
	int toppingCost=40;

	public MushroomToppings(BasePizza basepizza) {
		super.basePizza=basepizza;
	}

	@Override
	public int getcost() {
		return basePizza.getcost()+toppingCost;
	}

}
