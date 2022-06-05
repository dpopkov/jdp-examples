package learn.dp.jdpexamples.c01solid.lsp.solution;

import java.util.ArrayList;
import java.util.List;

public class PaymentHelper {

    private final List<PreviousPayment> previousPayments = new ArrayList<>();
    private final List<NewPayment> newPayments = new ArrayList<>();

    public void addNewPayment(NewPayment user) {
        newPayments.add(user);
    }

    public void addPreviousPayment(PreviousPayment user) {
        previousPayments.add(user);
    }

    public void showPreviousPayments() {
        for (PreviousPayment payment : previousPayments) {
            payment.previousPaymentInfo();
            System.out.println("-------");
        }
    }

    public void processNewPayments() {
        for (NewPayment payment : newPayments) {
            payment.newPayment();
            System.out.println("-------");
        }
    }
}
