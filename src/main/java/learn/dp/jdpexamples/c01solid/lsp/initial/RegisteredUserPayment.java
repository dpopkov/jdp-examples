package learn.dp.jdpexamples.c01solid.lsp.initial;

public class RegisteredUserPayment implements Payment {
    private final String name;

    public RegisteredUserPayment(String name) {
        this.name = name;
    }

    @Override
    public void previousPaymentInfo() {
        System.out.println("Retrieving " + name + "'s last payment details.");
        // some other code
    }

    @Override
    public void newPayment() {
        System.out.println("Processing " + name + "'s current payment request.");
        // some other code
    }
}
