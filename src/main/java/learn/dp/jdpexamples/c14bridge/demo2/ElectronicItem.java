package learn.dp.jdpexamples.c14bridge.demo2;

/** Abstraction. */
abstract class ElectronicItem {

    protected final PriceType priceType;
    protected final String productType;
    protected final double cost;

    protected ElectronicItem(PriceType priceType, String productType, double cost) {
        this.priceType = priceType;
        this.productType = productType;
        this.cost = cost;
    }

    protected void showPriceDetail() {
        priceType.displayProductPrice(productType, cost);
    }

    protected void getDiscount(int percentage) {
        priceType.festiveSeasonDiscount(percentage);
    }

    protected void conveyThanks() {
        priceType.sayThanks();
    }
}
