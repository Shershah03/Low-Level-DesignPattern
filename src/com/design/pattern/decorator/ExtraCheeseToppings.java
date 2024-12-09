package com.design.pattern.decorator;

public class ExtraCheeseToppings extends Toppings {
	int toppingCost=20;
	public ExtraCheeseToppings(BasePizza basepizza) {
		super.basePizza=basepizza;
	}

	@Override
	public int getcost() {
		return basePizza.getcost()+toppingCost;
	}
	

}
