package learn.dp.jdpexamples.c01solid.isp.initial;

public class AdvancedPrinter implements Printer {

    @Override
    public void printDocument() {
        System.out.println("The Advanced Printer prints a document");
    }

    @Override
    public void sendFax() {
        System.out.println("The Advanced Printer sends a fax");
    }
}
