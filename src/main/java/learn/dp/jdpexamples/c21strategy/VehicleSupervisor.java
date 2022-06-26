package learn.dp.jdpexamples.c21strategy;

class VehicleSupervisor {
    private VehicleBehavior behavior;

    public VehicleSupervisor(VehicleBehavior behavior) {
        this.behavior = behavior;
    }

    public void setBehavior(VehicleBehavior behavior) {
        this.behavior = behavior;
    }

    public void displayDetail(Vehicle vehicle) {
        behavior.showDetail(vehicle);
    }
}
