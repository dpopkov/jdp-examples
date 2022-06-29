package learn.dp.jdpexamples.c23mediator.example1;

class Client {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("*** Mediator Pattern Demo. ***");

        Mediator mediator = new ChatServer();
        Person jane = new Employee(mediator, "Jane");
        Person alice = new Employee(mediator, "Alice");
        Person bob = new Outsider(mediator, "Bob");
        mediator.register(jane);
        mediator.register(alice);
        mediator.register(bob);
        mediator.displayDetails();

        System.out.println("\nCommunication starts among participants...");
        jane.sendMessage(bob, "Hi Bob, can we discuss the mediator pattern");
        jane.sendMessage(alice, "Hi Alice, how do you do?");
        bob.sendMessage(jane, "Hi Jane, Yes, we can discuss now.");
        alice.sendMessage(jane, "Hello, friend");

        Person bill = new Employee(mediator, "Bill");
        bill.sendMessage(jane, "Hello, Jane");
        bill.sendMessage(alice, "Hello, Alice");
    }
}
