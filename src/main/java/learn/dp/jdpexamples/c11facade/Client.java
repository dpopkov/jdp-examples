package learn.dp.jdpexamples.c11facade;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** Facade Pattern Demo. ***");

        LoanApprover approver = new LoanApprover();

        Person person = new Person("Bob", 5_000, true);
        checkEligibility(person, 20_000, approver);

        person = new Person("Jack", 70_000, false);
        checkEligibility(person, 30_000, approver);

        person = new Person("Tony", 125_000, true);
        checkEligibility(person, 125_000, approver);
    }

    private static void checkEligibility(Person person, double claimAmount, LoanApprover approver) {
        String approvalStatus = approver.checkLoanEligibility(person, claimAmount);
        System.out.println(person.getName() + "'s application status:" + approvalStatus);
    }
}
