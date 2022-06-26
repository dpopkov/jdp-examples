package learn.dp.jdpexamples.c21strategy;

class InitialBehavior implements VehicleBehavior {
    @Override
    public void showDetail(Vehicle vehicle) {
        System.out.println("The " + vehicle.getType() + " is in born state.");
        System.out.println("It cannot do anything special.");
    }
}
