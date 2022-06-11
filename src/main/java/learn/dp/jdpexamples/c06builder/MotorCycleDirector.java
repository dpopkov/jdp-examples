package learn.dp.jdpexamples.c06builder;

class MotorCycleDirector extends Director {

    @Override
    public Vehicle instruct(Builder builder) {
        builder.addBrandName();
        builder.buildBody();
        builder.insertWheels();
        return builder.getVehicle();
    }
}
