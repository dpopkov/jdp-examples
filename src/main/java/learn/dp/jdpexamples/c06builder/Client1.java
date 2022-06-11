package learn.dp.jdpexamples.c06builder;

class Client1 {
    public static void main(String[] args) {
        System.out.println("*** Builder Pattern Demo 1. ***");

        Director carDirector = new CarDirector();
        Vehicle car = carDirector.instruct(new CarBuilder());
        car.showProduct();

        Director motorCycleDirector = new MotorCycleDirector();
        Vehicle motorCycle = motorCycleDirector.instruct(new MotorCycleBuilder());
        motorCycle.showProduct();
    }
}
