package org.example;

public abstract class Vehicle {
    // Private encapsulated fields

    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    // Constructors with validation

    public Vehicle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable;
    }

    public Vehicle() {

    }

    public Vehicle(String vehicleId, String rezvaniArsenal, String s, String available) {

    }
    // Getters and setters

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public abstract double calculateRentalCost(int daysRented);

    public boolean isAvailableForRental() {


        return false;
    }

    public void rent(Customer customer, int days) {

    }

    // Abstract methods for rental calculation
public abstract double calculateRentalCost(int daysRented, Customer customer);

    public abstract <Customer> double calculateRentalCost(int daysRented, Customer customer);
}

