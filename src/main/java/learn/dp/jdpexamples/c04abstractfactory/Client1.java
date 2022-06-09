package learn.dp.jdpexamples.c04abstractfactory;

import learn.dp.jdpexamples.c04abstractfactory.pet.PetAnimalFactory;
import learn.dp.jdpexamples.c04abstractfactory.wild.WildAnimalFactory;

public class Client1 {

    public static void main(String[] args) {
        System.out.println("*** Abstract Factory Pattern Demo. ***");

        AnimalFactory wildFactory = new WildAnimalFactory();
        Dog wildDog = wildFactory.createDog("while");
        Tiger wildTiger = wildFactory.createTiger("golden");
        wildDog.displayMe();
        wildTiger.aboutMe();
        wildTiger.inviteDog(wildDog);

        System.out.println("------------------------------------");

        AnimalFactory petFactory = new PetAnimalFactory();
        Dog petDog = petFactory.createDog("black");
        Tiger petTiger = petFactory.createTiger("yellow");
        petDog.displayMe();
        petTiger.aboutMe();
        petTiger.inviteDog(petDog);
    }
}
