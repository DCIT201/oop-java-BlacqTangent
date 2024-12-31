import org.example.Car;
import org.example.HeavyDutyTruck;
import org.example.Vehicle;

import java.util.*;

public class Main {
    public static <Motorcycle> void main(String[] args) {

        Car theCar= new Car("4Y1-SL658-4-8-Z-41-1439", "Rezvani Arsenal", 90.0, true);
        Motorcycle theMotorcycle = new Motorcycle("M456", "Harley", 30.0, true);
        Vehicle truck = new HeavyDutyTruck("T789", "Ford", 100.0, 1500.0);


        Customer customer = new Customer("Akan David");


        customer.addRental(theCar);
        customer.addRental(theMotorcycle);
        Object theHeavyDutyTruck = new Object();
        customer.addRental(theHeavyDutyTruck);


        System.out.println("Rental History for " + customer.getName() + ":");
        for (Vehicle v : customer.getRentalHistory()) {
            System.out.println(v.getModel() + " (" + v.getVehicleId() + ")");
        }
    }
}


public void addRental(Vehicle vehicle) {
        rentedVehicles.add(vehicle);
}

public List<Vehicle>getRentalHistory() {
    List<Vehicle> rentedVehicles = List.of();
    return rentedVehicles;
}

 class RentedVehicle {
    private Vehicle vehicle;
    public RentedVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;

    }
 }

public void main() {
}
