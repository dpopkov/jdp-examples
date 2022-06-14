package learn.dp.jdpexamples.c09decorator;

abstract class Home {
    private static final double HOME_BASE_PRICE = 100_000.0;

    private final double basePrice;
    private final double additionalCost;

    public Home() {
        basePrice = HOME_BASE_PRICE;
        additionalCost = 0.0;
    }

    protected Home(double additionalCost) {
        basePrice = HOME_BASE_PRICE;
        this.additionalCost = additionalCost;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getAdditionalCost() {
        return additionalCost;
    }

    public abstract double getPrice();

    public void printTotal() {
        System.out.println("Total cost: $" + getPrice());
    }
}
