package com.najmaldeen.session8;

class TwoWheeler implements IVehicle, IManufacturer {
    String ID; // variable to store vehicle ID
    String type; // variable to store vehicle type
    /**
     * Parameterized constructor to initialize values based on user input
     * @param ID a String variable storing vehicle ID
     * @param type a String variable storing vehicle type
     */
    public TwoWheeler(String ID, String type){
        this.ID = ID;
        this.type = type;
    }
    /**
     * Overridden method, starts a vehicle
     *
     * @return void
     */
    @Override
    public void start() {
        System.out.println("Starting the "+ type);
    }/**
     * Overridden method, accelerates a vehicle
     * @param speed an integer storing the speed
     * @return void
     */
    @Override
    public void accelerate(int speed) {
        System.out.println("Accelerating at speed:"+speed+ " kmph");
    }
    /**
     * Overridden method, applies brake to a vehicle
     *
     * @return void
     */
    @Override
    public void brake() {
        System.out.println("Applying brakes...");
    }
    /**
     * Overridden method, stops a vehicle
     *
     * @return void
     */
    @Override
    public void stop() {
        System.out.println("Stopping the "+ type);
    }
    /**
     * Displays vehicle details
     *
     * @return void
     */
    public void displayDetails()
    {
        System.out.println("Vehicle No.: "+ STATEID+ " "+ ID);
        System.out.println("Vehicle Type.: "+ type);
    }
    // Implement the IManufacturer interface methods
    /**
     * Overridden method, adds manufacturer details
     * @param detail a String variable storing manufacturer detail
     * @return void
     */
    @Override
    public void addContact(String detail) {
        System.out.println("Manufacturer: "+detail);
    }
    /**
     * Overridden method, calls the manufacturer
     * @param phone a String variable storing phone number
     * @return void
     */
    @Override
    public void callManufacturer(String phone) {
        System.out.println("Calling Manufacturer @: "+phone);
    }
    /**
     * Overridden method, makes payment
     * @param amount a String variable storing the amount
     * @return void
     */
    @Override
    public void makePayment(float amount) {
        System.out.println("Payable Amount: $"+amount);
    }
}
/**
 * Define the class TestVehicleNew and save the file as TestVehicleNew.java
 *
 */
public class TestVehicle {
/**
 * @param args the command line arguments*/
public static void main(String[] args){
// Verify number of command line arguments
    if(args.length==6) {
// Instantiate the class
        TwoWheeler objBike = new TwoWheeler(args[0], args[1]);
        objBike.displayDetails();
        objBike.start();
        objBike.accelerate(Integer.parseInt(args[2]));
        objBike.brake();
        objBike.stop();
        objBike.addContact(args[3]);
        objBike.callManufacturer(args[4]);
        objBike.makePayment(Float.parseFloat(args[5]));
    }
    else{
// Display an error message
        System.out.println("Usage: java TwoWheeler <ID> <Type> <Speed> <Manufacturer> <Phone> <Amount>");
    }
}
}