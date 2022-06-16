package learn.dp.jdpexamples.c11facade;

public class Person {
    private final String name;
    private final double assetValue;
    private final boolean previousLoanExists;

    public Person(String name, double assetValue, boolean previousLoanExists) {
        this.name = name;
        this.assetValue = assetValue;
        this.previousLoanExists = previousLoanExists;
    }

    public String getName() {
        return name;
    }

    public double getAssetValue() {
        return assetValue;
    }

    public boolean hasPreviousLoan() {
        return previousLoanExists;
    }
}
