package learn.dp.jdpexamples.c06builder;

class Car extends Vehicle {

    public Car(String brandName) {
        super(brandName);
        System.out.println("We are about to make a " + brandName + " car.");
    }
}
