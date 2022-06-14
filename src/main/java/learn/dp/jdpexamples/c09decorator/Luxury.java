package learn.dp.jdpexamples.c09decorator;

abstract class Luxury extends Home {
    private final Home home;

    public Luxury(Home home) {
        this.home = home;
    }

    public abstract double getLuxuryCost();

    @Override
    public double getPrice() {
        return home.getPrice() + getLuxuryCost();
    }
}
