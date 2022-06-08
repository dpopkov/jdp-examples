package learn.dp.jdpexamples.c02simplefactory;

public class AnimalFactorySafe {

    public enum Type {
        DOG,
        TIGER
    }

    public Animal createAnimal(Type type) {
        switch (type) {
            case DOG:
                return new Dog();
            case TIGER:
                return new Tiger();
            default:
                System.out.println("You can create either a 'dog' or a 'tiger'.");
                throw new IllegalArgumentException("Unknown animal type: " + type);
        }
    }
}
