package learn.dp.jdpexamples.c05prototype;

class CarCloneMaker {

    private Nano nano;
    private Ford ford;

    public BasicCar getNano() {
        if (nano == null) {
            initNano();
        }
        return nano.clone();
    }

    public BasicCar getFord() {
        if (ford == null) {
            initFord();
        }
        return ford.clone();
    }

    private void initNano() {
        nano = new Nano("Nano XY321");
    }

    private void initFord() {
        ford = new Ford("Ford Sierra");
    }
}
