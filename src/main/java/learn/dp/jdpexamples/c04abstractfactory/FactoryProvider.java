package learn.dp.jdpexamples.c04abstractfactory;

import learn.dp.jdpexamples.c04abstractfactory.pet.PetAnimalFactory;
import learn.dp.jdpexamples.c04abstractfactory.wild.WildAnimalFactory;

/**
 * Optional Factory Provider is used to avoid a dependency between the client code and the factories.
 */
public class FactoryProvider {

    public static AnimalFactory getFactory(String type) {
        if (type.contains("wild")) {
            return new WildAnimalFactory();
        } else if (type.contains("pet")) {
            return new PetAnimalFactory();
        } else {
            throw new IllegalArgumentException("Unknown type of factory " + type);
        }
    }
}
