package org.example;

public class Main {
    public Main() {
        super();
    }

    public static void main() {
        Car theCar = new Car("4Y1-SL658-4-8-Z-41-1439", "Rezvani Arsenal", "90.0", "true") {
            @Override
            public double calculateRentalCost(int daysRented) {
                return 90.0;

            }
        };
    MotorCycle theMotorCycle = new MotorCycle("1HG-CM826-33-A-004352","Kawasaki Ninja","45.0","true");

    HeavyDutyTruck theHeavyDutyTruck = new HeavyDutyTruck("T76-IF632-5-9-U-39-1874","Benz","5000","true");


        RentalAgency.Customer customer = new Customer("Akan David");
        customer.addRental(theCar);
    customer.addRental(theMotorCycle);
    customer.addRental(theHeavyDutyTruck);

    RentalAgency agency = new RentalAgency();
    agency.addVehicle(theCar);
    agency.addVehicle(theMotorCycle);
    agency.addVehicle(theHeavyDutyTruck);

    agency.processRental(theCar,customer,7);
    agency.processRental(theMotorCycle,customer,4);
    agency.processRental(theHeavyDutyTruck,customer,2);

        System.out.println("Rental History for " + customer.getName() + ":");
        for (Vehicle v : ((Customer) customer).getRentalHistory()) {
            System.out.println(v.getModel() + " (" + v.getVehicleId() + ")");
    }
    }

    private static class Customer {
        public Customer(String akanDavid) {

        }

        public void addRental(Car theCar) {
        }

        public void getRentalHistory() {
            return;
        }

        public String getName() {

            return null;
        }
    }
}
