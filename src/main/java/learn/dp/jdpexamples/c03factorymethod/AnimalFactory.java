package learn.dp.jdpexamples.c03factorymethod;

public abstract class AnimalFactory {

    public abstract Animal createAnimal(String color);

    public void createAndDisplayAnimal(String color) {
        Animal animal = createAnimal(color);
        animal.displayBehavior();
    }
}
