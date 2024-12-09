package com.design.pattern.factory;

public class FactorypatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory obj=new ShapeFactory();	
		Shape shape = obj.getShape("CIRCLE");
		shape.draw();
	}

}
