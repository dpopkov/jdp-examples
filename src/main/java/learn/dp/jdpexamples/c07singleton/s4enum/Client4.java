package learn.dp.jdpexamples.c07singleton.s4enum;

class Client4 {
    public static void main(String[] args) {
        System.out.println("*** Singleton Pattern Demo 4 with eager init using enum. ***");

        Captain4.dummyMethodForcesThisSingletonToInitialize();

        Captain4.INSTANCE.getInstance();
        System.out.println("Trying to make a captain");
        Captain4 captain1 = Captain4.INSTANCE;
        System.out.println("Trying to make another captain");
        Captain4 captain2 = Captain4.INSTANCE;
        if (captain1 == captain2) {
            System.out.println("Both captains are the same");
        }
    }
}
