package learn.dp.jdpexamples.c23mediator.example1;

interface Mediator {

    void register(Person person);

    /** Sends a message from one person to another person. */
    void connectEmployees(Person from, Person to, String msg) throws InterruptedException;

    void displayDetails();
}
