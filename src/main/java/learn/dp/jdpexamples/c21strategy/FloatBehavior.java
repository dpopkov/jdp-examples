package learn.dp.jdpexamples.c21strategy;

class FloatBehavior implements VehicleBehavior {
    @Override
    public void showDetail(Vehicle vehicle) {
        System.out.println("The " + vehicle.getType() + " can float now.");
    }
}
