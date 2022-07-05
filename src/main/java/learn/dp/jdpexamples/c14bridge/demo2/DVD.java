package learn.dp.jdpexamples.c14bridge.demo2;

/** Refined Abstraction. */
class DVD extends ElectronicItem {

    public DVD(PriceType priceType) {
        super(priceType, "DVD", 3_000.0);
    }

    public void getDoubleDiscountWithThanks() {
        getDiscount(10);
        getDiscount(5);
        conveyThanks();
    }
}
