package learn.dp.jdpexamples.c01solid.isp.solution;

public class AdvancedPrinter implements Printer, FaxDevice {

    @Override
    public void printDocument() {
        System.out.println("The Advanced Printer prints a document");
    }

    @Override
    public void sendFax() {
        System.out.println("The Advanced Printer sends a fax");
    }
}
