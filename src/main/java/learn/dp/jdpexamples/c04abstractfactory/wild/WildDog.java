package learn.dp.jdpexamples.c04abstractfactory.wild;

import learn.dp.jdpexamples.c04abstractfactory.Dog;

class WildDog implements Dog {

    public WildDog(String color) {
        System.out.println("A wild " + color + " dog is created");
    }

    @Override
    public void displayMe() {
        System.out.println("The " + this + " says: I prefer to roam freely in jungles. Bow-Wow");
    }

    @Override
    public String toString() {
        return "wild dog";
    }
}
