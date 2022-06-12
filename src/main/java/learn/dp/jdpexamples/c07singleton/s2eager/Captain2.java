package learn.dp.jdpexamples.c07singleton.s2eager;

/**
 * Use the <b>final</b> keyword here to protect from creating nested sub-classes that will call private constructor
 * of upper level class.
 */
final class Captain2 {

    private static final Captain2 INSTANCE = new Captain2();

    private Captain2() {
        System.out.println("A new captain is elected for your team.");
    }

    public static Captain2 getInstance() {
        System.out.println("You already have a captain for your team.");
        return INSTANCE;
    }

    /*
     *  Example how to run the Singleton's constructor without actually getting the instance.
     */
    public static void dummyMethodForcesThisSingletonToInitialize() {
        System.out.println("This method does nothing but it forces the Singleton's initialization to start");
    }
}
