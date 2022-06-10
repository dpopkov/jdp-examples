package learn.dp.jdpexamples.c05prototype;

abstract class BasicCar implements Cloneable {
    private final String modelName;
    private final int basePrice;
    private int onRoadPrice;

    protected BasicCar(String modelName, int basePrice) {
        this.modelName = modelName;
        this.basePrice = basePrice;
    }

    public String getModelName() {
        return modelName;
    }

    public int getOnRoadPrice() {
        return onRoadPrice;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setOnRoadPrice(int onRoadPrice) {
        this.onRoadPrice = onRoadPrice;
    }

    public BasicCar clone() {
        try {
            return (BasicCar) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("This exception should never happen!", e);
        }
    }

    @Override
    public String toString() {
        return "Model: " + modelName + ", Price: " + onRoadPrice;
    }
}
