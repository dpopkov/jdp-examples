package learn.dp.jdpexamples.c04abstractfactory.pet;

import learn.dp.jdpexamples.c04abstractfactory.AnimalFactory;
import learn.dp.jdpexamples.c04abstractfactory.Dog;
import learn.dp.jdpexamples.c04abstractfactory.Tiger;

public class PetAnimalFactory extends AnimalFactory {

    public PetAnimalFactory() {
        System.out.println("You opt for a pet animal factory.");
    }

    @Override
    protected Tiger createTiger(String color) {
        return new PetTiger(color);
    }

    @Override
    protected Dog createDog(String color) {
        return new PetDog(color);
    }
}
