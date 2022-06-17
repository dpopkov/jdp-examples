package learn.dp.jdpexamples.c12flyweight;

import java.util.HashMap;
import java.util.Map;

class VehicleFactory {

    private final Map<String, Vehicle> vehicles = new HashMap<>();

    /** Count of different types of vehicles in a given moment. */
    public int totalObjectsCreated() {
        return vehicles.size();
    }

    public synchronized Vehicle getVehicleFromFactory(String vehicle) {
        Vehicle vehicleType = vehicles.get(vehicle);
        if (vehicleType != null) {
            // using the existing type
            System.out.println("\n\tUsing an existing vehicle now");
        } else {
            switch (vehicle) {
                case "car":
                    System.out.println("Making a car for the first time");
                    vehicleType = new Car("One car is ready");
                    vehicles.put("car", vehicleType);
                    break;
                case "bus":
                    System.out.println("Making a bus for the first time");
                    vehicleType = new Bus("One bus is ready");
                    vehicles.put("bus", vehicleType);
                    break;
                case "future":
                    System.out.println("Making a future vehicle for the first time");
                    vehicleType = new FutureVehicle("One future vehicle is ready");
                    vehicles.put("future", vehicleType);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown vehicle type");
            }
        }
        return vehicleType;
    }
}
