package learn.dp.jdpexamples.c06builder;

/**
 * The CarDirector directs the car's instantiation steps.
 */
class CarDirector extends Director {

    @Override
    public Vehicle instruct(Builder builder) {
        builder.buildBody();
        builder.insertWheels();
        builder.addBrandName();
        return builder.getVehicle();
    }
}
