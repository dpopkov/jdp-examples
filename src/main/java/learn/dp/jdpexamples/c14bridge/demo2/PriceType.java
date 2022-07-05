package learn.dp.jdpexamples.c14bridge.demo2;

/** Implementor interface. */
interface PriceType {

    void displayProductPrice(String productType, double cost);

    void festiveSeasonDiscount(int percentage);

    void sayThanks();
}
