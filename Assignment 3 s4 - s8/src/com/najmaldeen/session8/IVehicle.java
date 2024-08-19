package com.najmaldeen.session8;

public interface IVehicle {
    // Declare and initialize constant
    static final String STATEID="LA-09"; // variable to store state ID

    public void start();
    /**
     * Abstract method to accelerate a vehicle
     * @param speed an integer variable storing speed
     * @return void
     */
    public void accelerate(int speed);
    /**
     * Abstract method to apply a brake
     * @return void
     */
    public void brake();
    /**
     * Abstract method to stop a vehicle
     * @return void
     */
    public void stop();
}
