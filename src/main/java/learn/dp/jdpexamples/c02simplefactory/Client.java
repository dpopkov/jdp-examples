package learn.dp.jdpexamples.c02simplefactory;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** Simple Factory Demonstration. ***");
        AnimalFactory factory = new AnimalFactory();
        Animal dog = factory.createAnimal("dog");
        dog.displayBehavior();
        Animal tiger = factory.createAnimal("tiger");
        tiger.displayBehavior();
    }
}
