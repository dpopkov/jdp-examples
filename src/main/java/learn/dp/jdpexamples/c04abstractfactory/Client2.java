package learn.dp.jdpexamples.c04abstractfactory;

public class Client2 {
    public static void main(String[] args) {
        System.out.println("*** Abstract Factory Pattern Demo 2. ***");

        AnimalFactory wildFactory = FactoryProvider.getFactory("wild");
        Dog wildDog = wildFactory.createDog("while");
        Tiger wildTiger = wildFactory.createTiger("golden");
        wildDog.displayMe();
        wildTiger.aboutMe();
        wildTiger.inviteDog(wildDog);

        System.out.println("------------------------------------");

        AnimalFactory petFactory = FactoryProvider.getFactory("pet");
        Dog petDog = petFactory.createDog("black");
        Tiger petTiger = petFactory.createTiger("yellow");
        petDog.displayMe();
        petTiger.aboutMe();
        petTiger.inviteDog(petDog);
    }
}
