package learn.dp.jdpexamples.c02simplefactory;

public class ClientSafe {

    public static void main(String[] args) {
        System.out.println("*** Simple Factory Demonstration. ***");
        AnimalFactorySafe factory = new AnimalFactorySafe();
        Animal dog = factory.createAnimal(AnimalFactorySafe.Type.DOG);
        dog.displayBehavior();
        Animal tiger = factory.createAnimal(AnimalFactorySafe.Type.TIGER);
        tiger.displayBehavior();
    }
}
