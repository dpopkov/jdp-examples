package learn.dp.jdpexamples.c11facade;

public class LoanStatus {

    public boolean hasPreviousLoan(Person person) {
        System.out.println("Verifying " + person.getName() + "'s previous loan(s) status.");
        return person.hasPreviousLoan();
    }
}
