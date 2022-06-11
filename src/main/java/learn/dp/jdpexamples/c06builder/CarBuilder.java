package learn.dp.jdpexamples.c06builder;

class CarBuilder implements Builder {

    private final Car car;

    public CarBuilder() {
        car = new Car("Ford");
    }

    @Override
    public Builder addBrandName() {
        car.addPart(" Adding the car brand: " + car.getBrandName() + ".");
        return this;
    }

    @Override
    public Builder buildBody() {
        car.addPart(" Making the car body.");
        return this;
    }

    @Override
    public Builder insertWheels() {
        car.addPart(" 4 wheels are added to the car.");
        return this;
    }

    @Override
    public Vehicle getVehicle() {
        return car;
    }
}
