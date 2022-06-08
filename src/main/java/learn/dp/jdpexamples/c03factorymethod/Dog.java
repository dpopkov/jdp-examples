package learn.dp.jdpexamples.c03factorymethod;

public class Dog implements Animal {
    public Dog(String color) {
        System.out.println("A " + color + " dog is created.");
    }

    @Override
    public void displayBehavior() {
        System.out.println("It says: Bow-Wow. It prefers barking");
    }
}
