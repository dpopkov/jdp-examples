package learn.dp.jdpexamples.c05prototype;

import java.util.Random;

public class Nano extends BasicCar {

    protected Nano(String modelName) {
        super(modelName, 5_000);
        setOnRoadPrice(getBasePrice() + new Random().nextInt(1_000));
    }

    @Override
    public Nano clone() {
        return (Nano) super.clone();
    }
}
