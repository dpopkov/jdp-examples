package learn.dp.jdpexamples.c10adapter.adapterclass;

public class Adapter extends Triangle implements RectInterface {
    @Override
    public void aboutMe() {
        aboutTriangle();
    }
}
