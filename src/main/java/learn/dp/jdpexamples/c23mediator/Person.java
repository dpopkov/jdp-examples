package learn.dp.jdpexamples.c23mediator;

abstract class Person {

    protected final Mediator mediator;
    protected final String name;

    public Person(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(Person to, String msg) throws InterruptedException {
        mediator.connectEmployees(this, to, msg);
    }

    public void receiveMessage(Person from, String msg) {
        System.out.println(this.getName() + " has read " + from.getName() + "'s message.");
    }

    public abstract String type();
}
