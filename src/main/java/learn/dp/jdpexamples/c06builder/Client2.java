package learn.dp.jdpexamples.c06builder;

/** The client plays the role of the Director. */
class Client2 {
    public static void main(String[] args) {
        System.out.println("*** Builder Pattern Demo 2. ***");

        Builder carBuilder = new CarBuilder();
        Vehicle car = carBuilder.buildBody()
                .insertWheels()
                .addBrandName()
                .getVehicle();
        car.showProduct();

        Builder motorCycleBuilder = new MotorCycleBuilder();
        Vehicle motorCycle = motorCycleBuilder.addBrandName()
                .buildBody()
                .insertWheels()
                .getVehicle();
        motorCycle.showProduct();
    }
}
