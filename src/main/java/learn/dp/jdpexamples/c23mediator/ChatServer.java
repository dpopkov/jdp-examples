package learn.dp.jdpexamples.c23mediator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class ChatServer implements Mediator {

    private final List<Person> participants = new ArrayList<>();

    @Override
    public void register(Person person) {
        participants.add(person);
    }

    @Override
    public void connectEmployees(Person from, Person to, String msg) throws InterruptedException {
        if (participants.contains(from)) {
            if (participants.contains(to)) {
                System.out.println(from.getName() + " posts: " + msg + " at:" + LocalDateTime.now());
                Thread.sleep(500);
                to.receiveMessage(from, msg);
            } else {
                System.out.println(from.getName() + ", you cannot send message to " + to.getName() + ".");
                System.out.println("He/she is NOT a registered user.");
            }
        } else {
            System.out.print("\n****ALERT: Everyone.***");
            System.out.println("An " + from.type() + ": " + from.getName() + " is trying to send some messages.");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("At present, the registered employees are:");
        participants.forEach(p -> System.out.println(p.getName()));
    }
}
