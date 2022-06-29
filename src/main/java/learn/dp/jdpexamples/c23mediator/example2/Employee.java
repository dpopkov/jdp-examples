package learn.dp.jdpexamples.c23mediator.example2;

class Employee {

    private final ChatServer chatServer;
    private final String name;

    Employee(ChatServer chatServer, String name) {
        this.chatServer = chatServer;
        this.name = name;
        this.chatServer.register(this);
    }

    public String getName() {
        return name;
    }

    public void sendMessage(Employee to, String msg) throws InterruptedException {
        chatServer.postMessage(this, to, msg);
    }

    public void receiveMessage(Employee from){
        System.out.println(this.name + " has read " + from.getName() + "'s message now.");
    }
}
