package com.design.pattern.strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("NORMAL STRategy");
    }
}
