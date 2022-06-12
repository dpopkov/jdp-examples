package learn.dp.jdpexamples.c07singleton.s3statichelper;


class Client3 {
    public static void main(String[] args) {
        System.out.println("*** Singleton Pattern Demo 3 with lazy init using nested static class. ***");

        Captain3.dummyMethodThatDoesNotForceThisSingletonToInitialize();

        System.out.println("Trying to make a captain");
        Captain3 captain1 = Captain3.getInstance();
        System.out.println("Trying to make another captain");
        Captain3 captain2 = Captain3.getInstance();
        if (captain1 == captain2) {
            System.out.println("Both captains are the same");
        }
    }
}
