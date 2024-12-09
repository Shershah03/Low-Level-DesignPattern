package com.design.pattern.strategy;

public class SportyDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("SPROTY STRategy");
    }
}
