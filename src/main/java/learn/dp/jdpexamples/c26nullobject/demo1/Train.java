package learn.dp.jdpexamples.c26nullobject.demo1;

class Train implements Vehicle {
    private static int trainCount = 0;

    public static int getTrainCount() {
        return trainCount;
    }

    public Train() {
        trainCount++;
    }

    @Override
    public void travel() {
        System.out.println("Let us travel on a train");
    }
}
