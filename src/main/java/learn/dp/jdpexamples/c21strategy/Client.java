package learn.dp.jdpexamples.c21strategy;

class Client {
    public static void main(String[] args) {
        System.out.println("*** Strategy Pattern Demo. ***");

        Vehicle vehicle = new Vehicle("airplane");
        VehicleSupervisor supervisor = new VehicleSupervisor(new InitialBehavior());
        supervisor.displayDetail(vehicle);

        System.out.println("Setting flying capability to it.");
        supervisor.setBehavior(new FlyBehavior());
        supervisor.displayDetail(vehicle);

        System.out.println("Setting floating capability to it");
        supervisor.setBehavior(new FloatBehavior());
        supervisor.displayDetail(vehicle);
    }
}
