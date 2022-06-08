package learn.dp.jdpexamples.c02simplefactory;

public class AnimalFactory {

    public Animal createAnimal(String type) {
        Animal animal;
        if ("dog".equals(type)) {
            animal = new Dog();
        } else if ("tiger".equals(type)) {
            animal = new Tiger();
        } else {
            System.out.println("You can create either a 'dog' or a 'tiger'.");
            throw new IllegalArgumentException("Unknown animal type: " + type);
        }
        return animal;
    }
}
