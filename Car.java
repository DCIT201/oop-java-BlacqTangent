package org.example;

public class Car extends Vehicle{
    private int doors;
    private int engineCapacity;
    private boolean hasAirconditioning; //  Exceptional feature for Car
    public Car(int doors, int engineCapacity, boolean hasAirconditioning) {
        super();
        this.doors = doors;
        this.engineCapacity = engineCapacity;
        this.hasAirconditioning = hasAirconditioning;

    }

    public Car(String s, String s1, String s2, String available) {

    }

    public Car(String s, String rezvaniArsenal, double v, boolean b) {

    }

    @Override
    public double calculateRentalCost(int daysRented) {
       double cost = getBaseRentalRate() * daysRented;
       if (hasAirconditioning) {
           cost +=16 * daysRented; // Additional charge for air conditioning
       }
       return cost;
    }

    @Override
    public double calculateRentalCost(int daysRented, Customer customer) {
        return 0;
    }

    @Override
    public <Customer> double calculateRentalCost(int daysRented, Customer customer) {
        return 0;
    }

    @Override
    public <Customer> double calculateRentalCost(int daysRented, Customer customer) {
        return 0;
    }
}
