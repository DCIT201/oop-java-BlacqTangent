package org.example;

public class HeavyDutyTruck extends Vehicle {
    private double loadCapacity; // Exceptional attribute for HeavyDutyTruck

    public HeavyDutyTruck(String vehicleId, String model, double baseRentalRate, boolean isAvailable, double loadCapacity) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.loadCapacity = loadCapacity;
    }

    public HeavyDutyTruck(String vehicleId, String benz, String number, String available) {

    }

    public HeavyDutyTruck(String t789, String ford, double v, double v1) {

    }

    @Override
    public double calculateRentalCost(int daysRented) {
      double cost = getBaseRentalRate() * daysRented;
      if (loadCapacity > 2000) {
          cost += 20 * daysRented; // Additional charges for Excessive load capacity
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
}


