package learn.dp.jdpexamples.c07singleton.s1synchronized;

class Client1 {
    public static void main(String[] args) {
        System.out.println("*** Singleton Pattern Demo 1 using lazy init and synchronization with double check. ***");

        System.out.println("Trying to make a captain");
        Captain1 captain1 = Captain1.getInstance();
        System.out.println("Trying to make another captain");
        Captain1 captain2 = Captain1.getInstance();
        if (captain1 == captain2) {
            System.out.println("Both captains are the same");
        }

        /* Derived classes below demonstrate the case of not using keyword final. */
//        Captain1.CaptainDerived derived1 = captain1.new CaptainDerived();
//        Captain1.CaptainDerived derived2 = captain1.new CaptainDerived();
    }
}
