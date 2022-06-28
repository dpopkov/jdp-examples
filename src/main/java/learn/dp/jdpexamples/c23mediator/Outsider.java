package learn.dp.jdpexamples.c23mediator;

class Outsider extends Person {

    public Outsider(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public String type() {
        return "Outsider";
    }
}
