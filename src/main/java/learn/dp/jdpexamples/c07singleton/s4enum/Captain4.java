package learn.dp.jdpexamples.c07singleton.s4enum;

public enum Captain4 {
    INSTANCE;

    Captain4() {
        System.out.println("A new captain is elected for your team.");
    }

    public void getInstance() {
        System.out.println("You already have a captain for your team");
    }

    public static void dummyMethodForcesThisSingletonToInitialize() {
        System.out.println("This method does nothing but it forces the Singleton's initialization to start");
    }
}
