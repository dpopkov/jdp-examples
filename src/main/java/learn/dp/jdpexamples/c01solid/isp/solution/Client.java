package learn.dp.jdpexamples.c01solid.isp.solution;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** A demo with ISP. ***");
        AdvancedPrinter advanced = new AdvancedPrinter();
        advanced.printDocument();
        advanced.sendFax();
        Printer basic = new BasicPrinter();
        basic.printDocument();
    }
}
