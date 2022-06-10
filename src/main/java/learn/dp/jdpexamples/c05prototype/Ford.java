package learn.dp.jdpexamples.c05prototype;

import java.util.Random;

class Ford extends BasicCar {

    public Ford(String modelName) {
        super(modelName, 40_000);
        setOnRoadPrice(getBasePrice() + new Random().nextInt(1_000));
    }

    @Override
    public Ford clone() {
        return (Ford) super.clone();
    }
}
