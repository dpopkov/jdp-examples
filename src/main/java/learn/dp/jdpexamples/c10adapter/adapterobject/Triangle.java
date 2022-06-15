package learn.dp.jdpexamples.c10adapter.adapterobject;

class Triangle implements TriInterface {
    private final double baseLength;
    private final double height;

    public Triangle(double baseLength, double height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public void aboutTriangle() {
        System.out.println("Shape type: Triangle.");
    }

    @Override
    public double calculateTriangleArea() {
        return 0.5 * baseLength * height;
    }
}
