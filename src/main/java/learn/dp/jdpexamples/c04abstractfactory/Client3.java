package learn.dp.jdpexamples.c04abstractfactory;

import learn.dp.jdpexamples.c04abstractfactory.pet.PetAnimalFactory;
import learn.dp.jdpexamples.c04abstractfactory.wild.WildAnimalFactory;

/**
 * The client uses composition.
 */
public class Client3 {

    private final AnimalFactory factory;

    public Client3(AnimalFactory factory) {
        this.factory = factory;
    }

    public AnimalFactory getFactory() {
        return factory;
    }

    public static void main(String[] args) {
        System.out.println("*** Abstract Factory Pattern Demo 3. ***");

        Client3 clientOfWild = new Client3(new WildAnimalFactory());
        Dog wildDog = clientOfWild.getFactory().createDog("while");
        Tiger wildTiger = clientOfWild.getFactory().createTiger("golden");
        wildDog.displayMe();
        wildTiger.aboutMe();
        wildTiger.inviteDog(wildDog);

        System.out.println("------------------------------------");

        Client3 clientOfPets = new Client3(new PetAnimalFactory());
        Dog petDog = clientOfPets.getFactory().createDog("black");
        Tiger petTiger = clientOfPets.getFactory().createTiger("yellow");
        petDog.displayMe();
        petTiger.aboutMe();
        petTiger.inviteDog(petDog);
    }
}
