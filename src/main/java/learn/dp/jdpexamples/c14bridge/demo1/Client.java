package learn.dp.jdpexamples.c14bridge.demo1;

class Client {
    public static void main(String[] args) {
        System.out.println("*** Bridge Pattern Demo. ***");

        ElectronicItem itemOnline = new Television(new OnlinePrice());
        itemOnline.showPriceDetail();

        ElectronicItem itemShowroom = new Television(new ShowroomPrice());
        itemShowroom.showPriceDetail();
    }
}
