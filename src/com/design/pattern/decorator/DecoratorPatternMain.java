package com.design.pattern.decorator;

public class DecoratorPatternMain {

	public static void main(String[] args) {

		BasePizza basePizza=new MushroomToppings(new ExtraCheeseToppings(new VegDelight()));
		System.out.println("The Cost of your pizza is "+ basePizza.getcost());

	}

}
