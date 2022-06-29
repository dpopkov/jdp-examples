package learn.dp.jdpexamples.c23mediator.example2;

class Client {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("*** Mediator Pattern Demo 2. ***");

        ChatServer mediator = new ChatServer(1000L);
        Employee jane = new Employee(mediator, "Jane");
        Employee alice = new Employee(mediator, "Alice");
        Employee bob = new Employee(mediator, "Bob");
        new Text(mediator, "black");

        mediator.displayEmployees();

        System.out.println("\nCommunication starts among participants...");
        jane.sendMessage(alice, "Hi, Alice, can we discuss the mediator?");
        alice.sendMessage(jane, "Hi, Jane. Yes, we can discuss now.");
        jane.sendMessage(bob, "Hi, Bob!");
    }
}
