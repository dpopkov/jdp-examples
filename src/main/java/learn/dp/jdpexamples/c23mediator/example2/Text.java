package learn.dp.jdpexamples.c23mediator.example2;

class Text {

    private final String color;

    Text(ChatServer chatServer, String color) {
        this.color = color;
        chatServer.registerText(this);
    }

    public void makeDefaultColor() {
        System.out.println("Message text has a default color: " + color);
    }

    public void makeBlueText() {
        System.out.println("*** Message text becomes blue. ***\n");
    }
}
