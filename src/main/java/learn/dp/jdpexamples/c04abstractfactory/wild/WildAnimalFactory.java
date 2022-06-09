package learn.dp.jdpexamples.c04abstractfactory.wild;

import learn.dp.jdpexamples.c04abstractfactory.AnimalFactory;
import learn.dp.jdpexamples.c04abstractfactory.Dog;
import learn.dp.jdpexamples.c04abstractfactory.Tiger;

public class WildAnimalFactory extends AnimalFactory {

    public WildAnimalFactory() {
        System.out.println("You opt for a wild animal factory.");
    }

    @Override
    protected Tiger createTiger(String color) {
        return new WildTiger(color);
    }

    @Override
    protected Dog createDog(String color) {
        return new WildDog(color);
    }
}
