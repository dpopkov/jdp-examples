package learn.dp.jdpexamples.c01solid.lsp.initial;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** A demo without LSP. ***");
        PaymentHelper helper = new PaymentHelper();

        helper.addUser(new RegisteredUserPayment("Jack"));
        helper.addUser(new RegisteredUserPayment("Alice"));
        helper.addUser(new GuestUserPayment());

        helper.showPreviousPayments();
        helper.processNewPayments();
    }
}
