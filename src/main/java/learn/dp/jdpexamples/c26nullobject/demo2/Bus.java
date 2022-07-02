package learn.dp.jdpexamples.c26nullobject.demo2;

class Bus implements Vehicle {
    private static int busCount = 0;

    public static int getBusCount() {
        return busCount;
    }

    public Bus() {
        busCount++;
    }

    @Override
    public void travel() {
        System.out.println("Let us travel on a bus");
    }
}
