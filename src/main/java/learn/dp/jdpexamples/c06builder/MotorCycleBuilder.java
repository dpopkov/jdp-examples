package learn.dp.jdpexamples.c06builder;

class MotorCycleBuilder implements Builder {

    private final MotorCycle motorCycle;

    public MotorCycleBuilder() {
        motorCycle = new MotorCycle("Honda");
    }

    @Override
    public Builder addBrandName() {
        motorCycle.addPart(" Adding the brand name: " + motorCycle.getBrandName() + ".");
        return this;
    }

    @Override
    public Builder buildBody() {
        motorCycle.addPart(" Making the body of the motorcycle.");
        return this;
    }

    @Override
    public Builder insertWheels() {
        motorCycle.addPart(" 2 wheels are added to the motorcycle.");
        return this;
    }

    @Override
    public Vehicle getVehicle() {
        return motorCycle;
    }
}
