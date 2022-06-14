package learn.dp.jdpexamples.c09decorator;

class BasicHome extends Home {

    public BasicHome() {
        super();
        System.out.println(" The basic home with some standard facilities is ready.");
        System.out.println(" You need to pay $" + getPrice() + " for it.");
    }

    @Override
    public double getPrice() {
        return getBasePrice();
    }
}
