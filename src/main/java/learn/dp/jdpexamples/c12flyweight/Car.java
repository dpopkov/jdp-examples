package learn.dp.jdpexamples.c12flyweight;

/**
 * A shared flyweight implementation.
 */
class Car implements Vehicle {

    /**
     * This is an intrinsic state:
     * 1.It is not supplied by client.
     * 2.It is independent of the flyweight’s context.
     * 3.This can be shared across.
     */
    private final String description;

    Car(String description) {
        this.description = description;
    }

    @Override
    public void aboutMe(String color) {
        System.out.print(description + " with " + color + " color");
    }
}
