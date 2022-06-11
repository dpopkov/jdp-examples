package learn.dp.jdpexamples.c06builder;

class MotorCycleBuilder implements Builder {

    private final MotorCycle motorCycle;

    public MotorCycleBuilder() {
        motorCycle = new MotorCycle("Honda");
    }

    @Override
    public void addBrandName() {
        motorCycle.addPart(" Adding the brand name: " + motorCycle.getBrandName() + ".");
    }

    @Override
    public void buildBody() {
        motorCycle.addPart(" Making the body of the motorcycle.");
    }

    @Override
    public void insertWheels() {
        motorCycle.addPart(" 2 wheels are added to the motorcycle.");
    }

    @Override
    public Vehicle getVehicle() {
        return motorCycle;
    }
}
