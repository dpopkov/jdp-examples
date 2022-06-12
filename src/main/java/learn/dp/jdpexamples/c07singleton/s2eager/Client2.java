package learn.dp.jdpexamples.c07singleton.s2eager;

class Client2 {
    public static void main(String[] args) {
        System.out.println("*** Singleton Pattern Demo 2 using eager initialization. ***");

        Captain2.dummyMethodForcesThisSingletonToInitialize();

        System.out.println("Trying to make a captain");
        Captain2 captain1 = Captain2.getInstance();
        System.out.println("Trying to make another captain");
        Captain2 captain2 = Captain2.getInstance();
        if (captain1 == captain2) {
            System.out.println("Both captains are the same");
        }
    }
}
