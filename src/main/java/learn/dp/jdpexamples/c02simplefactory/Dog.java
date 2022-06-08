package learn.dp.jdpexamples.c02simplefactory;

public class Dog implements Animal {
    public Dog() {
        System.out.println("A dog is created.");
    }

    @Override
    public void displayBehavior() {
        System.out.println("It says: Bow-Wow. It prefers barking");
    }
}
