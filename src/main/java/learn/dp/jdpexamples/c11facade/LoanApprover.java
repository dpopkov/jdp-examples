package learn.dp.jdpexamples.c11facade;

/**
 * Serves as the only point of contact for a client.
 * Simplifies interface for a client and reduces the number of objects a client needs to deal with.
 */
public class LoanApprover {

    private final AssetStatus assetStatus = new AssetStatus();
    private final LoanStatus loanStatus = new LoanStatus();

    public String checkLoanEligibility(Person person, double claimAmount) {
        String status = " Approved";
        String reason = "";
        System.out.println("\nChecking the loan approval status of " + person.getName());
        System.out.println("The current asset value: " + person.getAssetValue()
                + ",\nclaim amount: " + claimAmount
                + ",\nexisting loan?:" + person.hasPreviousLoan());
        if (!assetStatus.hasSufficientAssetValue(person, claimAmount)) {
            status = " Not approved.";
            reason += "\nInsufficient balance.";
        }
        if (loanStatus.hasPreviousLoan(person)) {
            status = " Not approved.";
            reason += "\nAn old load exists.";
        }
        String remarks = String.format("%nRemarks if any:%s", reason);
        return String.format("%s %s", status, remarks);
    }
}
