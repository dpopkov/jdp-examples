package learn.dp.jdpexamples.c01solid.lsp.solution;

public class GuestUserPayment implements NewPayment {
    private final String name = "quest";

    @Override
    public void newPayment() {
        System.out.println("Processing " + name + "'s current payment request.");
        // some other code
    }
}
