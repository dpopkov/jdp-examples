package learn.dp.jdpexamples.c14bridge.demo2;

class OnlinePrice implements PriceType {

    @Override
    public void displayProductPrice(String productType, double cost) {
        System.out.println("The " + productType + "'s online price is $" + (cost * .9));
    }

    @Override
    public void festiveSeasonDiscount(int percentage) {
        System.out.println(" You can get a maximum of " + percentage + "% discount in festive season.");
    }

    @Override
    public void sayThanks() {
        System.out.println("Thank you for your interest in our product.");
    }
}
