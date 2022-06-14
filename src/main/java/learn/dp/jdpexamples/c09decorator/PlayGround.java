package learn.dp.jdpexamples.c09decorator;

class PlayGround extends Luxury {

    private final double playGroundCost;

    public PlayGround(Home home) {
        super(home);
        this.playGroundCost = 20_000.0;
        System.out.println(" For a playground you pay an extra $" + getLuxuryCost());
    }

    @Override
    public double getLuxuryCost() {
        return playGroundCost;
    }
}
