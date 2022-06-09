package learn.dp.jdpexamples.c04abstractfactory.pet;

import learn.dp.jdpexamples.c04abstractfactory.Dog;
import learn.dp.jdpexamples.c04abstractfactory.Tiger;

class PetTiger implements Tiger {

    public PetTiger(String color) {
        System.out.println("A pet " + color + " tiger is created");
    }

    @Override
    public void aboutMe() {
        System.out.println("The " + this + " says: Halum. I play in an animal circus");
    }

    @Override
    public void inviteDog(Dog dog) {
        System.out.println("The " + this + " says: I saw a " + dog + " in my town");
    }

    @Override
    public String toString() {
        return "pet tiger";
    }
}
