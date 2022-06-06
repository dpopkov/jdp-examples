package learn.dp.jdpexamples.c01solid.isp.initial;

public class BasicPrinter implements Printer {

    @Override
    public void printDocument() {
        System.out.println("The Basic Printer prints a document");
    }

    @Override
    public void sendFax() {
        throw new UnsupportedOperationException();
    }
}
