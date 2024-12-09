package com.design.pattern.decorator;

public class PaneerToppings extends Toppings {
	int toppingCost=30;

	public PaneerToppings(BasePizza basepizza) {
		super.basePizza=basepizza;
	}

	@Override
	public int getcost() {
		return basePizza.getcost()+toppingCost;
	}

}
