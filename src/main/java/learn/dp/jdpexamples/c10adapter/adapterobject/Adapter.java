package learn.dp.jdpexamples.c10adapter.adapterobject;

class Adapter implements RectInterface {

    private final TriInterface triInterface;

    public Adapter(TriInterface triInterface) {
        this.triInterface = triInterface;
    }

    @Override
    public void aboutMe() {
        triInterface.aboutTriangle();
    }

    @Override
    public double calculateArea() {
        return triInterface.calculateTriangleArea();
    }
}
