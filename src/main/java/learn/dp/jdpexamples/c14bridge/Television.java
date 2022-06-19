package learn.dp.jdpexamples.c14bridge;

/** Refined Abstraction. */
class Television extends ElectronicItem {

    private final String productType;
    private final double cost;

    public Television(PriceType priceType) {
        super(priceType);
        this.productType = "television";
        this.cost = 2_000.0;
    }

    /**
     * Implementation specific.
     * The call is delegated to the Implementor object.
     */
    @Override
    protected void showPriceDetail() {
        super.priceType.displayProductPrice(productType, cost);
    }
}
