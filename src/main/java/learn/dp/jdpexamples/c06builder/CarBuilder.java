package learn.dp.jdpexamples.c06builder;

class CarBuilder implements Builder {

    private final Car car;

    public CarBuilder() {
        car = new Car("Ford");
    }

    @Override
    public void addBrandName() {
        car.addPart(" Adding the car brand: " + car.getBrandName() + ".");
    }

    @Override
    public void buildBody() {
        car.addPart(" Making the car body.");
    }

    @Override
    public void insertWheels() {
        car.addPart(" 4 wheels are added to the car.");
    }

    @Override
    public Vehicle getVehicle() {
        return car;
    }
}
