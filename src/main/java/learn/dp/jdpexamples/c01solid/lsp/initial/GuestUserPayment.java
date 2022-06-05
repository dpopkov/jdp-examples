package learn.dp.jdpexamples.c01solid.lsp.initial;

public class GuestUserPayment implements Payment {
    private final String name = "quest";

    @Override
    public void previousPaymentInfo() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void newPayment() {
        System.out.println("Processing " + name + "'s current payment request.");
        // some other code
    }
}
