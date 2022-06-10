package learn.dp.jdpexamples.c05prototype;

public class Client2 {

    private static final String HR = "-------------------------";

    public static void main(String[] args) {
        System.out.println("*** Prototype Pattern Demo 2. ***");

        CarCloneMaker carMaker = new CarCloneMaker();

        BasicCar nano = carMaker.getNano();
        System.out.println(nano);
        line();

        BasicCar clonedNano = nano.clone();
        printCarDetail(clonedNano);
        line();

        BasicCar ford = carMaker.getFord();
        System.out.println(ford);
        line();

        BasicCar clonedFord = ford.clone();
        printCarDetail(clonedFord);
        line();
    }

    private static void printCarDetail(BasicCar car) {
        System.out.println("Editing a cloned model: " + car.getModelName());
        car.setOnRoadPrice(car.getOnRoadPrice() + 100);
        System.out.println("It's on-road price: $" + car.getOnRoadPrice());
    }

    private static void line() {
        System.out.println(HR);
        System.out.println();
    }
}
