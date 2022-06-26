package learn.dp.jdpexamples.c21strategy;

class FlyBehavior implements VehicleBehavior {
    @Override
    public void showDetail(Vehicle vehicle) {
        System.out.println("The " + vehicle.getType() + " can fly now.");
    }
}
