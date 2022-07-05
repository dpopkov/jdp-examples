package learn.dp.jdpexamples.c14bridge.demo1;

/** Abstraction. */
abstract class ElectronicItem {

    protected final PriceType priceType;

    public ElectronicItem(PriceType priceType) {
        this.priceType = priceType;
    }

    /**
     * Use implementor object to invoke this method.
     */
    protected abstract void showPriceDetail();
}
