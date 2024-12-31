package org.example;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void processRental(Vehicle vehicle, Customer customer, int days) {
        if (vehicle.isAvailableForRental()) {
            Customer Customer = new Customer();
            vehicle.rent(Customer, days);
        } else {
            System.out.println("Vehicle is not available for rental.");
        }
    }

    private class Customer {
        public String getName() {


            return "";
        }
    }
}

