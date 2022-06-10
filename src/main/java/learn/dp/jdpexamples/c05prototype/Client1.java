package learn.dp.jdpexamples.c05prototype;

public class Client1 {

    private static final String HR = "-------------------------";

    public static void main(String[] args) {
        System.out.println("*** Prototype Pattern Demo. ***");

        Nano nano = new Nano("Nano MW321 zx");
        System.out.println(nano);
        line();

        Nano clonedNano = nano.clone();
        printCarDetail(clonedNano);
        line();

        Ford ford = new Ford("Ford Mustang");
        System.out.println(ford);
        line();

        Ford clonedFord = ford.clone();
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
