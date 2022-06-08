package learn.dp.jdpexamples.c02simplefactory;

public class Tiger implements Animal {
    public Tiger() {
        System.out.println("A tiger is created.");
    }

    @Override
    public void displayBehavior() {
        System.out.println("Tiger says: Halum. It loves to roam in a jungle");
    }
}
