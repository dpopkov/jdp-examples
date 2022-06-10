package learn.dp.jdpexamples.c05prototype;

import java.util.Random;

class Nano extends BasicCar {

    public Nano(String modelName) {
        super(modelName, 5_000);
        setOnRoadPrice(getBasePrice() + new Random().nextInt(1_000));
    }

    @Override
    public Nano clone() {
        return (Nano) super.clone();
    }
}
