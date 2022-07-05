package learn.dp.jdpexamples.c14bridge.demo2;

/** Refined Abstraction. */
class Television extends ElectronicItem {

    public Television(PriceType priceType) {
        super(priceType, "television", 2_000.0);
    }
}
