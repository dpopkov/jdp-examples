package learn.dp.jdpexamples.c09decorator;

class SwimmingPool extends Luxury {

    private final double swimmingPoolCost;

    public SwimmingPool(Home home) {
        super(home);
        this.swimmingPoolCost = 55_000.0;
        System.out.println(" For a swimming pool you pay an extra $" + getLuxuryCost());
    }

    @Override
    public double getLuxuryCost() {
        return swimmingPoolCost;
    }
}
