package learn.dp.jdpexamples.c09decorator;

class AdvancedHome extends Home {

    private static final double ADVANCED_ADDITIONAL_COST = 25_000.0;

    public AdvancedHome() {
        super(ADVANCED_ADDITIONAL_COST);
        System.out.println(" It becomes an advanced home with more facilities.");
        System.out.println(" You need to pay $" + getPrice() + " for it.");
    }

    @Override
    public double getPrice() {
        return getBasePrice() + getAdditionalCost();
    }
}
