package learn.dp.jdpexamples.c07singleton.s1synchronized;

/**
 * Use the <b>final</b> keyword here to protect from creating nested sub-classes that will call private constructor
 * of upper level class.
 */
final class Captain1 {

    private static volatile Captain1 instance;
    private static int instanceCount = 0;

    private Captain1() {
        instanceCount++;
        System.out.println("Number of instances at this moment: " + instanceCount);
    }

    public static Captain1 getInstance() {
        if (instance == null) {
            synchronized (Captain1.class) {
                if (instance == null) {
                    instance = new Captain1();
                    System.out.println("A new captain is elected for your team.");
                }
            }
        } else {
            System.out.println("You already have a captain for your team.");
        }
        return instance;
    }

    /*
    Nested classes may crate excessive instances of upper class.
     */
//    public class CaptainDerived extends Captain1 {
//        CaptainDerived() {
//            System.out.println("Creating CaptainDerived");
//        }
//    }

}
