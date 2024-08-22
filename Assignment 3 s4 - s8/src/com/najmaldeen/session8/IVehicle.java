package com.najmaldeen.session8;

public interface IVehicle {
    // Declare and initialize constant
    static final String STATEID="LA-09"; // variable to store state ID

    public void start();

    public void accelerate(int speed);

    public void brake();

    public void stop();
}
