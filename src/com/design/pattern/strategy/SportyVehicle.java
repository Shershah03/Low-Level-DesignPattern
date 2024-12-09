package com.design.pattern.strategy;

public class SportyVehicle extends Vehicle{

    public SportyVehicle() {
        super(new SportyDriveStrategy());
    }
}
