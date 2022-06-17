package learn.dp.jdpexamples.c12flyweight;

class Client {

    public static void main(String[] args) {
        System.out.println("*** Flyweight Pattern Demo. ***");

        VehicleFactory factory = new VehicleFactory();
        createVehicles("car", 3, factory);
        createVehicles("bus", 5, factory);
        createVehicles("future", 2, factory);
    }

    private static void createVehicles(String vehicleType, int count, VehicleFactory factory) {
        for (int i = 0; i < count; i++) {
            Vehicle vehicle = factory.getVehicleFromFactory(vehicleType);
            vehicle.aboutMe(getRandomColor());
        }
        int distinctVehiclesCount = factory.totalObjectsCreated();
        System.out.println("\n\tDistinct vehicles in this application: " + distinctVehiclesCount);
        System.out.println("--------------------------------------------------");
    }

    private static String getRandomColor() {
        if (Math.random() > 0.5) {
            return "red";
        } else {
            return "green";
        }
    }
}
