package learn.dp.jdpexamples.c26nullobject.demo2;

public class NullVehicle implements Vehicle {

    private static final Vehicle instance = new NullVehicle();

    public static Vehicle getInstance() {
        return instance;
    }

    private NullVehicle() {
    }

    @Override
    public void travel() {
        // Does nothing
    }
}
