package learn.dp.jdpexamples.c10adapter.adapterobject;

class Rectangle implements RectInterface {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void aboutMe() {
        System.out.println("Shape type: Rectangle.");
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
