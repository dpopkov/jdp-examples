package learn.dp.jdpexamples.c03factorymethod;

public class Tiger implements Animal {
    public Tiger(String color) {
        System.out.println("A " + color + " tiger is created.");
    }

    @Override
    public void displayBehavior() {
        System.out.println("Tiger says: Halum. It loves to roam in a jungle");
    }
}
