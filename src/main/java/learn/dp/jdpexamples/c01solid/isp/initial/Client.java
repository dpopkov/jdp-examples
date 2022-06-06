package learn.dp.jdpexamples.c01solid.isp.initial;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** A demo without ISP. ***");
        Printer advanced = new AdvancedPrinter();
        advanced.printDocument();
        advanced.sendFax();
        Printer basic = new BasicPrinter();
        basic.printDocument();
        basic.sendFax();
    }
}
