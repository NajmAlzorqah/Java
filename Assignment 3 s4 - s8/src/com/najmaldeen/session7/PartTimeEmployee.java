package com.najmaldeen.session7;

class PartTimeEmployee extends Employee{
    // Subclass specific variable
    String shift; // Variable to store shift information
    /**
     * Parameterized constructor to initialize values based on user input
     *
     * @param id a String variable storing employee ID
     * @param name a String variable storing employee name
     * @param sal an integer variable storing salary
     * @param shift a String variable storing shift information
     */
    public PartTimeEmployee(String id, String name, int sal, String shift)
    {
// Invoke the super class constructor
        super(id, name, sal);
        this.shift=shift;
    }
/*** Overridden method to display employee details
 *
 * @return void
 */
@Override
public void displayDetails(){
    calcCommission(12); // Invoke the inherited method
    super.displayDetails(); // Invoke the super class display method
    System.out.println("Working shift:"+shift);
}
}
/**
 * Modified EmployeeDetails.java
 */
class EmployeeDetails {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
// Instantiate the Employee class object
        Employee objEmp = new Employee("E001","Maria Nemeth", 40000);
        objEmp.calcCommission(20000F); // Calculate commission
        objEmp.displayDetails(); // Print the details
        System.out.println("-------------------------");
// Instantiate the Employee object as PartTimeEmployee
        Employee objEmp1 = new PartTimeEmployee("E002", "Rob Smith", 30000,
                "Day");
        objEmp1.displayDetails(); // Print the details
    }
}