package learn.dp.jdpexamples.c03factorymethod;

public class Client {
    public static void main(String[] args) {
        System.out.println("*** Factory Method Pattern Demo");

        AnimalFactory tigerFactory = new TigerFactory();
        tigerFactory.createAndDisplayAnimal("white");

        AnimalFactory dogFactory = new DogFactory();
        dogFactory.createAndDisplayAnimal("black");
    }
}
