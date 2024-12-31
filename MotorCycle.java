package org.example;

public class MotorCycle extends Vehicle {
    private boolean hasSidecar; // Exceptional feature for Motorcycle

    public MotorCycle(String vehicleId, String model, double baseRentalRate, boolean isAvailable, boolean hasSidecar) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.hasSidecar = hasSidecar;
    }

    public MotorCycle(String vehicleId, String kawasakiNinja, String s, String available) {

        super(vehicleId, kawasakiNinja, s, available);
        this.hasSidecar = false;
    }

    @Override
    public double calculateRentalCost(int daysRented) {
        double cost = getBaseRentalRate() * daysRented;
        if (hasSidecar) {
            cost += 2 * daysRented; // Additional charge for sidecar
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

