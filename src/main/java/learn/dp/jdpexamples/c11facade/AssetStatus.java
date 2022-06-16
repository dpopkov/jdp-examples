package learn.dp.jdpexamples.c11facade;

public class AssetStatus {

    public boolean hasSufficientAssetValue(Person person, double claimAmount) {
        System.out.println("Verifying " + person.getName() + "'s asset value");
        return person.getAssetValue() >= claimAmount;
    }
}
