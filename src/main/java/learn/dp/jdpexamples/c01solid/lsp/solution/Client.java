package learn.dp.jdpexamples.c01solid.lsp.solution;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** A demo with LSP. ***");
        PaymentHelper helper = new PaymentHelper();

        RegisteredUserPayment jack = new RegisteredUserPayment("Jack");
        RegisteredUserPayment alice = new RegisteredUserPayment("Alice");
        helper.addPreviousPayment(jack);
        helper.addPreviousPayment(alice);
        helper.addNewPayment(jack);
        helper.addNewPayment(alice);
        helper.addNewPayment(new GuestUserPayment());

        helper.showPreviousPayments();
        helper.processNewPayments();
    }
}
