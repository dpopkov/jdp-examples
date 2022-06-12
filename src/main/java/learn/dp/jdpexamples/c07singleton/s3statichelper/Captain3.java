package learn.dp.jdpexamples.c07singleton.s3statichelper;

/**
 * Use the <b>final</b> keyword here to protect from creating nested sub-classes that will call private constructor
 * of upper level class.
 */
final class Captain3 {

    private static final class SingletonHelper {
        private static final Captain3 INSTANCE = new Captain3();
    }

    private Captain3() {
        System.out.println("A new captain is elected for your team.");
    }

    public static Captain3 getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static void dummyMethodThatDoesNotForceThisSingletonToInitialize() {
        System.out.println("This method does nothing and it does not force the Singleton to initialize");
    }

}
