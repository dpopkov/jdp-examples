package learn.dp.jdpexamples.c14bridge.demo2;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** Alternative Implementation of Bridge Pattern. ***");

        System.out.println("Verifying the market price of a television.");
        ElectronicItem tv = new Television(new OnlinePrice());
        tv.showPriceDetail();

        tv = new Television(new ShowroomPrice());
        tv.showPriceDetail();
        tv.getDiscount(7);
        tv.conveyThanks();

        System.out.println("----------");
        System.out.println("Verifying the market price of a DVD.");
        ElectronicItem dvd = new DVD(new OnlinePrice());
        dvd.showPriceDetail();
        dvd = new DVD(new ShowroomPrice());
        dvd.showPriceDetail();
        //Checking the DVD specific method
        ((DVD)dvd).getDoubleDiscountWithThanks();
    }
}
